package org.example;


import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements  Music{

    private ClassicalMusic() {
    }
    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

    public void doMyInit(){
        System.out.println("do my initialization");
    }

    public void doMyDestroy(){
        System.out.println("do my destroy");
    }
}
