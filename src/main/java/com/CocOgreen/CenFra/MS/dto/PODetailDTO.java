package com.CocOgreen.CenFra.MS.dto;

//import jakarta.validation.constraints.Min;
//import jakarta.validation.constraints.NotNull;
import lombok.Data;
import java.math.BigDecimal;

@Data
public class PODetailDTO {
    private Integer detailId;

    // Không cần poId ở đây vì nó nằm trong list của cha rồi

    //@NotNull(message = "Phải chọn mặt hàng")
    private Integer itemId;
    private String itemName; // Để hiển thị
    private String itemSku;  // Để hiển thị

    //@NotNull
    //@Min(value = 0, message = "Số lượng phải lớn hơn 0")
    private BigDecimal quantity;

    //@Min(value = 0, message = "Giá không được âm")
    private BigDecimal price;

    private BigDecimal totalAmount; // Read-only (Database tự tính)
}