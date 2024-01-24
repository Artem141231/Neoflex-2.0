package ru.neoflex.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.neoflex.practice.model.Calculation;
public interface CalculationRepository extends JpaRepository<Calculation, Long> {
}
