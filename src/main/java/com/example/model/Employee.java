package com.example.model;

import jakarta.validation.constraints.*;
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
   // @NotNull -->fild shouldnt be null
    //@NotBlank -->fild shouldnt be ""
    //@NotEmpty -->fild should not be "       "

    // @NotNull -->@Notnull
    //@NotBlank -->@Notnull+@Notempty
    //@NotEmpty -->@Notnull+@Notempty+NotBlank

   @NotBlank
   @Size(max = 12,min = 2)
    private String firstName;
   private String lastName;
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private LocalDate birthDay;
    @NotBlank
    @Email
    private String email;
@NotBlank
@Pattern(regexp = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{4,}")
    private String passWord;
    private String address;
    private String  address2;
    private String city;
    private String state;
    private String zip;
}

