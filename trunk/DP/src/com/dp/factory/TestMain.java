package com.dp.factory;

public class TestMain {
	
	public static void main(String[] args) {
		ComputerFactory macProducer = new MacProducer();
		CPU macCPU = macProducer.getCPU();
		macCPU.getTitle();
		RAM macRAM = macProducer.getRAM();
		macRAM.getTitle();
		
		System.out.println("--------");
		
		ComputerFactory pcProducer = new PcProducer();
		CPU pcCPU = pcProducer.getCPU();
		pcCPU.getTitle();
		RAM pcRAM = pcProducer.getRAM();
		pcRAM.getTitle();
		
	}
}
