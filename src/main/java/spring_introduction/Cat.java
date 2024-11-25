package spring_introduction;

import org.springframework.stereotype.Component;

@Component("catBean")
public class Cat implements Pet{
    @Override
    public void petSay() {
        System.out.println("Mew-mew");
    }
}
