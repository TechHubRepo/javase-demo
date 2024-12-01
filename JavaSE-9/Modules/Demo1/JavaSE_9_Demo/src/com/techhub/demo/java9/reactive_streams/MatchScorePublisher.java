package com.techhub.demo.java9.reactive_streams;

import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.Flow;
import java.util.concurrent.Flow.Subscriber;

public class MatchScorePublisher<MatchScore> implements Flow.Publisher<MatchScore>, Closeable {

	@Override
	public void subscribe(Subscriber<? super MatchScore> subscriber) {

	}

	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub

	}

}
