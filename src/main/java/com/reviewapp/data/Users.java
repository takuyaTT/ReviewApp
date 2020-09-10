package com.reviewapp.data;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "users")
@Data
public class Users implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "account_name")
    @NotNull
    private String accountName;

    @Column(name = "password")
    @NotNull
    private String password;

    @Column(name = "name")
    @NotNull
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "email")
    private String email;

    @OneToMany(mappedBy = "users")
    List<Review> reviewList;
}
