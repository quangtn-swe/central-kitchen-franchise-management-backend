package com.CocOgreen.CenFra.MS.entity;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(
        name = "Inventory",
        uniqueConstraints = @UniqueConstraint(
                columnNames = {"location_id", "item_id", "batch_code", "exp_date"}
        )
)
@Getter @Setter
public class Inventory extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer inventoryId;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;

    @Column(precision = 18, scale = 4)
    private BigDecimal quantity;

    @Column(length = 50, nullable = false)
    private String batchCode;

    @Column
    private LocalDate expDate;

    @Column(columnDefinition = "DATETIME2")
    private LocalDateTime lastUpdated;
}

