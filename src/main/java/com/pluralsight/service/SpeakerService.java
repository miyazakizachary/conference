package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.HibernateSpeakerImpl;
import com.pluralsight.repository.SpeakerRepository;

import java.util.List;

public class SpeakerService {
    private final SpeakerRepository repository = new HibernateSpeakerImpl();
    public List<Speaker> findAll() {
        return repository.findAll();
    }
}
