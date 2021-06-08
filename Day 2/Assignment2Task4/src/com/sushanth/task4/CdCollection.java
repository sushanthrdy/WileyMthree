package com.sushanth.task4;
import java.util.*;
public class CdCollection {
	private Set<CD> cds=new TreeSet<CD>();

	public Set<CD> getCds() {
		return cds;
	}

	public void setCds(Set<CD> cds) {
		this.cds = cds;
	}
	public void display() {
		System.out.println("Printing CD details:");
		for(CD cd:cds) {
			System.out.println(cd.toString());
		}
	}
}
