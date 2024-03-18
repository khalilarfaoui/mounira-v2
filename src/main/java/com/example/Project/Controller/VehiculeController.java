package com.example.Project.Controller;

import com.example.Project.Models.Vehid;
import com.example.Project.Repositories.VehiculeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("vehicule")
public class VehiculeController {

    final
    VehiculeRepository vehiculeRepository;

    public VehiculeController(VehiculeRepository vehiculeRepository) {
        this.vehiculeRepository = vehiculeRepository;
    }

    @GetMapping
    public List<Vehid> getAllVehicule(){
        return vehiculeRepository.findAll();
    }


    @PostMapping
    public Vehid createVehicule(@RequestBody Vehid vehid){
        return vehiculeRepository.save(vehid);
    }
}
