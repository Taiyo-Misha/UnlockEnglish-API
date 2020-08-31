package com.example.demo.model.mapper;


import com.example.demo.entity.User;
import com.example.demo.model.dto.UserDto;

public class UserMapper {
    public static UserDto toUserDto(User user){
        UserDto tmp = new UserDto();
        tmp.setId(user.getId());
        tmp.setName(user.getName());
        tmp.setAvatar(user.getAvatar());
        tmp.setPhoneNumber(user.getPhoneNumber());
        tmp.setSoCMND(user.getSoCMND());
        tmp.setNgaysinh(user.getNgaysinh());
        tmp.setMail(user.getMail());
        tmp.setGender(user.getGender());
        tmp.setAddress(user.getAddress());

        return tmp;

    }
}
