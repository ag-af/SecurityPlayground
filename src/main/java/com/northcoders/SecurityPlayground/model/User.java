package com.northcoders.SecurityPlayground.model;


import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    public User(Long id, String name, String githubUsername) {
        this.id = id;
        this.name = name;
        this.githubUsername = githubUsername;
    }

    @Id
        @GeneratedValue
        @Column(updatable = false, nullable = false)
        Long id;

        @Column
        String name;

        @Column
        String githubUsername;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGithubUsername() {
        return githubUsername;
    }

    public void setGithubUsername(String githubUsername) {
        this.githubUsername = githubUsername;
    }
}

