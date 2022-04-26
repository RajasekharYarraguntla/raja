package com.raja.controller;

import com.raja.BaseApiController;
import com.raja.entity.Technology;
import com.raja.service.TechnologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
}
