package com.femit.femit.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.femit.femit.models.Contacto;
import com.femit.femit.repositories.ContactoRepository;

@Service
@Transactional
public class ContactoService {
    private ContactoRepository contactoRepository;
    public ContactoService(ContactoRepository contactoRepository){
        this.contactoRepository = contactoRepository;
        }

    public void saveContacto(Contacto contacto){
            this.contactoRepository.save(contacto);
        }
    
    public void updateContacto(Contacto contacto){
        this.contactoRepository.save(contacto);
    }
    
    public void deleteByIdContacto(Integer id){
            this.contactoRepository.deleteById(id);
        }
    
    public List<Contacto> findAll(){
            return contactoRepository.findAll();
        }
    
    public List<Contacto> findAllContactoByNombreAsc(){
            return contactoRepository.findAllContactoByNombreAsc();
        }
    
    public List<Contacto> findAllContactoByNombreDesc(){
            return contactoRepository.findAllContactoByNombreDesc();
        }
    

    
}
