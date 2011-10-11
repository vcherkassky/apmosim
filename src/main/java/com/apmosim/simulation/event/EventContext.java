package com.apmosim.simulation.event;

import com.apmosim.simulation.state.State;


public interface EventContext<T> {

	State getState();
}
