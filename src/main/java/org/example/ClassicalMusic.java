package org.example;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("singleton")
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

    @PostConstruct
    public void doMyInit(){
        System.out.println("do my initialization");
    }
    @PreDestroy
    public void doMyDestroy(){
        System.out.println("do my destroy");
    }
}
