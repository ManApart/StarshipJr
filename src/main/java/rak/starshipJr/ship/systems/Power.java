package rak.starshipJr.ship.systems;

import java.util.ArrayList;

import rak.starshipJr.ship.cards.Engine;

public class Power {
	private ArrayList<Engine> engines;
	private int powerUsedThisTurn;
	
	public int getTotalGeneratedPower(){
		int power = 0;
		for (Engine engine : engines){
			power += engine.getPowerCapacity();
		}
		return power;
	}
	
	public int getAvailableGeneratedPower(){
		return getTotalGeneratedPower() - powerUsedThisTurn;
	}
	
	/**
	 * Attempts to draw the requested amount of power from the engines. Returns the actual amount it was able to draw.
	 * @param requestedAmount
	 * @return
	 */
	public int usePower(int requestedAmount){
		int available = getAvailableGeneratedPower();
		int used = Math.min(requestedAmount, available);
		powerUsedThisTurn += used;
		return used;
	}
	
	/**
	 * When a player decides they didn't want to distribute that much power and puts some back into the engines
	 * @param amount
	 */
	public void returnPower(int amount){
		powerUsedThisTurn = Math.min(amount, getTotalGeneratedPower());
	}
	
	
	
	
}
