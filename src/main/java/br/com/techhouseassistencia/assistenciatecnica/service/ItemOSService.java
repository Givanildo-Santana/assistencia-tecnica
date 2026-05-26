package br.com.techhouseassistencia.assistenciatecnica.service;

import br.com.techhouseassistencia.assistenciatecnica.domain.ItemOS;
import br.com.techhouseassistencia.assistenciatecnica.repository.ItemOSRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemOSService {

    @Autowired
    private ItemOSRepository itemOSRepository;

    public List<ItemOS> findAllItemOS(){
        return itemOSRepository.findAll();
    }

    public ItemOS findByItemOSId(Long id){
        return itemOSRepository.findById(id).orElseThrow();
    }

    public ItemOS saveItemOS(ItemOS itemOS){
        return itemOSRepository.save(itemOS);
    }

    public ItemOS updateItemOS(ItemOS itemOS){
        return itemOSRepository.save(itemOS);
    }

    public void deleteByItemOSId(Long id){
        itemOSRepository.deleteById(id);
    }
}
