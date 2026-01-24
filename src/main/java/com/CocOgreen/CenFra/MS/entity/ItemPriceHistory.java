package com.CocOgreen.CenFra.MS.entity;
import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class ItemPriceHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer priceHistoryId;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;

    @Column(precision = 18, scale = 2, nullable = false)
    private BigDecimal price;

    private LocalDateTime effectiveFrom;

    private Integer createdBy;
}

