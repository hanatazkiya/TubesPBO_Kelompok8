package com.example.tubes.repository;

import com.example.tubes.entity.StorageLocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StorageLocationRepository extends JpaRepository<StorageLocation, Integer> {
}
