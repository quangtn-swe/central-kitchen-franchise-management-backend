package com.CocOgreen.CenFra.MS.mapper;

import com.CocOgreen.CenFra.MS.dto.PODetailDTO;
import com.CocOgreen.CenFra.MS.entity.PODetail;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PODetailMapper extends GenericMapper<PODetail, PODetailDTO> {
    //@Mapping ở dưới dùng để map các khóa ngoại, nếu không có thì khi map có khóa ngoại sẽ bị null
    @Mapping(source = "item.itemId", target = "itemId")
    @Mapping(source = "item.itemName", target = "itemName")
    @Mapping(source = "item.sku", target = "itemSku")
    PODetailDTO toDto(PODetail entity);

    @Mapping(source = "itemId", target = "item.itemId")
    PODetail toEntity(PODetailDTO dto);
}