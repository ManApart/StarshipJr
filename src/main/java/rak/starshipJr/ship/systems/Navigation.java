package rak.starshipJr.ship.systems;

import java.util.ArrayList;

import rak.starshipJr.ship.cards.WarpCore;

public class Navigation {
	private ArrayList<WarpCore> warpCores;
	
	public int getJumpRange(){
		int jumpRange = 0;
		for (WarpCore core : warpCores){
			jumpRange += core.getJumpRange();
		}
		return jumpRange;
	}
	
}
