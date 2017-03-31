package org.purna.com.messanger.messageResource;

import java.util.ArrayList;
import java.util.List;

import org.purna.com.messanger.message.Message;

public class MessageResource {

	public List<Message> provideService() {
		
		List<Message> list = new ArrayList<Message>();
		Message m1 = new Message(1L, "harry porter", "purna");
		Message m2 = new Message(1L, "key to sucess", "churna");

		list.add(m1);
		list.add(m2);
		return list;
	}

}
