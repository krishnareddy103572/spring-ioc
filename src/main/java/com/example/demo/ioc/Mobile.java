package com.example.demo.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
	public static void main(String[] args) {
//		Airtel airtel = new Airtel();
//		airtel.calling();
//		airtel.data();
//		
//		Vadaphone vadaphone = new Vadaphone();
//		vadaphone.calling();
//		vadaphone.data();
//	
//		Sim sim = new Vadaphone();
//		sim.calling();
//		sim.data();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//		Airtel air=(Airtel)context.getBean("airtel");
//		air.calling();
//		air.data();
//	
		Sim sim = context.getBean("sim",Sim.class);
		sim.calling();
		sim.data();
		
	}

}
