package backend.project.serviceimpl;

import backend.project.entities.User;
import backend.project.repositories.UserRepository;
import backend.project.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository uR;
    @Override
    public Integer insert(User user) {

        int rpta = uR.buscarUsername(user.getUsername());
        if (rpta == 0) {
            uR.save(user);
        }
        return rpta;
    }

    @Override
    public void actualizar(User user) {
        int rpta = uR.buscarUsername(user.getUsername());
        if (rpta != 0) {
            uR.save(user);
        }
    }

    @Override
    public List<User> list() {
        return uR.findAll();
    }

    @Override
    public void delete(Long id) {
        uR.deleteById(id);
    }

    @Override
    public User listId(Long idUsuario) {
        return uR.findById(idUsuario).orElse(new User());
    }

    @Override
    public User listUsername(String name) {
        return uR.findByUsername(name);
    }

    @Override
    public List<UserRolDTO> reporte08() {
        List<String[]> usuariosporrol = uR.usersporrol();
        List<UserRolDTO> UsuarioRolDTOs = new ArrayList<>();

        for (String[] data : usuariosporrol) {
            UserRolDTO dto = new UserRolDTO();
            dto.setRol(data[1]);
            dto.setCountusuarios(Integer.parseInt(data[0]));
            UsuarioRolDTOs.add(dto);
        }

        return UsuarioRolDTOs;
    }
}
