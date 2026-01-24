package com.CocOgreen.CenFra.MS.repository;

import com.CocOgreen.CenFra.MS.entity.MovementType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovementTypeRepository extends JpaRepository<MovementType, Integer> {
}