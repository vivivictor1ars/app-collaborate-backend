package backend.project.serviceimpl;

import backend.project.entities.User;
import backend.project.repositories.UserRepository;
import backend.project.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User findByUsername(String userName) {
        User userFound = userRepository.findByUsername(userName);
        return userFound;
    }

    @Override
    public void updateUser(User user) {
        User userFound = userRepository.findByUsername(user.getUsername());
        if (userFound != null) {
            userRepository.save(user);
        }
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
