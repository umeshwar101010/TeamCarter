package org.academiadecodigo.hackstreetboys.audio;



import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;


/**stable for one track of music*/

public class Audio {

    public void startAudio() {
        String pathStr = "/resources/Sound/bb4.wav";
        //Initializer in te class we start the music
        URL soundURL = Audio.class.getResource(pathStr);
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

