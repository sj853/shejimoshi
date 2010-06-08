package com.moonstudio.dp.responsibilitychain;

public class OtherFilter implements Filter {

	@Override
	public String doFilter(String oldStr) {
		return oldStr.replace(":)", ":(");
	}

}
