package com.techlab.model;

public class SlackNotifier implements Notifier {

	private Notifier notifier;

	public SlackNotifier(Notifier notifier) {
		this.notifier = notifier;
	}

	@Override
	public String sendMessage(String msg) {
		return notifier.sendMessage(msg) + "\nSlack Notification: " + msg;
	}

}
