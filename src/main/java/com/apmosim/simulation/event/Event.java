package com.apmosim.simulation.event;


public interface Event {

	EventContext getContext();
	
	long getTime();
}
