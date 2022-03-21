package manaal_ventures.com.ui.controller;

import manaal_ventures.com.model.request.UserRequestModel;
import manaal_ventures.com.model.response.UserResponseModel;
import manaal_ventures.com.shared.dto.UserDto;
import manaal_ventures.com.ui.service.implementation.UserServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")//http://localhost:8080/api/v1/user/
public class UserController {

    @Autowired
    UserServiceImpl userServiceImpl;

    @PostMapping
    public UserResponseModel createUser(@RequestBody UserRequestModel userRequestModel) {
        UserResponseModel returnValue = new UserResponseModel();
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(userRequestModel, userDto);


        UserDto createUser = userServiceImpl.createUser(userDto);
        BeanUtils.copyProperties(createUser, returnValue);

        return returnValue;
    }

    @GetMapping
    public String getUser() {
        return "get user was called successfully";
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
    // Todo : Connect Original DB and Test DB
}

