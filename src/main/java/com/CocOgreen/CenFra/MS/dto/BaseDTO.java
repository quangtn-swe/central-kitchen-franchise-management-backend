package com.CocOgreen.CenFra.MS.dto;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public abstract class BaseDTO {//Class này dùng chung cho các class khác
    private Boolean isDeleted;
    private LocalDateTime createdAt;
    private Integer createdBy;
    private LocalDateTime modifiedAt;
    private Integer modifiedBy;
}