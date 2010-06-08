package com.moonstudio.dp.responsibilitychain.javawebimitation;

/**
 * 处理Scrip标签
 * 
 * @author ThrFou
 * 
 */
public class HtmlFilter implements Filter {

	@Override
	public void doFilter(Request request, Response response) {
		String newStr = request.getRequestStr().replace("<", "[").replace(">",
				"]")+"...HtmlFilter...";
		request.setRequestStr(newStr);
	}

}