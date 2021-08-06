package com.techlab.model;

public class WhatsAppNotifier implements Notifier {

	private Notifier notifier;

	public WhatsAppNotifier(Notifier notifier) {
		this.notifier = notifier;
	}

	@Override
	public String sendMessage(String msg) {
		return notifier.sendMessage(msg) + "\nWhatsApp Notification: " + msg;
	}

}
