package com.apmosim.simulation.component;

import java.util.Set;

import com.apmosim.simulation.state.State;


public class SimpleComponent extends AbstractComponent {
	
	private State state;

	public SimpleComponent(Set<Connection> connections, State initialState) {

		super(connections);
		
		if(initialState == null) {
			throw new NullPointerException();
		}
		
		this.state = initialState;
	}

	@Override
	public State getState() {

		return state;
	}
}
