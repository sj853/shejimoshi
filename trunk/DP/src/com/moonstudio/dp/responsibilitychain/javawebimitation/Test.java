package com.moonstudio.dp.responsibilitychain.javawebimitation;

public class Test {

	public static void main(String[] args) {

		String msg = "大家好：） <h2><script> :) 敏感信息 ：）和谐 :) 被就业 ";
		Request request = new Request();
		request.setRequestStr(msg);

		Response response = new Response();
		response.setResponseStr("response");
		System.out.println("Old:\n" + request.getRequestStr() + "\n"
				+ response.getResponseStr());

		FilterChain fc = new FilterChain();
		fc.addFilter(new HtmlFilter()).addFilter(new SensitiveFilter());

		fc.doFilter(request, response);

		System.out.println("New:\n" + request.getRequestStr() + "\n"
				+ response.getResponseStr());

	}

}