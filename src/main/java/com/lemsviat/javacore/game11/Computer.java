package main.java.com.lemsviat.javacore.game11;

import java.util.Random;

public class Computer implements Playable{

    @Override
    public States getStates() {
        States[] states = States.values();
        Random random = new Random();
        int index = random.nextInt(states.length);
        return states[index];
    }
}
