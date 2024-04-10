package dev.maik.runnerz;

import org.springframework.stereotype.Component;
//Indicamos que esta calse esta disponible para Spring
@Component
public class WelcomeMessage {
    public String getWelcomeMessage(){
        return "Welcome to the Spring Boot Application";
    }
}
