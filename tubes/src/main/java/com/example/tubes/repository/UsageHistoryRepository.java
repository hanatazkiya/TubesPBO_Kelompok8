package com.example.tubes.repository;

import com.example.tubes.entity.UsageHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsageHistoryRepository extends JpaRepository<UsageHistory, Integer> {
}
