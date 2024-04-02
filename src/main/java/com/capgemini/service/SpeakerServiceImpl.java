package com.capgemini.service;

import com.capgemini.model.Speaker;
import com.capgemini.repository.SpeakerRepository;
import com.capgemini.repository.StubSpeakerRepositoryImpl;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository = new StubSpeakerRepositoryImpl();

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }
}
