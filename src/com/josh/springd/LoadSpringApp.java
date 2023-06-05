package com.josh.springd;
;

public class LoadSpringApp {

	public static void main(String[] args) {
		// load spring configuration files
		
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:config.xml");
		
		//Retrieve the bean containers
		Coach theCoach = context.getBean("myCoach",Coach.class);
		//call methods on the bean 
		System.out.println(theCoach.getDailyWork());
		//close the container
        context.close();
	}

}
