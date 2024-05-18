package com.example.UserManagment.Mapper;


import com.example.UserManagment.Dto.UserDTO;
import com.example.UserManagment.Entity.User;

public class UserMapper {

    public static UserDTO mapToUserDTO(User user){
        return new UserDTO(
        user.getUserid(),
        user.getUsername(),
        user.getEmail(),
        user.getPassword(),
        user.getBio(),
        user.getDateofbirth(),
        user.getGender(),
        user.getCountry(),
        user.getHometown(),
        user.getHeight(),
        user.getWeight()
        );
    }

    public static User mapToUser(UserDTO userDTO){
        return new User(
                userDTO.getUserid(),
                userDTO.getUsername(),
                userDTO.getEmail(),
                userDTO.getPassword(),
                userDTO.getBio(),
                userDTO.getDateofbirth(),
                userDTO.getGender(),
                userDTO.getCountry(),
                userDTO.getHometown(),
                userDTO.getHeight(),
                userDTO.getWeight()

        );
    }

}
