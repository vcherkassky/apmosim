package com.apmosim.simulation.timeline;

public interface Timeline {

	long nextStep();
	
	long getCurrentTime();
}
