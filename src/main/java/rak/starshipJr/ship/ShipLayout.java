package rak.starshipJr.ship;

import java.util.ArrayList;

import rak.starshipJr.ship.cards.Card;


public class ShipLayout {
	private int maxSize;
	Tile[][] tiles;
	
	public ShipLayout(int size) {
		this.maxSize = size;
		tiles = new Tile[maxSize][maxSize];
		for (int x=0; x<maxSize; x++){
			for (int y=0; y<maxSize; y++){
				tiles[x][y] = new Tile(x,y);
			}
		}
	}
	
	public void resetPower(){
		for (Tile[] rows : tiles){
			for (Tile tile : rows){
				if (tile.getCard() != null){
					tile.getCard().resetPower();
				}
			}
		}
	}
	
	public int occupiedCount(){
		int count = 0;
		for (Tile[] rows : tiles){
			for (Tile tile : rows){
				if (tile.getCard() != null){
					count++;
				}
			}
		}
		return count;
	}
	
	public Card getCard(int x, int y){
		Card card = null;
		if (isValidLocation(x, y)){
			card = tiles[x][y].getCard();
		}
		return card;
	}
	
	private boolean isValidLocation(int x, int y){
		boolean valid = false;
		if (x >= 0 && y >= 0){
			if (x < maxSize && y < maxSize){
				valid = true;
			}
		}
		return valid;
	}
	
	public boolean placeCard(Card card, int x, int y){
		boolean success = false;
		ArrayList<Tile> tiles = getTilesInShape(x, y, card.getWidth(), card.getHeight());
		if (areAllTilesSystemTiles(tiles)){
			for (Tile tile : tiles){
				tile.setCard(card);
				card.addTile(tile);
			}
		}
		
		return success;
	}
	
	private ArrayList<Tile> getTilesInShape(int x, int y, int width, int height){
		ArrayList<Tile> tiles = new ArrayList<>();
		
		return tiles;
	}
	
	private boolean areAllTilesSystemTiles(ArrayList<Tile> tiles){
		boolean systemTiles = true;
		for (Tile tile : tiles){
			if (!TileType.SYSTEM.equals(tile.getTileType())){
				systemTiles = false;
			}
		}
		
		return systemTiles;
	}
	
	public Card removeCard(int x, int y){
		Card card = getCard(x, y);
		if (card != null){
			for (Tile tile : card.getCurrentTiles()){
				tile.setCard(null);
			}
			card.clearCurrentTiles();
		}
		return card;
	}
	
	public Tile[][] getTiles(){
		return tiles;
	}
}
