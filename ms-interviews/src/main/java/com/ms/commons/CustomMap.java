package com.ms.commons;

import java.util.HashMap;

public class CustomMap extends HashMap<String, String> {

	private static final long serialVersionUID = 1L;

	@Override
	public int hashCode() {
		return 5;
	}

}
