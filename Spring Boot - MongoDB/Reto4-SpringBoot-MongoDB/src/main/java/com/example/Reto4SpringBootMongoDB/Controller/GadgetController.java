package com.example.Reto4SpringBootMongoDB.Controller;

import com.example.Reto4SpringBootMongoDB.Entity.Gadget;
import com.example.Reto4SpringBootMongoDB.Services.GadgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gadget")
public class GadgetController {
    private final GadgetService gadgetService;

    @Autowired
    public GadgetController(GadgetService gadgetService) {
        this.gadgetService = gadgetService;
    }

    @PostMapping("/new")
    public ResponseEntity<Gadget> createGadget(@RequestBody Gadget gadget) {
        Gadget savedGadget = gadgetService.saveGadget(gadget);
        return new ResponseEntity<>(savedGadget, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Gadget>> getAllGadgets() {
        List<Gadget> gadgets = gadgetService.getAllGadgets();
        return new ResponseEntity<>(gadgets, HttpStatus.OK);
    }
}