package com.CocOgreen.CenFra.MS.dto;

//import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.time.LocalDateTime;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class PurchaseOrderDTO extends BaseDTO {
    private Integer poId;

    //@NotNull(message = "Phải chọn nhà cung cấp")
    private Integer supplierId;
    private String supplierName; // Để hiển thị (Read-only)

    //@NotNull(message = "Phải chọn kho nhập")
    private Integer locationId;
    private String locationName; // Để hiển thị

    private LocalDateTime orderDate;

    private Integer orderStatusId;
    private String orderStatusCode;

    // Danh sách chi tiết
    private List<PODetailDTO> details;
}