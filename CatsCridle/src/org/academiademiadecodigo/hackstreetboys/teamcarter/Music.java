package org.academiademiadecodigo.hackstreetboys.teamcarter;


import javax.sound.sampled.*;
import java.io.*;
import java.net.URL;
import java.util.Objects;

/**Original test for multi tracks NOT WORKING!!*/

public enum Music {
    TRACK("/resources/Audio/cb.wav");




    private Clip clip;
    public URL url;
    public AudioInputStream audioInputStream;

     Music(String soundFilename) {

                try {
                    // Use URL (instead of File) to read from disk and JAR.
                    this.url = this.getClass().getClassLoader().getResource(soundFilename);
                    // Set up an audio input stream piped from the sound file.
                    this.audioInputStream = AudioSystem.getAudioInputStream(Objects.requireNonNull(url));  //TODO : Why does the file not run??
                    // Get a clip resource.
                    clip = AudioSystem.getClip();
                    // Open audio clip and load samples from the audio input stream.
                    clip.open(audioInputStream);

                } catch (UnsupportedAudioFileException | IOException e) {
                    e.printStackTrace();
                } catch (LineUnavailableException e) {
                    e.printStackTrace();
                }
     }

            // Play or Re-play the sound effect from the beginning, by rewinding.
            public void play() {

                clip.loop(Clip.LOOP_CONTINUOUSLY);


            }

            public void stop(){

                clip.stop();   // Stop the player if it is still running
                clip.flush();
                clip.setFramePosition(0);
            }

            // Optional static method to pre-load all the sound files.
            static void init() {
                values(); // calls the constructor for all the elements
            }

            public boolean isActive(){

                return clip.isActive();
            }

            public boolean isOpen() {

                return clip.isOpen();
            }

            public void setFramePosition() {
                clip.setFramePosition(0);

            }

}





