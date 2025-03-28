package document.uploader.backend.controller;

import document.uploader.backend.model.UserModel;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @GetMapping("/user/{id}")
    String getUser(@PathVariable String id) {
        return "Returns user";
    }
    @PatchMapping("/user/{id}")
    String patchUser(@PathVariable String id) {
        return "Updated user with id = "+id;
    }
    @PutMapping("/user/{id}")
    String putUser(@PathVariable String id) {
        return "Updated user with id = "+id;
    }
    @PostMapping("/user")
    String postUser(@RequestBody UserModel userModel) {
        return "Made a user";
    }
    @DeleteMapping("/user/{id}")
    String deleteUser(@PathVariable String id) {
        return "Deleted user with id = "+id;
    }
}
