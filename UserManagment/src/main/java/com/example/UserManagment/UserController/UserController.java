package com.example.UserManagment.UserController;

import com.example.UserManagment.Dto.UserDTO;
import com.example.UserManagment.Dto.LoginDTO;
import com.example.UserManagment.Service.UserService;
import com.example.UserManagment.Response.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;
    @PostMapping(path = "/save")
    public String saveUser(@RequestBody UserDTO userDTO)
    {
        String id = userService.addUser(userDTO);
        return id;
    }
    @PostMapping(path = "/login")
    public ResponseEntity<?> loginUser(@RequestBody LoginDTO loginDTO)
    {
        LoginResponse loginResponse = userService.loginUser(loginDTO);
        return ResponseEntity.ok(loginResponse);
    }

    //Build Get User rest API
    @GetMapping("{id}")
    public ResponseEntity<UserDTO> getUserById(@PathVariable("id") int userid){
        UserDTO userDTO = userService.getUserById(userid);
        return ResponseEntity.ok(userDTO);
    }

    //Build Update User REST API
    @PutMapping("{id}")
    public ResponseEntity<UserDTO> updateUser(@PathVariable("id") int userid, @RequestBody UserDTO updatedUser){
        UserDTO userDTO = userService.updateUser(userid, updatedUser);
        return ResponseEntity.ok(updatedUser);
    }


    //Build Delete user REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id")int userid){
        userService.deleteUser(userid);
        return ResponseEntity.ok("User deleted successfully!.");
    }

}

