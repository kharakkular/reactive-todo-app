package com.ksk.reactive.todo.restApi.payloads;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaginatedResponse<T> {
	
	private List<T> todos;
	private long totalElements;
	private int pageSize;
	private int pageNo;
	private boolean isLast;
	private int totalPages;
	private int currentPageItemsCount;
	
}
