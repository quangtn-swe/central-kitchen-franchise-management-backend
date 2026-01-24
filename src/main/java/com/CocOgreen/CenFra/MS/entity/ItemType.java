package com.CocOgreen.CenFra.MS.entity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class ItemType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer itemTypeId;

    @Column(length = 50, nullable = false, unique = true)
    private String code;
}
