package io.glome.schema.domain;

public interface Matcher {

	boolean matches(Object actual);
	
	String getMismatchDescription();
}
