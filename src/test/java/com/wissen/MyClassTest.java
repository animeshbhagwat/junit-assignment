package com.wissen;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class MyClassTest {
	
	private MyClass myClassObj;
	private VoiceAssistant voiceAssistant = mock(VoiceAssistant.class);

	@BeforeAll
	void setUp() {
		myClassObj = new MyClass(voiceAssistant);
	}
	
	@Test
	void testAbc() {
		myClassObj.abc();
		
		verify(voiceAssistant, times(2)).greet();
	}

}
