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
    
    public List<Portafolio> findAll() {
        return portafolioRepository.findAll();
    }
    
    public List<Portafolio> findAllPortafolioByIdUsuarioAsc() {
        return portafolioRepository.findAllPortafolioByIdUsuarioAsc();
    }
    
    public List<Portafolio> findAllPortafolioByIdUsuarioDesc() {
        return portafolioRepository.findAllPortafolioByIdUsuarioDesc();
    }
}
