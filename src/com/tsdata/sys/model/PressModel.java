package com.tsdata.sys.model;

import java.util.List;

import com.tsdata.sys.entity.PressExt;

public class PressModel {

	private PressExt pressExt;
	
	private PressExt pressQueryCon;
	
	private int currentPage = 1;
	
	private int pageSize = 20;
	
	private int totalCount;
	
	private int pageCount;
	
	private Long[] checkId;
	
	private Long dataId;
	
	private List<PressExt> items;
	
	private String operationType;
	
	private String errorMessage;

	public PressExt getPressExt() {
		return pressExt;
	}

	public void setPressExt(PressExt pressExt) {
		this.pressExt = pressExt;
	}

	public PressExt getPressQueryCon() {
		return pressQueryCon;
	}

	public void setPressQueryCon(PressExt pressQueryCon) {
		this.pressQueryCon = pressQueryCon;
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

	public List<PressExt> getItems() {
		return items;
	}

	public void setItems(List<PressExt> items) {
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