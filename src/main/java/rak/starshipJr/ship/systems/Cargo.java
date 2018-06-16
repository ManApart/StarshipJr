package rak.starshipJr.ship.systems;

import java.util.ArrayList;

import rak.starshipJr.ship.cards.Card;
import rak.starshipJr.ship.cards.CargoBay;

public class Cargo {
	private ArrayList<CargoBay> cargo;
	
	public Cargo(){
		cargo = new ArrayList<>();
	}
	
	public int getTotalCapacity(){
		int capacity = 0;
		for (CargoBay bay : cargo){
			capacity += bay.getTotalCapacity();
		}
		return capacity;
	}
	
	public int getAvailableCapacity(){
		int capacity = 0;
		for (CargoBay bay : cargo){
			capacity += bay.getAvailableCapacity();
		}
		return capacity;
	}
	
	public boolean addCard(Card card){
		boolean success = false;
		for (CargoBay bay : cargo){
			success = bay.addCard(card);
			if (success){
				break;
			}
		}
		return success;
	}

	public boolean removeCard(Card card){
		boolean success = false;
		for (CargoBay bay : cargo){
			success = bay.removeCard(card);
			if (success){
				break;
			}
		}
		return success;
	}
	
	public ArrayList<Card> getAllCards(){
		ArrayList<Card> cards = new ArrayList<>();
		for (CargoBay bay : cargo){
			cards.addAll(bay.getCards());
		}
		return cards;
	}
}
