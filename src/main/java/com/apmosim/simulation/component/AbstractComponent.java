package com.apmosim.simulation.component;

import java.util.Collection;
import java.util.Set;

public abstract class AbstractComponent implements Component {

	private Set<Connection> connections;

	public AbstractComponent(Set<Connection> connections) {

		super();

		this.connections = connections;
	}

	@Override
	public Collection<Connection> getConnections() {

		return this.connections;
	}

	@Override
	public void connect(Connection connection) {

		this.connections.add(connection);
	}

	@Override
	public void disconnect(Connection connection) {

		this.connections.remove(connection);
	}
}
