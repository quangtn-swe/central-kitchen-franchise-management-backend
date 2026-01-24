package com.CocOgreen.CenFra.MS.mapper;

import com.CocOgreen.CenFra.MS.dto.GoodsReceiptDTO;
import com.CocOgreen.CenFra.MS.entity.GoodsReceipt;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {GoodsReceiptDetailMapper.class})
public interface GoodsReceiptMapper extends GenericMapper<GoodsReceipt, GoodsReceiptDTO> {

    @Mapping(source = "purchaseOrder.poId", target = "poId")
    GoodsReceiptDTO toDto(GoodsReceipt entity);

    @Mapping(source = "poId", target = "purchaseOrder.poId")
    GoodsReceipt toEntity(GoodsReceiptDTO dto);
}