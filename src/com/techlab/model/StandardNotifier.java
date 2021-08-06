package com.techlab.model;

public class StandardNotifier implements Notifier {
	private Notifier notifier;

	public StandardNotifier(Notifier notifier) {
		this.notifier = notifier;
	}

	@Override
	public String sendMessage(String msg) {
		return notifier.sendMessage(msg) + "Standard Notification: " + msg;
	}
}
