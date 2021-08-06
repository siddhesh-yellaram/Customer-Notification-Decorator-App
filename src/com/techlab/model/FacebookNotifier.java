package com.techlab.model;

public class FacebookNotifier implements Notifier{
	private Notifier notifier;
	
	public FacebookNotifier(Notifier notifier) {
		this.notifier = notifier;
	}
	
	@Override
	public String sendMessage(String msg) {
		return notifier.sendMessage(msg) + "\nFacebook Notification: " + msg;
	}
}
