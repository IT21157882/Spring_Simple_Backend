package com.example.UserManagment.Service;

import com.example.UserManagment.Dto.UserDTO;
import com.example.UserManagment.Dto.LoginDTO;
import com.example.UserManagment.Response.LoginResponse;
public interface UserService {

    String addUser(UserDTO userDTO);
    LoginResponse loginUser(LoginDTO loginDTO);

    UserDTO getUserById(int userid);

    //Update
    UserDTO updateUser(int userid, UserDTO updatedUser);

    //delete
    void deleteUser(int userid);

}
