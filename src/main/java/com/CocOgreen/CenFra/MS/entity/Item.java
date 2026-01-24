package com.CocOgreen.CenFra.MS.entity;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Item extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer itemId;

    @Column(length = 100, nullable = false)
    private String itemName;

    @Column(length = 50, nullable = false, unique = true)
    private String sku;

    @ManyToOne
    @JoinColumn(name = "item_type_id")
    private ItemType itemType;

    @ManyToOne
    @JoinColumn(name = "unit_id")
    private Unit unit;

    @Column(precision = 18, scale = 4)
    private BigDecimal minStock;

    @Column
    private Integer shelfLifeDays;

    @Column
    private Boolean isDeleted = false;
}

