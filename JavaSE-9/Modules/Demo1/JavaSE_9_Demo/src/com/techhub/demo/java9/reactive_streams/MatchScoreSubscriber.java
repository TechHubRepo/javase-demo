package com.techhub.demo.java9.reactive_streams;

import java.util.concurrent.Flow;
import java.util.concurrent.Flow.Subscription;

public class MatchScoreSubscriber implements Flow.Subscriber<MatchScore> {

	private Flow.Subscription subscription;

	private String name;
	private Integer processingRate;
	private Integer processingLimit;
	private Integer rateCounter = 0;
	private Integer limitCounter = 0;
	private Integer sleepDuration;

	public MatchScoreSubscriber(String name, Integer processingRate, Integer processingLimit, Integer sleepDuration) {
		this.name = name;
		this.processingRate = processingRate;
		this.processingLimit = processingLimit;
		this.sleepDuration = sleepDuration;
	}

	@Override
	public void onSubscribe(Subscription subscription) {
		this.subscription = subscription;
		System.out.println(name + " has been subscribed");
		subscription.request(processingRate);
		System.out.println(name + " requested for " + processingRate + " items");

	}

	@Override
	public void onNext(MatchScore item) {
		if (rateCounter < processingRate) {
			System.out.println("Item received by " + name + ": " + item);
			rateCounter++;
			limitCounter++;
			try {
				Thread.sleep(sleepDuration);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		if (rateCounter == processingRate) {
			subscription.request(processingRate);
			System.out.println("Request for " + processingRate + " items sent by " + name);
			rateCounter = 0;
		}
		if (processingLimit != 0 && limitCounter == processingLimit)
			subscription.cancel();
	}

	@Override
	public void onError(Throwable throwable) {
		throwable.printStackTrace();
	}

	@Override
	public void onComplete() {
		System.out.println("Publishing Finished for " + name);
	}
}
