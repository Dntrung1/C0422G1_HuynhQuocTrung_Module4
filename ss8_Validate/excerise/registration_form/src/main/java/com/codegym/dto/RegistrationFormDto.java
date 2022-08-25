package com.codegym.dto;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.time.Period;

public class RegistrationFormDto implements Validator {
    @NotBlank(message = "\n" +
            "Please enter")
    @Size(min = 5, max = 45, message = "The smallest is 5 and the largest is 45")
    private String firstName;
    @NotBlank(message = "\n" +
            "Please enter")
    @Size(min = 5, max = 45, message = "The smallest is 5 and the largest is 45")
    private String lastName;
    @Pattern(regexp = "[0-9]{11}", message = "11-digit phone number")
    @NotBlank
    private String phone;
    @NotBlank
    private String birthday;
    @Email
    @NotBlank
    private String email;

    public RegistrationFormDto() {
    }

    public RegistrationFormDto(String firstName, String lastName, String phone, String birthday, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.birthday = birthday;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        RegistrationFormDto registrationFormDto = (RegistrationFormDto) target;
        LocalDate localDate = LocalDate.now();
        if (birthday != null) {
            LocalDate birthDay = LocalDate.parse(registrationFormDto.getBirthday());
            int age = Period.between(localDate, birthDay).getYears();
            if (age < 18) {
                errors.rejectValue("birthday", "birthday", "\n" +
                        "your age must be over 18");
            }
        }
    }
}
