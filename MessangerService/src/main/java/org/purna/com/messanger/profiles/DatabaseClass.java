package org.purna.com.messanger.profiles;

import java.util.HashMap;
import java.util.Map;

import org.purna.com.messanger.message.Message;
import org.purna.com.messanger.message.Profile;

public class DatabaseClass {
	private static Map<Long, Message> message = new HashMap<Long, Message>();
	private static Map<Long, Profile> profile = new HashMap<Long, Profile>();

	public static Map<Long, Message> getMessage() {

		return message;
	}

	public static Map<Long, Profile> getProfiles() {
		return profile;
	}

}
