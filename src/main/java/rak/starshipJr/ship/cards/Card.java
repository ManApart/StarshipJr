package rak.starshipJr.ship.cards;

import java.util.ArrayList;

import rak.starshipJr.ship.Tile;

public abstract class Card {
	protected int storedPower = 0;
	private int powerCapacity;
	private float efficiency;
	private int width, height;
	
	//If this card is installed on a ship it will have be placed on some tiles
	private ArrayList<Tile> currentTiles;
	
	protected Card(){
		currentTiles = new ArrayList<>();
	}
	
	public int getStoredPower(){
		return storedPower;
	}
	
	public int getPowerCapacity(){
		return powerCapacity;
	}
	
	
	/**
	 * Attempts to increase/decrease power by the requested amount.
	 * If the amount is <0 or the amount is > capacity then the change will only reach the adequate limit
	 * The actual change amount will be returned
	 * @param requestedAmount
	 * @return
	 */
	public int changePower(int requestedAmount){
		int remainingCapacity = getPowerCapacity() - getStoredPower();
		int amount = Math.min(requestedAmount, remainingCapacity);
		amount = Math.max(amount, 0);
		storedPower += amount;
		return amount;
	}
	
	/**
	 * Used at the begening of a turn to reset card power to 0
	 */
	public void resetPower(){
		storedPower = 0;
	}

	protected float getEfficiency() {
		return efficiency;
	}

	protected void setEfficiency(float efficiency) {
		this.efficiency = efficiency;
	}
	
	public void setPowerCapacity(int powerCapacity){
		this.powerCapacity = powerCapacity;
	}

	public void setStoredPower(int storedPower) {
		this.storedPower = storedPower;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public ArrayList<Tile> getCurrentTiles() {
		return currentTiles;
	}

	public void addTile(Tile currentTile) {
		this.currentTiles.add(currentTile);
	}
	
	public void clearCurrentTiles(){
		this.currentTiles.clear();
	}
	
	
}
