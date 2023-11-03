package org.progress;

import org.progress.domain.User;
import org.progress.services.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );
        ApplicationContext context  = new ClassPathXmlApplicationContext("spring-config.xml");
        UserService userService  =  context.getBean("userService",UserService.class);

        User newuser = new User("abdelaziz","pass");
        User createdUser =   userService.createUser(newuser);

    }
}
