package rak.starshipJr.ship;

import rak.starshipJr.ship.cards.Card;

public class Tile {
	private Card card;
	private int resolution;
	private int x, y;
	private TileType tileType;
	
	public Tile(int x, int y){
		this.x = x;
		this.y = y;
		this.tileType = TileType.SPACE;
	}
	
	public Card getCard() {
		return card;
	}
	public void setCard(Card card) {
		this.card = card;
	}
	public int getResolution() {
		return resolution;
	}
	public void setResolution(int resolution) {
		this.resolution = resolution;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	public TileType getTileType() {
		return tileType;
	}

	public void setTileType(TileType tileType) {
		this.tileType = tileType;
	}
	
	
	
}
