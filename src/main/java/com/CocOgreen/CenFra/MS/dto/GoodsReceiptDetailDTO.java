package com.CocOgreen.CenFra.MS.dto;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class GoodsReceiptDetailDTO {
    private Integer detailId;
    private Integer itemId;
    private String itemName;

    private BigDecimal quantity;     // Số thực nhập
    private BigDecimal price;        // Giá tại thời điểm nhập
    private BigDecimal totalAmount;
}