package com.dereklorimer.rule;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RuleLine {
	
	static Logger LOGGER = LoggerFactory.getLogger(RuleLine.class);
	
	private String left;
	private String right;
	
	private RuleLine(RuleLineBuilder builder) {
		
		this.left = builder.left;
		this.right = builder.right;
		
	}
	
	
	
	
	public String getLeft() {
		return left;
	}
	
	public String getRight() {
		return right;
	}




	public static class RuleLineBuilder {
		
		private String left;
		private String right;
		
		public RuleLineBuilder(String left) {
			this.left = left;
		}
		
		public RuleLineBuilder addRight(String right) {
			this.right = right;
			return this;
		}
		

		public RuleLine build() {
			
			LOGGER.debug("build");
			
			return new RuleLine(this);
		}
		
	}

}
