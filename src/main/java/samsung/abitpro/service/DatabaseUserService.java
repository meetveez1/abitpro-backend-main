package samsung.abitpro.service;

import org.springframework.stereotype.Service;
import samsung.abitpro.model.User;
import samsung.abitpro.repository.UserRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class DatabaseUserService implements UserService{
    private final UserRepository userRepository;

    public DatabaseUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(long id) {
        return userRepository.findById(id).orElseThrow();
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(long id, User user) {
        if (!userRepository.existsById(id)){
            throw new RuntimeException("User Not Found");
        }
        user.setId(id);
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(long id) {
        if (!userRepository.existsById(id)){
            throw new RuntimeException("User Not Found");
        }
        userRepository.deleteById(id);
    }

    @Override
    public List<User> searchUsersByName(String fullName) {
        return userRepository.findByFullNameContainingIgnoreCase(fullName);
    }
}
