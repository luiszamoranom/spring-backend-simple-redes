package com.luiszamorano.backendsimpleredes.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.luiszamorano.backendsimpleredes.entity.Caracteristica;
import com.luiszamorano.backendsimpleredes.repository.CaracteristicaRepository;

@Service
public class CaracteristicaService {
    @Autowired
    private CaracteristicaRepository caracteristicaRepository;

    public List<Caracteristica> findAll(){
        return caracteristicaRepository.findAll();
    }

    public Optional<Caracteristica> findById(String id){
        return caracteristicaRepository.findById(id);
    }

    public Boolean existsById(String id){
        return caracteristicaRepository.existsById(id);
    }

    public Long count(){
        return caracteristicaRepository.count();
    }
}
