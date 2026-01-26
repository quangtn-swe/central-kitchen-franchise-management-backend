package com.CocOgreen.CenFra.MS.mapper;

import com.CocOgreen.CenFra.MS.dto.TransferOrderDTO;
import com.CocOgreen.CenFra.MS.entity.TransferOrder;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {TransferDetailMapper.class})
public interface TransferOrderMapper extends GenericMapper<TransferOrder, TransferOrderDTO> {

    @Mapping(source = "fromLocation.locationId", target = "fromLocationId")
    // @Mapping(source = "fromLocation.locationName", target = "fromLocationName")
    @Mapping(source = "toLocation.locationId", target = "toLocationId")
    // @Mapping(source = "toLocation.locationName", target = "toLocationName")
    @Mapping(source = "status.id", target = "orderStatusId")
    @Mapping(source = "status.code", target = "orderStatusCode")
    TransferOrderDTO toDto(TransferOrder entity);

    @Mapping(source = "fromLocationId", target = "fromLocation.locationId")
    @Mapping(source = "toLocationId", target = "toLocation.locationId")
    @Mapping(source = "orderStatusId", target = "status.id")
    TransferOrder toEntity(TransferOrderDTO dto);
}