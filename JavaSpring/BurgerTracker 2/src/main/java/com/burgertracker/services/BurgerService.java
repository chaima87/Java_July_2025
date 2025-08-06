package com.burgertracker.services;

import com.burgertracker.models.Burger;
import com.burgertracker.repositories.BurgerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BurgerService {
    
    private final BurgerRepository burgerRepo;

    public BurgerService(BurgerRepository burgerRepo) {
        this.burgerRepo = burgerRepo;
    }

    public List<Burger> allBurgers() {
        return burgerRepo.findAll();
    }

    public Burger createBurger(Burger burger) {
        return burgerRepo.save(burger);
    }
    public Burger findById(Long id) {
        return burgerRepo.findById(id).orElse(null);
    }

    public void update(Burger burger) {
        burgerRepo.save(burger);  // save() handles both create & update
    }

}
