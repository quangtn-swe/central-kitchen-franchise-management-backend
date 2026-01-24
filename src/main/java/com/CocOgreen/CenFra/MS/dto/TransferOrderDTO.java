package com.CocOgreen.CenFra.MS.dto;

//import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.time.LocalDateTime;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class TransferOrderDTO extends BaseDTO {
    private Integer orderId;

    //@NotNull(message = "Phải có kho xuất")
    private Integer fromLocationId;
    private String fromLocationName;

    //@NotNull(message = "Phải có kho nhập")
    private Integer toLocationId;
    private String toLocationName;

    private Integer orderStatusId;
    private String orderStatusCode;

    private LocalDateTime deliveryDate;

    private List<TransferDetailDTO> details;
}