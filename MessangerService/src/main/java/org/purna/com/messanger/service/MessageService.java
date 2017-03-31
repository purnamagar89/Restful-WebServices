package org.purna.com.messanger.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.purna.com.messanger.message.Message;
import org.purna.com.messanger.messageResource.MessageResource;

@Path("/message")
public class MessageService {
	MessageResource messageResource = new MessageResource();

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessage() {

		return messageResource.provideService();
		}
}
