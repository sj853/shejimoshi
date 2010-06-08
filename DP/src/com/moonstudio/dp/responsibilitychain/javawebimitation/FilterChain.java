package com.moonstudio.dp.responsibilitychain.javawebimitation;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter {

	List<Filter> filters = new ArrayList<Filter>();
	// 当前Filter
	private int currentIndex = 0;

	public FilterChain addFilter(Filter f) {
		filters.add(f);
		return this;
	}

	public FilterChain removeFilter(Filter f) {
		filters.remove(f);
		return this;
	}

	@Override
	public void doFilter(Request request, Response response,
			FilterChain filterChain) {
		if (currentIndex == filters.size()) {
			return;
		}
		Filter f = filters.get(currentIndex);
		currentIndex++;
		f.doFilter(request, response, filterChain);

	}

}
