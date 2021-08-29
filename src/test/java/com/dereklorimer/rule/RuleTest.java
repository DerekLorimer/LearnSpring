package com.dereklorimer.rule;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RuleTest {

	@Test
	void test() {
		
		RuleLine ruleLine = new RuleLine.RuleLineBuilder("testing").build();
		
		assertEquals("testing",ruleLine.getLeft());
	}

}
