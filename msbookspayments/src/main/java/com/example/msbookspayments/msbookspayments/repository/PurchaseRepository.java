package com.example.msbookspayments.msbookspayments.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.msbookspayments.msbookspayments.model.Purchase;

public interface PurchaseRepository extends JpaRepository<Purchase, Long> {
}

