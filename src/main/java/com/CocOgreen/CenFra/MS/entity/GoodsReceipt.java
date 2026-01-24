package com.CocOgreen.CenFra.MS.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "goods_receipt")
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class GoodsReceipt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "grn_id")
    private Integer grnId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "po_id")
    private PurchaseOrder purchaseOrder;

    @Column(name = "receipt_date")
    private LocalDateTime receiptDate;

    @Column(name = "received_by")
    private Integer receivedBy;

    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @Version
    @Column(name = "ver")
    private byte[] ver;

    @OneToMany(mappedBy = "goodsReceipt", cascade = CascadeType.ALL)
    private List<GoodsReceiptDetail> details;
}