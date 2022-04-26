package com.raja.controller;

import com.raja.BaseApiController;
import com.raja.entity.Technology;
import com.raja.service.TechnologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TechnologyApiController extends BaseApiController {

    @Autowired
    private TechnologyService service;

    @GetMapping("/technologies")
    public ResponseEntity<List<Technology>> getAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @PostMapping("/technologies")
    public ResponseEntity<Technology> save(@RequestBody Technology technology) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(technology));
    }

    @PostMapping("/technologies-bulk")
    public ResponseEntity<List<Technology>> save(@RequestBody List<Technology> technologies) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.saveAll(technologies));
    }
}
