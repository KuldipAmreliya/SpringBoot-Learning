package car.example.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
//Here first we loaded xml confuguration file with ApplicationContext
//here classPathXmlApplicationContext is implementation of Applicationcontex
//this implementation loades the context defination
// from xml file located in class path

            ApplicationContext context=
                    new ClassPathXmlApplicationContext("applicationBeanContext.xml");
//we retrive my Bean from the context
// and SPring give the object

        MyBean myBean= (MyBean)context.getBean("myBean");
        System.out.println(myBean);
    }
}
