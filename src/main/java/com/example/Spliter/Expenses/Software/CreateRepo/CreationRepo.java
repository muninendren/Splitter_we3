package com.example.Spliter.Expenses.Software.CreateRepo;

import com.example.Spliter.Expenses.Software.Entity.Trip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreationRepo extends JpaRepository<Trip,Long> {
}
