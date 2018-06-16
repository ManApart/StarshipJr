package rak.starshipJr;

import rak.starshipJr.ship.Ship;

public class GameManager {
	private StoryManager storyManager;
	private Ship playerShip;
	
	
	public void doTurn(){
		
		storyManager.doTurn();
		playerShip.doTurn();
	}

}
