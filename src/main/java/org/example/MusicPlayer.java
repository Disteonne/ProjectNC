package org.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    private Music music;
    private String name;
    private int volume;
    //IoC

    public MusicPlayer(Music music) {
        this.music = music;
    }
    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public MusicPlayer() {
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String playMusic(){
        //System.out.println(music.getSong());
        //System.out.println(classicalMusic.getSong());
        //System.out.println(rockMusic.getSong());
        return classicalMusic.getSong();
    }

    public void setMusic(Music music) {
        this.music = music;
    }


}
