package com.apmosim.simulation.component;

import java.lang.ref.WeakReference;

import com.apmosim.simulation.signal.Signal;


public class SimpleConnection implements Connection {

	private WeakReference<Component> afferentComponent;
	
	private WeakReference<Component> efferentComponent;
	
	public SimpleConnection(Component afferentComponent, Component efferentComponent) {

		this.afferentComponent = new WeakReference<Component>(afferentComponent);
		this.efferentComponent = new WeakReference<Component>(efferentComponent);
	}

	@Override
	public Component getAfferentComponent() {

		return afferentComponent.get();
	}

	@Override
	public Component getEfferentComponent() {

		return efferentComponent.get();
	}

	@Override
	public void passSignal(Signal signal) {

		getAfferentComponent().recieveSignal();
	}
}
