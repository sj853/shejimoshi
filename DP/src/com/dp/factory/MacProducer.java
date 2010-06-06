package com.dp.factory;

public class MacProducer extends ComputerFactory{

	@Override
	public CPU produceCPU() {
		// TODO Auto-generated method stub
		return new MacCPU();
	}

	@Override
	public RAM produceRAM() {
		// TODO Auto-generated method stub
		return new MacRAM();
	}

}
