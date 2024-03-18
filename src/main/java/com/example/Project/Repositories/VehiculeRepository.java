package com.example.Project.Repositories;


import com.example.Project.Models.Marque;
import com.example.Project.Models.Vehid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehiculeRepository  extends JpaRepository<Vehid, Integer> {
    List<Vehid> findByMarque(Marque marque);


}

