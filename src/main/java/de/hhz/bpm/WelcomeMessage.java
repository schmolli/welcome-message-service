package de.hhz.bpm;

public class WelcomeMessage {
	
	private final long id;
	private final String message;
	
	public WelcomeMessage(long id, String message) {
		super();
		this.id = id;
		this.message = message;
	}
	public long getId() {
		return id;
	}
	public String getMessage() {
		return message;
	}
	
}
