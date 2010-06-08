package com.moonstudio.dp.responsibilitychain.javawebimitation;

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

	@Override
	public void doFilter(Request request, Response response) {
		for (Filter f : filterChain) {
			f.doFilter(request, response);
		}
	}

}
