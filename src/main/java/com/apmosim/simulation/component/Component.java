package com.apmosim.simulation.component;

import java.util.Collection;

public interface Component {

	Collection<Connection> getConnections();
	
	Connection connect(Component component);
	
	void disconnect(Connection connection);
	
}
