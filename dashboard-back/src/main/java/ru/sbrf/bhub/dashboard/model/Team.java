package ru.sbrf.bhub.dashboard.model;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@SuperBuilder
public class Team extends BaseEntity {

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "Team_User",
            joinColumns = { @JoinColumn(name = "team_id") },
            inverseJoinColumns = { @JoinColumn(name = "user_id") }
    )
    Set<User> users = new HashSet<>();
}
