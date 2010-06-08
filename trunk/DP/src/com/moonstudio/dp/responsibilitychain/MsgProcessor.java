package com.moonstudio.dp.responsibilitychain;

/**
 * 信息处理的类
 * 
 * @author ThrFou
 * 
 */
public class MsgProcessor {

	Filter[] filters = { new HtmlFilter(), new SensitiveFilter() };

	private String msg;

	public String process() {

		String r = msg;
		for (Filter f : filters) {
			r = f.doFilter(r);
		}
		return r;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
