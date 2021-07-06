package com.wissen;

public class MyClass {

	private VoiceAssistant voiceAssistant;
	
	MyClass() {
	}
		
	public MyClass(VoiceAssistant voiceAssistant) {
		super();
		this.voiceAssistant = voiceAssistant;
	}

	public void abc() {
		
		voiceAssistant.greet();
	}
}
