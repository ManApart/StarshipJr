package rak.starshipJr.ship.cards;

public class WarpCore extends Card {

	public int getJumpRange() {
		return (int) (getEfficiency() * getStoredPower());
	}
	

}
