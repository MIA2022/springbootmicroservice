package com.example.inventory_service.service;

import com.example.inventory_service.repository.InventoryRepository;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InventoryService {

    private final InventoryRepository inventoryRepository;

    @Transactional(readOnly = true)
    public boolean isInStock(String skuCode){
        return inventoryRepository.findBySkuCode(skuCode).isPresent();
    }
}
