package samsung.abitpro.service;

import samsung.abitpro.model.User;

import java.util.List;

public interface UserService {
    List<User>getAllUsers();
    User getUserById(long id);
    User createUser(User user);
    User updateUser(long id, User user);
    void deleteUser(long id);
    List<User>searchUsersByName(String fullName);
}
