package com.CocOgreen.CenFra.MS.dto;

import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class StockMovementDTO {
    private Long movementId;

    private String movementTypeCode; // IN, OUT, TRANSFER...

    private Integer itemId;
    private String itemName;
    private String itemSku;

    private Integer fromLocationId;
    private String fromLocationName;

    private Integer toLocationId;
    private String toLocationName;

    private BigDecimal quantity;

    private String refType; // PO, GRN
    private Integer refId;  // ID chứng từ

    private LocalDateTime createdAt;
    private Integer createdBy;
}