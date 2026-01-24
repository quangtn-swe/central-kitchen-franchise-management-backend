package com.CocOgreen.CenFra.MS.dto;

import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class GoodsReceiptDTO {
    private Integer grnId;

    private Integer poId; // Reference về đơn đặt hàng
    private LocalDateTime receiptDate;

    private Integer receivedBy; // User ID
    private String receivedByName;

    private LocalDateTime createdAt;

    private List<GoodsReceiptDetailDTO> details;
}