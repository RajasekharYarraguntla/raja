package com.raja.service;

import com.raja.entity.Technology;
import com.raja.repository.TechnologyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TechnologyService {

    @Autowired
    private TechnologyRepository repository;

    public List<Technology> findAll() {
        return repository.findAll();
    }

    public Technology save(Technology technology) {
        return repository.save(technology);
    }

    public List<Technology> saveAll(List<Technology> technologies) {
        return repository.saveAll(technologies);
    }
}
