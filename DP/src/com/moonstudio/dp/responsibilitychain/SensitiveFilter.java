package com.moonstudio.dp.responsibilitychain;

/**
 * 敏感字眼的处理
 * 
 * @author ThrFou
 * 
 */
public class SensitiveFilter implements Filter {

	@Override
	public String doFilter(String oldStr) {
		return oldStr.replace("被就业", "就业").replace("敏感", "");
	}

}
