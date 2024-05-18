package com.example.UserManagment.Service.Impl;

import com.example.UserManagment.Dto.UserDTO;
import com.example.UserManagment.Dto.LoginDTO;
import com.example.UserManagment.Exception.ResourceNotFoundException;
import com.example.UserManagment.Mapper.UserMapper;
import com.example.UserManagment.Repo.UserRepo;
import com.example.UserManagment.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.UserManagment.Entity.User;
import com.example.UserManagment.Response.LoginResponse;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import java.sql.Date;

///import javax.annotation.Resource;
import java.util.Optional;
@Service
public class UserIMPL implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public String addUser(UserDTO userDTO) {

        User user = new User(
                userDTO.getUserid(),
                userDTO.getUsername(),
                userDTO.getEmail(),
                this.passwordEncoder.encode(userDTO.getPassword()),
                userDTO.getBio(),
                userDTO.getDateofbirth(),
                userDTO.getGender(),
                userDTO.getCountry(),
                userDTO.getHometown(),
                userDTO.getHeight(),
                userDTO.getWeight()
        );
        userRepo.save(user);
        return user.getUsername();
    }

    UserDTO userDTO;

    @Override
    public LoginResponse loginUser(LoginDTO loginDTO) {

        String msg = "";
        User user1 = userRepo.findByEmail(loginDTO.getEmail());
        if (user1 != null) {
            String password = loginDTO.getPassword();
            String encodedPassword = user1.getPassword();
            Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
            if (isPwdRight) {
                Optional<User> user = userRepo.findOneByEmailAndPassword(loginDTO.getEmail(), encodedPassword);
                if (user.isPresent()) {
                    return new LoginResponse("Login Success", true);
                } else {
                    return new LoginResponse("Login Failed", false);
                }
            } else {
                return new LoginResponse("password Not Match", false);
            }
        }else {
            return new LoginResponse("Email not exits", false);
        }

    }

    //read crud
    @Override
    public UserDTO getUserById(int userid) {

        User user =  userRepo.findById(userid)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Employee is not exist with given id : " + userid));

        return UserMapper.mapToUserDTO(user);
    }

    //Update crud
    @Override
    public UserDTO updateUser(int userid, UserDTO updatedUser) {

        User user = userRepo.findById(userid).orElseThrow(
                () -> new ResourceNotFoundException("User is not existswith given id : " + userid)
        );

        /*user.setUsername(updatedUser.getUsername());
        user.setEmail(updatedUser.getEmail());
        user.setPassword(updatedUser.getPassword());
        user.setBio(updatedUser.getBio());
        user.setDateofbirth(updatedUser.getDateofbirth());
        user.setGender(updatedUser.getGender());
        user.setCountry(updatedUser.getCountry());
        user.setHometown(updatedUser.getHometown());
        user.setHeight(updatedUser.getHeight());
        user.setWeight(updatedUser.getWeight());*/

        if (updatedUser.getUsername() != null) {
            user.setUsername(updatedUser.getUsername());
        }
        if (updatedUser.getEmail() != null) {
            user.setEmail(updatedUser.getEmail());
        }
        /*if (updatedUser.getPassword() != null) {
            user.setPassword(passwordEncoder.encode(updatedUser.getPassword()));
        }*/
        if (updatedUser.getBio() != null) {
            user.setBio(updatedUser.getBio());
        }
        if (updatedUser.getDateofbirth() != null) {
            user.setDateofbirth(updatedUser.getDateofbirth());
        }
        if (updatedUser.getGender() != null) {
            user.setGender(updatedUser.getGender());
        }
        if (updatedUser.getCountry() != null) {
            user.setCountry(updatedUser.getCountry());
        }
        if (updatedUser.getHometown() != null) {
            user.setHometown(updatedUser.getHometown());
        }
        if (updatedUser.getHeight() != null) {
            user.setHeight(updatedUser.getHeight());
        }
        if (updatedUser.getWeight() != null) {
            user.setWeight(updatedUser.getWeight());
        }


        User updatedUserObj = userRepo.save(user);

        return UserMapper.mapToUserDTO(updatedUserObj);
    }

    //delete
    @Override
    public void deleteUser(int userid) {

        User user = userRepo.findById(userid).orElseThrow(
                () -> new ResourceNotFoundException("User is not existswith given id : " + userid)
        );

        userRepo.deleteById(userid);

    }


}
