package com.example.demo.number;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/numbers")
public class NumberController {

    @Autowired
    private NumberService numberService;

    @GetMapping
    public List<NumberEntity> getAllNumbers() {
        return numberService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<NumberEntity> getNumberById(@PathVariable Long id) {
        return numberService.findById(id);
    }

    @PostMapping
    public NumberEntity createNumber(@RequestBody NumberEntity numberEntity) {
        return numberService.save(numberEntity);
    }

    @PutMapping("/{id}")
    public NumberEntity updateNumber(@PathVariable Long id, @RequestBody NumberEntity numberEntity) {
        numberEntity.setId(id);
        return numberService.save(numberEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteNumber(@PathVariable Long id) {
        numberService.deleteById(id);
    }
}