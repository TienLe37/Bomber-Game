package com.sound;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class Sound {

    public   static void playSound(String fileName) {

        try {
            String path = (System.getProperty("user.dir") +  "\\src/main/java/com\\sound\\" + fileName + ".wav");
            File file = new File(path);
            Clip clip = AudioSystem.getClip();
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(file);
            clip.open(inputStream);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void loopSound(String fileName) {
        String path = (System.getProperty("user.dir") + "\\src/main/java/com\\sound\\" + fileName + ".wav");

        try {
            File file = new File(path);
            Clip clip = AudioSystem.getClip();
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(file);
            clip.open(inputStream);

            clip.loop(Clip.LOOP_CONTINUOUSLY);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void boomboom() {//nổ
        playSound("explosionBomb");
    }

    public static void playerDead() {
        playSound("explosionFlame");
    }
    //Spawn-resources.assets-2428

    public static void getItem() {
        playSound("beepSmall");
    }

    public static void enemyDead1() {
        playSound("Pawn_Megascarab_Wounded_1c-resources.assets-3996");
    }

    public static void ThemeSound() {

        loopSound("burningMemory");
    }

}

