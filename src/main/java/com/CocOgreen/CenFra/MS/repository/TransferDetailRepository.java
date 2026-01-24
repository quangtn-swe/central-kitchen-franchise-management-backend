package com.CocOgreen.CenFra.MS.repository;

import com.CocOgreen.CenFra.MS.entity.TransferDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransferDetailRepository extends JpaRepository<TransferDetail, Integer> {
}