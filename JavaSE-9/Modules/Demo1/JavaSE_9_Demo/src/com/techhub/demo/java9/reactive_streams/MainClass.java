package com.techhub.demo.java9.reactive_streams;

public class MainClass {
	public static void main(String[] args) {

		try (MatchScorePublisher<MatchScore> publisher = new MatchScorePublisher<>()) {
			
				
			MatchScoreSubscriber broker1 = new MatchScoreSubscriber("Broker-1", 1, 0, 0);
			MatchScoreSubscriber broker2 = new MatchScoreSubscriber("Broker-2", 3, 0, 0);
			publisher.subscribe(broker1);
			publisher.subscribe(broker2);

//			DataProvider.getStockData().forEach(e -> {
//				System.out.println("Publishing: " + e);
//				publisher.submit(e);
//			});

			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
//		Thread.sleep(100);
	}
}
