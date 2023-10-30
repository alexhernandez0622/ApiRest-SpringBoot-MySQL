package com.example.Reto4SpringBootMongoDB.Services;
import com.example.Reto4SpringBootMongoDB.Entity.Gadget;
import com.example.Reto4SpringBootMongoDB.Repository.GadgetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class GadgetService {
    private final GadgetRepository gadgetRepository;

    @Autowired
    public GadgetService(GadgetRepository gadgetRepository) {
        this.gadgetRepository = gadgetRepository;
    }

    public Gadget saveGadget(Gadget gadget) {
        return gadgetRepository.save(gadget);
    }

    public List<Gadget> getAllGadgets() {
        return gadgetRepository.findAll();
    }
}