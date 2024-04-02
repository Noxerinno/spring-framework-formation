package com.capgemini;

import com.capgemini.service.SpeakerService;
import com.capgemini.service.SpeakerServiceImpl;

public class Application {

    public static void main (String args[]) {
        SpeakerService service = new SpeakerServiceImpl();

        System.out.println(service.findAll().get(0).getFirstName());
    }
}
