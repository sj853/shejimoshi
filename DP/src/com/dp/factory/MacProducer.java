package com.dp.factory;

public class MacProducer extends ComputerFactory{

	@Override
	public CPU getCPU() {
		// TODO Auto-generated method stub
		return new MacCPU();
	}

	@Override
	public RAM getRAM() {
		// TODO Auto-generated method stub
		return new MacRAM();
	}

}
