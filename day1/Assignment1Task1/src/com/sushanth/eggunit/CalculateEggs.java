package com.sushanth.eggunit;

public class CalculateEggs {
	private int totalNumberOfEggs;
	EggUnit convertedEggs=new EggUnit();
	public EggUnit getConvertedEggs() {
		setConvertedEggs(totalNumberOfEggs);
		return convertedEggs;
	}
	public void setTotalNumberOfEggs(int totalNumberOfEggs) {
		this.totalNumberOfEggs = totalNumberOfEggs;
	}
	private void setConvertedEggs(int totalNumberOfEggs) {
		int gross= totalNumberOfEggs/144;
		int dozen= (totalNumberOfEggs-(gross*144))/12;
		int remaining=(totalNumberOfEggs-(gross*144)-(dozen*12));
		convertedEggs.setGross(gross);
		convertedEggs.setDozen(dozen);
		convertedEggs.setRemaining(remaining);
	}
}