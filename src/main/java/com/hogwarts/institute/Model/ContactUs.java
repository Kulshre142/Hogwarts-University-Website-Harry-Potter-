package com.hogwarts.institute.Model;


import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "enquires")
public class ContactUs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false)
//    @NotBlank(message = "First name cannot be null or blank")
    private String fName;
    @Column(name = "last_name", nullable = false)
//    @NotBlank(message = "Last name cannot be null or blank")
    private String lName;
    @Column(name = "email", nullable = false)
//    @Email(message = "Invalid email id")
    private String email;
    @Column(name = "phone", nullable = false)
//    @Size(min = 10, max = 10, message = "Invalid phone number")
    private String phone;
    @Column(name = "message", nullable = false, length = 1000)
//    @NotBlank
    private String message;

}

