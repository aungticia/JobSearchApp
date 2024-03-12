package com.example.JobSearchApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "users") // For different Table name in the Database(users)
public class User {

    @Id
    private int id;
    private String username;
    private String password;

}
