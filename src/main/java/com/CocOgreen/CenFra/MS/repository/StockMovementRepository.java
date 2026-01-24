package com.CocOgreen.CenFra.MS.repository;

import com.CocOgreen.CenFra.MS.entity.StockMovement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockMovementRepository extends JpaRepository<StockMovement, Long> {
}