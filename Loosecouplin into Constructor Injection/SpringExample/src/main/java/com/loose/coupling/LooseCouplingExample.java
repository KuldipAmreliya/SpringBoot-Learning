package com.loose.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LooseCouplingExample {
    public static void main(String[] args) {

//initialised object of the Interface and
// Assigned to UserDatabaseProvider class

        ApplicationContext context=
                new ClassPathXmlApplicationContext("newapplicationBean.xml");

    UserManager mainid= (UserManager)context.getBean("mainid");
    mainid.DisplayDetails();
    }
}
