package org.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    //@Autowired
    //@Qualifier("classicalMusic")
    private Music music1;
    private Music music2;
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1,@Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    //IoC
    /*
    public MusicPlayer(Music music) {
        this.music = music;
    }
    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

     */

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
        return music1.getSong()+" "+music2.getSong();
    }

    public void setMusic(Music music) {
        //this.music = music;
    }


}
