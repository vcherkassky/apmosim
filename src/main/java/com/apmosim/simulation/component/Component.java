package com.apmosim.simulation.component;

import java.util.Collection;

import com.apmosim.simulation.state.State;

public interface Component {
	
	State getState();

	Collection<Connection> getConnections();
	
	Connection connectAfferent(Component afferentComponent);
	
	Connection connectEfferent(Component efferentComponent);

	void disconnect(Connection connection);
	
}
