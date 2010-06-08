package com.moonstudio.dp.responsibilitychain.javawebimitation;

/**
 * 敏感字眼的处理
 * 
 * @author ThrFou
 * 
 */
public class SensitiveFilter implements Filter {

	@Override
	public void doFilter(Request request, Response response,
			FilterChain filterChain) {
		String newStr = request.getRequestStr().replace("被就业", "就业").replace(
				"敏感", "")
				+ "...SensitiveFilter...";
		request.setRequestStr(newStr);
		// 如果有非法的东西，想中断这个操作，那么就不要调用链条的dofilter了
		filterChain.doFilter(request, response, filterChain);
		response.setResponseStr(response.getResponseStr() + "...SensitiveFilter...");

	}

}
