package com.dereklorimer.rule;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RuleLine {
	
	static Logger LOGGER = LoggerFactory.getLogger(RuleLine.class);
	
	private String left;
	
	private RuleLine(RuleLineBuilder builder) {
		
		this.left = builder.left;
		
	}
	
	
	
	
	public String getLeft() {
		return left;
	}




	public static class RuleLineBuilder {
		
		private String left;
		
		public RuleLineBuilder(String left) {
			this.left = left;
		}
		
		public RuleLine build() {
			
			LOGGER.debug("build");
			
			return new RuleLine(this);
		}
		
	}

}
