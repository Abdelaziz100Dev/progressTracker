package org.progress.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

@Component
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    String name ;
    String password ;

    public User() {
    }

    public User( String name,String password) {
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return "NAME :" + name;
    }
}

