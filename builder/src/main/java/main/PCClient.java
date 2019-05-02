package main;

import builder.concrete.PCBuilder;

import computer.concrete.PC;

import director.ComputerDirector;

public class PCClient {
	
	public static void main(String[] args) {
		
		PCBuilder pcBuilder = new PCBuilder();
		ComputerDirector pcDirector = new ComputerDirector(pcBuilder);
		pcDirector.construct();
		PC pc = pcBuilder.getPc();
		System.out.println(pc.getOperationalSystem());
		
	}

}
