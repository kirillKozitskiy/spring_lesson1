package spring_introduction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Dog dog = (Dog) context.getBean("dogBean");
        Person person = context.getBean("person", Person.class);

        person.setPet(dog);
        person.getPet().petSay();

        context.close();


    }



}
