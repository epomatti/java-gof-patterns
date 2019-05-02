package main;

import builder.concrete.MacBuilder;

import computer.concrete.Mac;

import director.ComputerDirector;

public class MacClient {
	
	public static void main(String[] args) {
		
		MacBuilder macBuilder = new MacBuilder();
		ComputerDirector macDirector = new ComputerDirector(macBuilder);
		macDirector.construct();
		Mac mac = macBuilder.getMac();
		System.out.println(mac.getOperationalSystem());

	}

}
