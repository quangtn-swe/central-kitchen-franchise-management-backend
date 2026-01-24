package com.CocOgreen.CenFra.MS.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Users")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Users extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    @Column(length = 50, nullable = false, unique = true)
    private String username;

    @Column(columnDefinition = "VARBINARY(512)")
    private byte[] passwordHash;

    @Column(length = 100)
    private String fullName;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;

    @Column
    private Boolean isDeleted = false;
}

