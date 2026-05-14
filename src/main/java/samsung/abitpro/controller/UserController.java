package samsung.abitpro.controller;

import org.springframework.web.bind.annotation.*;
import samsung.abitpro.model.User;
import samsung.abitpro.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/users")

public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
    @GetMapping("/{id}")
    public User getUserById(@PathVariable long id){
        return userService.getUserById(id);
    }
    @PostMapping
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }
    @PutMapping("/{id}")
    public User updateUser(@PathVariable long id,@RequestBody User user){
        return userService.updateUser(id, user);
    }
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable long id){
        userService.deleteUser(id);
    }
    @GetMapping("/search")
    public List<User>searchUsersByName(@RequestParam String name){
        return userService.searchUsersByName(name);
    }
}
