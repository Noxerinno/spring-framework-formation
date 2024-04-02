package com.capgemini.repository;

import com.capgemini.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class StubSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<>();

        Speaker speaker = new Speaker();

        speaker.setFirstName("Le D");
        speaker.setLastName("Lafarginio");

        speakers.add(speaker);

        return speakers;
    }
}
