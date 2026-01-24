package com.CocOgreen.CenFra.MS.repository;

import com.CocOgreen.CenFra.MS.entity.OrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderStatusRepository extends JpaRepository<OrderStatus, Integer> {
}