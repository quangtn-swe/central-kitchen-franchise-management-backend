package com.CocOgreen.CenFra.MS.entity;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class TransferDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "detail_id")
    private Integer detailId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    @JsonIgnore
    private TransferOrder transferOrder;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id")
    private Item item;

    @Column(name = "req_qty", precision = 18, scale = 4)
    private BigDecimal reqQty;

    @Column(name = "ship_qty", precision = 18, scale = 4)
    private BigDecimal shipQty;

    @Column(name = "received_qty", precision = 18, scale = 4)
    private BigDecimal receivedQty;
}