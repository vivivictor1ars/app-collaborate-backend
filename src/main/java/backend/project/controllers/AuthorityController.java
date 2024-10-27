package backend.project.controllers;

import backend.project.dtos.RoleDTO;
import backend.project.entities.Authority;
import backend.project.services.AuthorityService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@SessionAttributes
@RequestMapping("/roles")
public class AuthorityController {
    @Autowired
    private AuthorityService rS;

    @PostMapping
    public void insert(@RequestBody RoleDTO dto){
        ModelMapper m = new ModelMapper();
        Authority e = m.map(dto, Authority.class);
        rS.insert(e);
    }

    @GetMapping
    public List<RoleDTO> list(){
        return rS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, RoleDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public RoleDTO ListId(@PathVariable("id")Long id){
        ModelMapper m = new ModelMapper();
        RoleDTO dto = m.map(rS.ListId(id), RoleDTO.class);
        return dto;
    }
    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void goUpdate(@RequestBody RoleDTO dto){
        ModelMapper m = new ModelMapper();
        Authority e = m.map(dto, Authority.class);
        rS.insert(e);
    }
}
