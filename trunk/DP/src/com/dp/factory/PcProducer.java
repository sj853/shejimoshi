package com.dp.factory;

public class PcProducer extends ComputerFactory{

	@Override
	public CPU getCPU() {
		// TODO Auto-generated method stub
		return new PcCPU();
	}

	@Override
	public RAM getRAM() {
		// TODO Auto-generated method stub
		return new PcRAM();
	}

}
