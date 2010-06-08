package com.moonstudio.dp.responsibilitychain;

/**
 * 处理Scrip标签
 * 
 * @author ThrFou
 * 
 */
public class HtmlFilter implements Filter {

	@Override
	public String doFilter(String oldStr) {
		String newStr = oldStr.replace("<", "[").replace(">", "]");
		return newStr;

	}

}
