package com.example.msbookspayments.msbookspayments.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.msbookspayments.msbookspayments.model.Purchase;
import com.example.msbookspayments.msbookspayments.request.PurchaseRequest;
import com.example.msbookspayments.msbookspayments.service.PurchaseService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/purchases")
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping(value = "/insert")
    public ResponseEntity<Purchase> createPurchase(@RequestBody PurchaseRequest request) {
        System.out.println("Recibida solicitud POST con datos: " + request.toString());
        Purchase purchase = purchaseService.processPurchase(request);
        return new ResponseEntity<>(purchase, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Purchase>> getAllPurchases() {
        List<Purchase> purchases = purchaseService.getAllPurchases();
        return new ResponseEntity<>(purchases, HttpStatus.OK);
    }

    
}
