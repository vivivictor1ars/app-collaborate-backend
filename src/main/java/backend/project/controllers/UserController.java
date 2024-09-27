package backend.project.controllers;

import backend.project.dtos.UserDTO;
import backend.project.entities.User;
import backend.project.services.IUserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private PasswordEncoder bcrypt;
    @Autowired
    private IUserService uS;



    @GetMapping
    public List<UserDTO> list(){
        return uS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, UserDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void delete(@PathVariable("id")long id){
        uS.delete(id);
    }
    @GetMapping("/{id}")
    public UserDTO ListId(@PathVariable("id")long id){
        ModelMapper m = new ModelMapper();
        UserDTO dto = m.map(uS.listId(id), UserDTO.class);
        return dto;
    }
    @GetMapping("/username/{username}")
    public UserDTO ListUsername(@PathVariable("username")String name){
        ModelMapper m = new ModelMapper();
        UserDTO dto = m.map(uS.listUsername(name), UserDTO.class);
        return dto;
    }
    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('ESTUDIANTE') or hasAuthority('RECLUTADOR')")
    public void goUpdate(@RequestBody UserDTO dto){
        ModelMapper m = new ModelMapper();
        User u = m.map(dto, User.class);
        uS.actualizar(u);
    }

    @PostMapping
    public String saveUser(@Valid User User, BindingResult result, Model model, SessionStatus status, @RequestBody UserDTO dto)
            throws Exception {
        if (result.hasErrors()) {
            return "usersecurity/user";
        } else {
            ModelMapper m = new ModelMapper();
            User u = m.map(dto, User.class);
            String bcryptPassword = bcrypt.encode(u.getContrasena_User());
            u.setContrasena_User(bcryptPassword);
            uS.insert(u);
            return "User creado";
        }
    }

    @GetMapping("/list")
    public String listUser(Model model) {
        try {
            model.addAttribute("user", new User());
            model.addAttribute("listaUsers", uS.list());
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
        }
        return "usersecurity/listUser";
    }
    @GetMapping("/Usersporrol")
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('ESTUDIANTE') or hasAuthority('RECLUTADOR')")
    public List<UserRolDTO> Usersporrol() {
        List<UserRolDTO> UserRolDTO = uS.reporte08();
        return UserRolDTO;
    }
}
