package com.yesu.Springanno;

import org.springframework.stereotype.Component;

@Component
public class snapdragon implements mobileprocessor {

	@Override
	public void process() {
		System.out.println("cpu running");

	}

}
