package backend.project.services;

import backend.project.entities.User;

public interface UserService {
    public User addUser(User user);

    public User findByUsername(String userName);

    public void updateUser(User user);

    public void deleteUser(Long id);
}
