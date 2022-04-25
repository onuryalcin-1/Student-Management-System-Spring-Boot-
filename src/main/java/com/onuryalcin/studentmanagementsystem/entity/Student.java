package com.onuryalcin.studentmanagementsystem.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tbl_student")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = {"id"})
@ToString
public class Student implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "FIRST_NAME",  nullable = false)
    private String firstName;

    @Column(name="LAST_NAME")
    private String lastName;

    @Column(name = "EMAIL")
    private String email;


}
