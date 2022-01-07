package com.hogwarts.institute.Model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "student_tbl")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fname", nullable = false)
    private String firstName;
    @Column(name = "lname", nullable = false)
    private String lastName;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "phone", nullable = false)
    private String phone;
    @Column(name = "course", nullable = false)
    private String course;
    @Column(length = 60, nullable = false)
    private String country;
    @Column(length = 60, nullable = false)
    private String state;
    @Column(name = "address", length = 400, nullable = false)
    private String address;



}

