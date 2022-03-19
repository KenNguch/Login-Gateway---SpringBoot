package manaal_ventures.com.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
//http://localhost:8080/api/user/
public class UserController {

    @GetMapping
    public String getUser() {
        return "get user was called successfully";
    }

    @PostMapping
    public String createUser() {
        return "create user was called successfully";
    }


    @PutMapping
    public String updateUser() {
        return "update user was called successfully";
    }

    @DeleteMapping
    public String deleteUser() {
        return "delete user was called successfully";
    }

    // Todo : Try Patch Methods
}

