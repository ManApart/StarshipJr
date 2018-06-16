package rak.starshipJr.ship.cards;

public class Sensor extends Card {
	private int range;
	
	
	public int getResolution(){
		return (int) (getStoredPower() * getEfficiency());
	}


	public int getRange() {
		return range;
	}


	public void setRange(int range) {
		this.range = range;
	}
	
	

}
