package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        /*         LESSON 1: TestBean
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        TestBean testBean= context.getBean("testBean",TestBean.class);
        System.out.println(testBean.getName());

        context.close();
         */

        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        //          ДО ВНЕДРЕНИЯ ЗАВИСИМОСТЕЙ
        //Music music=context.getBean("musicBean",Music.class);
        //MusicPlayer player=new MusicPlayer(music);
        //player.playMusic();

        MusicPlayer musicPlayer=context.getBean("musicPlayer",MusicPlayer.class);
        musicPlayer.playMusic();
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
        context.close();

    }
}
