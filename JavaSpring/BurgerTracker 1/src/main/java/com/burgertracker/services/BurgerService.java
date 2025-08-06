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
}
