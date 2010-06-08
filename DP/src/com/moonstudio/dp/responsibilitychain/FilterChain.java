package com.moonstudio.dp.responsibilitychain;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter {

	List<Filter> filterChain = new ArrayList<Filter>();

	public FilterChain addFilter(Filter f) {
		filterChain.add(f);
		return this;
	}

	public FilterChain removeFilter(Filter f) {
		filterChain.remove(f);
		return this;
	}

	public String doFilter(String str) {
		String r = str;
		for (Filter f : filterChain) {
			r = f.doFilter(r);
		}
		return r;
	}

}
