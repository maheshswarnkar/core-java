package com.stringex;

public class StringEx {

	public static void main(String[] args) {
		String routeValue = "1";
		String routeName="";
		String VALUE="\"value\"";
		String DQ = "\"";
		
		if(routeValue != null) {
			int idx1 = routeValue.indexOf(VALUE);
			if (idx1 != -1) {
				int idx2 = routeValue.indexOf(DQ, (idx1 + 7));
				int idx3 = routeValue.indexOf(DQ, idx2 + 1);
				routeName = routeValue.substring(idx2 + 1, idx3);
			}
		}

	}

}
