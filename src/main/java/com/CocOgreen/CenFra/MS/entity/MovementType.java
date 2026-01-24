package com.CocOgreen.CenFra.MS.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class MovementType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movement_type_id")
    private Integer movementTypeId;

    @Column(name = "code", unique = true, nullable = false)
    private String code;
}