package com.femit.femit.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.femit.femit.models.Portafolio;
import com.femit.femit.repositories.PortafolioRepository;

@Service
@Transactional
public class PortafolioService {
    
    private PortafolioRepository portafolioRepository;
    
    public PortafolioService(PortafolioRepository portafolioRepository) {
        this.portafolioRepository = portafolioRepository;
    }
    
    public void savePortafolio(Portafolio portafolio) {
        this.portafolioRepository.save(portafolio);
    }
    
    public void updatePortafolio(Portafolio portafolio) {
        this.portafolioRepository.save(portafolio);
    }
    
    public void deletePortafolioById(Integer id) {
        this.portafolioRepository.deleteById(id);
    }
    
    public List<Portafolio> findAllPortafolio() {
        return this.portafolioRepository.findAll();
    }
    
    public List<Portafolio> findAllPortafolioByNombreAsc() {
        return this.portafolioRepository.findAllPortafolioByNombreAsc();
    }
    
    public List<Portafolio> findAllPortafolioByNombreDesc() {
        return this.portafolioRepository.findAllPortafolioByNombreDesc();
    }
}
