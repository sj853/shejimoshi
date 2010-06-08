package com.moonstudio.dp.responsibilitychain.javawebimitation;

/**
 * 敏感字眼的处理
 * 
 * @author ThrFou
 * 
 */
public class SensitiveFilter implements Filter {

	@Override
	public void doFilter(Request request, Response response) {
		String newStr = request.getRequestStr().replace("被就业", "就业").replace(
				"敏感", "")
				+ "...SensitiveFilter...";
		request.setRequestStr(newStr);

	}

}
