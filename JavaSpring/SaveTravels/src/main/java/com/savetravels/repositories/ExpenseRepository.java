package com.savetravels.repositories;

import com.savetravels.models.Expense;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepository extends CrudRepository<Expense, Long> {}
