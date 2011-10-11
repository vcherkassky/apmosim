package com.apmosim.simulation;

import java.io.Writer;

public interface Simulation {

	void start();
	
	void pause();
	
	void dump(Writer writer);
	
	void stop();
}
