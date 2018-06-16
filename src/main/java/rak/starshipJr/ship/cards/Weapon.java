package rak.starshipJr.ship.cards;

public class Weapon extends Card {
	private int range;
	
	public int getDamage(){
		return (int) (getStoredPower() * getEfficiency());
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}
	

}
