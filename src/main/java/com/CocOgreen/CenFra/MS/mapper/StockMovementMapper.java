package com.CocOgreen.CenFra.MS.mapper;

import com.CocOgreen.CenFra.MS.dto.StockMovementDTO;
import com.CocOgreen.CenFra.MS.entity.StockMovement;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface StockMovementMapper extends GenericMapper<StockMovement, StockMovementDTO> {

    @Mapping(source = "movementType.code", target = "movementTypeCode")
    @Mapping(source = "item.itemId", target = "itemId")
    @Mapping(source = "item.itemName", target = "itemName")
    @Mapping(source = "item.sku", target = "itemSku")
    @Mapping(source = "fromLocation.locationId", target = "fromLocationId")
    @Mapping(source = "toLocation.locationId", target = "toLocationId")
    StockMovementDTO toDto(StockMovement entity);

    // Stock Movement thường chỉ Read-only hoặc tạo mới thông qua logic Service
    // nên phần mapping toEntity có thể đơn giản hóa hoặc bỏ qua các trường reference name
    @Mapping(source = "itemId", target = "item.itemId")
    @Mapping(source = "fromLocationId", target = "fromLocation.locationId")
    @Mapping(source = "toLocationId", target = "toLocation.locationId")
    StockMovement toEntity(StockMovementDTO dto);
}