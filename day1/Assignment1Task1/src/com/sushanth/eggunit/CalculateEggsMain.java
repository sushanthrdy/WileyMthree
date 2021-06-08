package com.sushanth.eggunit;
import java.util.*;
public class CalculateEggsMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numberOfEggs=sc.nextInt();
		CalculateEggs eggs=new CalculateEggs();
		eggs.setTotalNumberOfEggs(numberOfEggs);
		eggs.getConvertedEggs();
		EggUnit convertedEggs=eggs.getConvertedEggs();
		convertedEggs.display();
	}
}
