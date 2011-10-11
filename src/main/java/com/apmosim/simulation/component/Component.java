package com.apmosim.simulation.component;

import java.util.Collection;

import com.apmosim.simulation.state.State;

public interface Component {
	
	State getState();

	Collection<Connection> getConnections();
	
	void connect(Connection connection);
	
	void disconnect(Connection connection);
	
}
