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
        //          ПОСЛЕ ВНЕДРЕНИЯ
        /*
        MusicPlayer musicPlayer=context.getBean("musicPlayer",MusicPlayer.class);
        musicPlayer.playMusic();
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

         */



        System.out.println("-------------------------------");
        /* SCOPES */
        /*
        MusicPlayer firstMusicPlayer=context.getBean("musicPlayer",MusicPlayer.class);
        System.out.println(firstMusicPlayer.getName());
        firstMusicPlayer.setName("Diana");
        MusicPlayer secondMusicPlayer=context.getBean("musicPlayer",MusicPlayer.class);
        System.out.println(firstMusicPlayer.getName());
        System.out.println(secondMusicPlayer.getName());

        boolean compare=firstMusicPlayer==secondMusicPlayer; //reference
        System.out.println(compare);
        System.out.println(firstMusicPlayer);
        System.out.println(secondMusicPlayer);
        */

        /* init-method,destroy-method,factory-method */
        /*
        ClassicalMusic classicalMusic=context.getBean("musicBean",ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());
         */


        /*      СОЗДАНИЕ БИНОВ С ПОМОЩЬЮ АННОТАЦИЙ    */
        /*
        Music music=context.getBean("rockMusic",RockMusic.class);
        MusicPlayer musicPlayer=new MusicPlayer(music);
        musicPlayer.playMusic();
        Music music1=context.getBean("classicalMusic",ClassicalMusic.class);
        MusicPlayer musicPlayer1=new MusicPlayer(music1);
        musicPlayer1.playMusic();
         */



        context.close();

    }
}
