package com.example.msbookspayments.msbookspayments.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.msbookspayments.msbookspayments.model.Purchase;
import com.example.msbookspayments.msbookspayments.repository.PurchaseRepository;
import com.example.msbookspayments.msbookspayments.request.PurchaseRequest;

@Service
public class PurchaseService {

    @Autowired
    private PurchaseRepository purchaseRepository;

    public Purchase processPurchase(PurchaseRequest request) {
        Purchase purchase = new Purchase();
        purchase.setBookTitle(request.getBookTitle());

        return purchaseRepository.save(purchase);
    }

    public List<Purchase> getAllPurchases() {
        return purchaseRepository.findAll();
    }
}

