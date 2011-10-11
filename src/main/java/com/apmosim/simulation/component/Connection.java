package com.apmosim.simulation.component;

import com.apmosim.simulation.signal.Signal;

public interface Connection {

	Component getAfferentComponent();
	
	Component getEfferentComponent();
	
	void passSignal(Signal signal);
}
