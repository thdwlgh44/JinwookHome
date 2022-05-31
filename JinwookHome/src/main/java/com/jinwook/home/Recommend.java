package com.jinwook.home;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Recommend {

	private int recommendNo;
	private String userId;
	private int rcpNo;
	private int commentNo;
	
	public Recommend() {
	}
}
