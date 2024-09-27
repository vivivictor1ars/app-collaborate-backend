package backend.project.services;

import backend.project.entities.Role;

import java.util.List;

public interface IRoleService {
    public void insert(Role role);

    List<Role> list();

    public Role ListId(long id);
}
