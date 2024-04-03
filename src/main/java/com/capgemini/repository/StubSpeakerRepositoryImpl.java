package com.capgemini.repository;

import com.capgemini.model.Speaker;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("speakerRepository")
@Scope(value= BeanDefinition.SCOPE_SINGLETON)
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
