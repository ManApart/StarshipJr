package rak.starshipJr.ship.cards;

public class Shield extends Card {
	private int range;
	
	public int getStrength(){
		return (int) (getStoredPower() * getEfficiency());
	}
	
	public int getRange(){
		return range;
	}

}
