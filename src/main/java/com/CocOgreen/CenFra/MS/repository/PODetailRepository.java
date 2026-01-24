package com.CocOgreen.CenFra.MS.repository;

import com.CocOgreen.CenFra.MS.entity.PODetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PODetailRepository extends JpaRepository<PODetail, Integer> {
}