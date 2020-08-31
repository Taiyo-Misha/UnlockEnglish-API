package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
public class User {
    private int id;

    private String name;

    private String avatar;

    private String phoneNumber;

    private String soCMND;

    private String ngaysinh;

    private String mail;

    private String gender;

    private String address;
}
