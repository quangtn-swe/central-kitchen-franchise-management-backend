package com.CocOgreen.CenFra.MS.dto;

//import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class SupplierDTO extends BaseDTO {
    private Integer supplierId;

    //@NotBlank(message = "Tên nhà cung cấp không được để trống")
    private String supplierName;

    private String phone;
    private String address;
}