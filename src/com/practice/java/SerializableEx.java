package com.practice.java;

import java.io.Serializable;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

public class SerializableEx implements Serializable {

	private int id;
	private String classs;
//	private String newVar;

	public SerializableEx(int id, String classs, String newVar) {
		super();
		this.id = id;
		this.classs = classs;
//		this.newVar = newVar;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClasss() {
		return classs;
	}

	public void setClasss(String classs) {
		this.classs = classs;
	}
//
//	public String getNewVar() {
//		return newVar;
//	}
//
//	public void setNewVar(String newVar) {
//		this.newVar = newVar;
//	}

}
