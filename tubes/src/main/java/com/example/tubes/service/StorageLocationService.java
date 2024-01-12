package com.example.tubes.service;

import com.example.tubes.entity.StorageLocation;
import com.example.tubes.repository.StorageLocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StorageLocationService {
    @Autowired
    private StorageLocationRepository repository;

    public void save(StorageLocation storageLocation) {
        repository.save(storageLocation);
    }
    public List<StorageLocation> get() {
        return repository.findAll();
    }
    public StorageLocation getById(int id) {
        return repository.findById(id).get();
    }
    public void deleteById(int id) {
        repository.deleteById(id);
    }
}
