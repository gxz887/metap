package com.tsdata.sys.model;

import java.util.List;

import com.tsdata.sys.entity.CategoryExt;

public class CategoryModel {

	private CategoryExt categoryExt;
	
	private CategoryExt categoryQueryCon;
	
	private int currentPage = 1;
	
	private int pageSize = 20;
	
	private int totalCount;
	
	private int pageCount;
	
	private Long[] checkId;
	
	private Long dataId;
	
	private List<CategoryExt> items;
	
	private String operationType;
	
	private String errorMessage;

	public CategoryExt getCategoryExt() {
		return categoryExt;
	}

	public void setCategoryExt(CategoryExt categoryExt) {
		this.categoryExt = categoryExt;
	}

	public CategoryExt getCategoryQueryCon() {
		return categoryQueryCon;
	}

	public void setCategoryQueryCon(CategoryExt categoryQueryCon) {
		this.categoryQueryCon = categoryQueryCon;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	
	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public Long[] getCheckId() {
		return checkId;
	}

	public void setCheckId(Long[] checkId) {
		this.checkId = checkId;
	}

	public Long getDataId() {
		return dataId;
	}

	public void setDataId(Long dataId) {
		this.dataId = dataId;
	}

	public List<CategoryExt> getItems() {
		return items;
	}

	public void setItems(List<CategoryExt> items) {
		this.items = items;
	}

	public String getOperationType() {
		return operationType;
	}

	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}
		public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}