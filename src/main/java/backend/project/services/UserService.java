package backend.project.services;

import backend.project.dtos.UserRolDTO;
import backend.project.entities.User;

import java.util.List;

public interface UserService {
    public Integer insert(User user);
    public void actualizar(User user);
    List<User> list();
    public void delete(Long id);
    public User listId(Long id);
    public User listUsername(String name);
    public List<UserRolDTO> reporte08();
}
