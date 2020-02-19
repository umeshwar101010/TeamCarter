package org.academiademiadecodigo.hackstreetboys.teamcarter;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;


// TODO : Doesn't play sound, find new solution

public class Audio {

    public void startMusic() {
        String pathStr = "/resources/Audio/cb.wav";
        URL soundURL = MusicTest.class.getResource(pathStr);
        AudioInputStream audioInputStream = null;
        try {
            if (soundURL == null) {
                pathStr = pathStr.substring(1);
                File file = new File(pathStr);
                soundURL = file.toURI().toURL();
            }
            audioInputStream = AudioSystem.getAudioInputStream(soundURL);
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            clip.loop(clip.LOOP_CONTINUOUSLY);
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

