package org.zgl.info.bean;

public class Page {

	//当前页
	private int currentPage;
	
	//一页展示几条
	private int showCount;
	
	//一共几页
	private int totalPages;
	
	//一共几条
	private int totalCount;

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getShowCount() {
		return showCount;
	}

	public void setShowCount(int showCount) {
		this.showCount = showCount;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	
}
