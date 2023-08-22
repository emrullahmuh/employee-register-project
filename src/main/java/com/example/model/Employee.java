package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Employee {
    private String firstName;
    private String lastName;
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private LocalDate birthDay;
    private String email;
    private String passWord;
    private String address;
    private String  address2;
    private String city;
    private String state;
    private String zip;
}

