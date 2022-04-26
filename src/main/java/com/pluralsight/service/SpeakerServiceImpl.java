package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.HibernateSpeakerImpl;
import com.pluralsight.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {
    private final SpeakerRepository repository = new HibernateSpeakerImpl();
    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }
}
