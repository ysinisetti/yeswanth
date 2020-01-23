package com.yesu.Springanno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext factory=new AnnotationConfigApplicationContext(AppConf.class);
       samsung s7=factory.getBean(samsung.class);
       s7.config();
    }
}
