package com.sushanth.task4;
import java.util.*;
public class CdCollectionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<CD> cds=new TreeSet<CD>();
		CD cd1=new CD("Title1","Vayush");
		CD cd2=new CD("Title12","Aayush");
		CD cd3=new CD("Title13","Kayush");
		CD cd4=new CD("Title14","Hayush");
		CD cd5=new CD("Title15","Sayush");
		cds.add(cd5);
		cds.add(cd3);
		cds.add(cd2);
		cds.add(cd1);
		cds.add(cd4);
		CdCollection coll=new CdCollection();
		coll.setCds(cds);
		coll.display();
	}
}
