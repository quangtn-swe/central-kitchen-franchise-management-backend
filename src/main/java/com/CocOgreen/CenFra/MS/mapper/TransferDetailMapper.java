package com.CocOgreen.CenFra.MS.mapper;

import com.CocOgreen.CenFra.MS.dto.TransferDetailDTO;
import com.CocOgreen.CenFra.MS.entity.TransferDetail;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TransferDetailMapper extends GenericMapper<TransferDetail, TransferDetailDTO> {

    @Mapping(source = "item.itemId", target = "itemId")
    @Mapping(source = "item.itemName", target = "itemName")
    TransferDetailDTO toDto(TransferDetail entity);

    @Mapping(source = "itemId", target = "item.itemId")
    TransferDetail toEntity(TransferDetailDTO dto);
}