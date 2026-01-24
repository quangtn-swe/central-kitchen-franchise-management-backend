package com.CocOgreen.CenFra.MS.mapper;

import com.CocOgreen.CenFra.MS.dto.GoodsReceiptDetailDTO;
import com.CocOgreen.CenFra.MS.entity.GoodsReceiptDetail;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface GoodsReceiptDetailMapper extends GenericMapper<GoodsReceiptDetail, GoodsReceiptDetailDTO> {

    @Mapping(source = "item.itemId", target = "itemId")
    @Mapping(source = "item.itemName", target = "itemName")
    GoodsReceiptDetailDTO toDto(GoodsReceiptDetail entity);

    @Mapping(source = "itemId", target = "item.itemId")
    GoodsReceiptDetail toEntity(GoodsReceiptDetailDTO dto);
}