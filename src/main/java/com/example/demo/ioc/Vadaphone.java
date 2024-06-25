package com.example.demo.ioc;

public class Vadaphone implements Sim{
	@Override
	public void calling() {
		System.out.println("Vadaphone calling ");
		
	}

	@Override
	public void data() {
		System.out.println("Vadaphone Data using");
	}

}
