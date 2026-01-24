package com.CocOgreen.CenFra.MS.mapper;

import com.CocOgreen.CenFra.MS.dto.SupplierDTO;
import com.CocOgreen.CenFra.MS.entity.Supplier;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SupplierMapper extends GenericMapper<Supplier, SupplierDTO> {
    // Không cần viết gì thêm, GenericMapper đã lo hết
}