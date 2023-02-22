package com.ms.commons;

import java.util.HashSet;

public class CustomHashSet extends HashSet<String> {

	private static final long serialVersionUID = 1L;

	@Override
	public int hashCode() {
		return 5;
	}

}
