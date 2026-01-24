package com.CocOgreen.CenFra.MS.dto;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class TransferDetailDTO {
    private Integer detailId;
    private Integer itemId;
    private String itemName;

    private BigDecimal reqQty;      // Yêu cầu
    private BigDecimal shipQty;     // Thực xuất
    private BigDecimal receivedQty; // Thực nhận
}