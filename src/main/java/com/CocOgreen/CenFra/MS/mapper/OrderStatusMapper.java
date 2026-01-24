package com.CocOgreen.CenFra.MS.mapper;

import com.CocOgreen.CenFra.MS.dto.OrderStatusDTO;
import com.CocOgreen.CenFra.MS.entity.OrderStatus;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderStatusMapper extends GenericMapper<OrderStatus, OrderStatusDTO> {
}