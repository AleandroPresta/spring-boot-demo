package com.example.demo.number;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NumberService {

    @Autowired
    private NumberRepository numberRepository;

    public List<NumberEntity> findAll() {
        return numberRepository.findAll();
    }

    public Optional<NumberEntity> findById(Long id) {
        return numberRepository.findById(id);
    }

    public NumberEntity save(NumberEntity numberEntity) {
        return numberRepository.save(numberEntity);
    }

    public void deleteById(Long id) {
        numberRepository.deleteById(id);
    }
}