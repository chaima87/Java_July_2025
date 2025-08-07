package com.example.dojoninjas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dojoninjas.models.Ninja;

@Repository
public interface NinjaRepository extends JpaRepository<Ninja, Long> {
}

