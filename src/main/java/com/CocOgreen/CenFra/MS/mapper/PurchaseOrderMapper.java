package com.CocOgreen.CenFra.MS.mapper;

import com.CocOgreen.CenFra.MS.dto.PurchaseOrderDTO;
import com.CocOgreen.CenFra.MS.entity.PurchaseOrder;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {PODetailMapper.class})
public interface PurchaseOrderMapper extends GenericMapper<PurchaseOrder, PurchaseOrderDTO> {

    @Mapping(source = "supplier.supplierId", target = "supplierId")
    @Mapping(source = "supplier.supplierName", target = "supplierName")
    @Mapping(source = "location.locationId", target = "locationId") // Giả sử Location có ID
    // @Mapping(source = "location.locationName", target = "locationName") // Nếu Location Entity có name
    @Mapping(source = "status.id", target = "orderStatusId")
    @Mapping(source = "status.code", target = "orderStatusCode")
    PurchaseOrderDTO toDto(PurchaseOrder entity);

    // Khi convert ngược về Entity, ta chỉ cần ID để Hibernate tự link (Reference)
    @Mapping(source = "supplierId", target = "supplier.supplierId")
    @Mapping(source = "locationId", target = "location.locationId")
    @Mapping(source = "orderStatusId", target = "status.id")
    PurchaseOrder toEntity(PurchaseOrderDTO dto);
}