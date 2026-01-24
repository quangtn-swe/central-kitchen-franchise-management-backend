package com.CocOgreen.CenFra.MS.mapper;

import com.CocOgreen.CenFra.MS.dto.MovementTypeDTO;
import com.CocOgreen.CenFra.MS.entity.MovementType;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MovementTypeMapper extends GenericMapper<MovementType, MovementTypeDTO> {
    // Vì MovementType và MovementTypeDTO có cấu trúc phẳng và trùng tên (id, code)
    // nên không cần viết lại bất kỳ hàm @Mapping nào ở đây cả.
}