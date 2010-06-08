package com.moonstudio.dp.responsibilitychain.javawebimitation;

/**
 * 处理Scrip标签
 * 
 * @author ThrFou
 * 
 */
public class HtmlFilter implements Filter {

	@Override
	public void doFilter(Request request, Response response,
			FilterChain filterChain) {
		String newStr = request.getRequestStr().replace("<", "[").replace(">",
				"]")
				+ "...HtmlFilter...";
		request.setRequestStr(newStr);
		// 如果有非法的东西，想中断这个操作，那么就不要调用链条的dofilter了
		filterChain.doFilter(request, response, filterChain);
		response.setResponseStr(response.getResponseStr() + "...HtmlFilter...");
	}

}
