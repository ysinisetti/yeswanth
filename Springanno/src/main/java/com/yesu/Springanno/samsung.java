package com.yesu.Springanno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class samsung {
	@Autowired
	mobileprocessor cpu;
	
	public mobileprocessor getCpu() {
		return cpu;
	}

	public void setCpu(mobileprocessor cpu) {
		this.cpu = cpu;
	}

	public void config() {
		System.out.println("octa core,4 gb ram,12mp camera");
		cpu.process();
	}
}
