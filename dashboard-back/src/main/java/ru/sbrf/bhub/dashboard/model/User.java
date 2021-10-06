package ru.sbrf.bhub.dashboard.model;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@SuperBuilder
public class User extends BaseEntity {

    @Column(name = "login", updatable = false, nullable = false)
    private String login;

    @ManyToMany(mappedBy = "users")
    private Set<Team> teams = new HashSet<>();

}
