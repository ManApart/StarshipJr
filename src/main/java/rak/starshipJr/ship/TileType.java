package rak.starshipJr.ship;

import javafx.scene.paint.Color;

public enum TileType {
	SPACE(0, Color.BLACK), STRUCTURE(1, Color.GRAY), SYSTEM(2, Color.WHITE);
	
	private Color color;
	private int value;
	
	private TileType(int value, Color color){
		this.color = color;
		this.value = value;
	}
	
	public int getValue(){
		return value;
	}
	
	public Color getColor(){
		return color;
	}
}
