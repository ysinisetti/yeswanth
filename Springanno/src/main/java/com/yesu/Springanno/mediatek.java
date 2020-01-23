package com.yesu.Springanno;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
@Primary
public class mediatek implements mobileprocessor {
	
	
	public void process() {
		System.out.println("2nd best cpu");

	}

}
