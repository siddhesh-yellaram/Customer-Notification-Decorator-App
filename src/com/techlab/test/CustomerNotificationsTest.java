package com.techlab.test;

import com.techlab.model.Customer;
import com.techlab.model.FacebookNotifier;
import com.techlab.model.Notifier;
import com.techlab.model.SMSNotifier;
import com.techlab.model.SlackNotifier;
import com.techlab.model.StandardNotifier;
import com.techlab.model.WhatsAppNotifier;

public class CustomerNotificationsTest {
	public static void main(String []args) {
		Customer c = new Customer(101,"Lucifer","luci234@gmail.com","luci987","luci9999",847599645);
		Notifier notifier = new SlackNotifier(new FacebookNotifier(new SMSNotifier(new WhatsAppNotifier(new StandardNotifier(c)))));
		notifier.sendMessage("Hello World");
	}
}
