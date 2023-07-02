package com.geekster.UmsValidation.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UmsModel {
    @NotNull
    private Integer userId;
    @NotBlank
    private String userName;
    @Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}", message = "Date of Birth should be in the format yyyy-MM-dd")
    private String dateOfBirth;
    @Email(message = "This Email is Not Valid")
    private String email;
    @Pattern(regexp = "\\d{2}\\d{10}", message = "Phone number should be in the format CCXXXXXXXXXX (CC is country code)")
    private String phoneNumber;
    private LocalDate dateOfJoining;  //2007-12-03
    private LocalTime timeOfJoining;

}