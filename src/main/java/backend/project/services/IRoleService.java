package backend.project.services;

import backend.project.entities.Authority;

import java.util.List;

public interface IRoleService {
    public void insert(Authority authority);

    List<Authority> list();

    public Authority ListId(long id);
}
