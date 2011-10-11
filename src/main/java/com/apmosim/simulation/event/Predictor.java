package com.apmosim.simulation.event;

import java.util.Set;

import com.apmosim.simulation.state.Stateful;

public interface Predictor {

	Set<Event> predict(Stateful stateful, long start, long end);
}
