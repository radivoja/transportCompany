package com.qinshift.transportCompany.repository;

import com.qinshift.transportCompany.entity.TruckEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TruckRepository extends JpaRepository<TruckEntity, Integer> {
    List<TruckEntity> findTrucksByGoodsId(Integer id);
}
