package com.dp.factory;

public class PcProducer extends ComputerFactory{

	@Override
	public CPU produceCPU() {
		// TODO Auto-generated method stub
		return new PcCPU();
	}

	@Override
	public RAM produceRAM() {
		// TODO Auto-generated method stub
		return new PcRAM();
	}

}
