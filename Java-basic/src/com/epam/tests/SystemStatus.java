package com.epam.tests;

public enum SystemStatus {

	STOPPED("status"), INITIALIZED("status"), WAITING("status"), RUNNING("status");
	
	private String status;
	
	private SystemStatus(String status){
		this.status = status;
	}
	
}
