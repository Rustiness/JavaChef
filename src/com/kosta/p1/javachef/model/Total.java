package com.kosta.p1.javachef.model;

public class Total {
	private int total;
	
	public Total() {
	}
	
	public Total(int total){
		this.total = total;
	}

	public int getTotal() {
		return total;
	}
	
	public void setTotal(int total) {
		this.total += total;
	}

	
}
