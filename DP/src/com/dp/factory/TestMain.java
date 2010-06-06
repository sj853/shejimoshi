package com.dp.factory;

public class TestMain {
	
	public static void main(String[] args) {
		ComputerFactory macProducer = new MacProducer();
		CPU macCPU = macProducer.produceCPU();
		macCPU.getTitle();
		RAM macRAM = macProducer.produceRAM();
		macRAM.getTitle();
		
		System.out.println("--------");
		
		ComputerFactory pcProducer = new PcProducer();
		CPU pcCPU = pcProducer.produceCPU();
		pcCPU.getTitle();
		RAM pcRAM = pcProducer.produceRAM();
		pcRAM.getTitle();
		
	}
}
