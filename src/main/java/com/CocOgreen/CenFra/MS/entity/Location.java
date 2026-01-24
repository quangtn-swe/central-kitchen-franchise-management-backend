package com.CocOgreen.CenFra.MS.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Location extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer locationId;

    @Column(length = 100, nullable = false)
    private String locationName;

    @ManyToOne
    @JoinColumn(name = "location_type_id")
    private LocationType locationType;

    @Column
    private String address;

    @Column
    private String phone;

    @Column
    private Boolean isDeleted = false;

}
