package com.apmosim.simulation.timeline;

import java.util.concurrent.atomic.AtomicLong;

public class ProximateTimeline implements Timeline {

	private final AtomicLong time;

	public ProximateTimeline() {

		super();
		this.time = new AtomicLong();
	}

	public ProximateTimeline(long initialTime) {

		super();
		this.time = new AtomicLong(initialTime);
	}

	@Override
	public long nextStep() {

		return time.incrementAndGet();
	}

	@Override
	public long getCurrentTime() {

		return time.get();
	}

}
