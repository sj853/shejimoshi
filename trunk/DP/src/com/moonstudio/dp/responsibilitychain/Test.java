package com.moonstudio.dp.responsibilitychain;

public class Test {

	public static void main(String[] args) {

		String msg = "大家好：） <h2><script> :) 敏感信息 ：）和谐 :) 被就业 ";
		System.out.println("oldStr ：" + msg);

		FilterChain fc = new FilterChain();
		fc.addFilter(new HtmlFilter()).addFilter(new SensitiveFilter());

		FilterChain fc2 = new FilterChain();
		fc.addFilter(new OtherFilter());

		fc.addFilter(fc2);

		String result = fc.doFilter(msg);
		System.out.println("newStr ： " + result);

	}

}