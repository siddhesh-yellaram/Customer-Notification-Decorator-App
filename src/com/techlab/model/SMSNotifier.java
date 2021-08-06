package com.techlab.model;

public class SMSNotifier implements Notifier {
	private Notifier notifier;

	public SMSNotifier(Notifier notifier) {
		this.notifier = notifier;
	}

	@Override
	public String sendMessage(String msg) {
		return notifier.sendMessage(msg) + "\nSMS Notification: " + msg;
	}
}
