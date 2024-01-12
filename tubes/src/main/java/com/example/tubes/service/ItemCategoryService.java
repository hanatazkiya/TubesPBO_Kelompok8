package com.example.tubes.service;

import com.example.tubes.entity.ItemCategory;
import com.example.tubes.repository.ItemCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemCategoryService {
    @Autowired
    private ItemCategoryRepository repository;
    public void save(ItemCategory itemCategory) {
        repository.save(itemCategory);
    }
    public List<ItemCategory> get() {
        return repository.findAll();
    }
    public ItemCategory getById(int id) {
        return repository.findById(id).get();
    }
    public void deleteById(int id) {
        repository.deleteById(id);
    }
}
