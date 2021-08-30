package com.dereklorimer.rule;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RuleTest {

	@Test
	void test() {
		
		RuleLine ruleLine = new RuleLine.RuleLineBuilder("left").addRight("right").build();
		
		assertEquals("left",ruleLine.getLeft());
		assertEquals("right",ruleLine.getRight());
	}

}
