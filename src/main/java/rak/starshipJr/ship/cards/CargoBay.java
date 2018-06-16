package rak.starshipJr.ship.cards;

import java.util.ArrayList;
import java.util.Collection;

public class CargoBay extends Card {
	private int totalCapacity;
	private ArrayList<Card> cards;

	public int getAvailableCapacity() {
		return totalCapacity - cards.size();
	}

	public int getTotalCapacity() {
		return totalCapacity;
	}

	public Collection<? extends Card> getCards() {
		return cards;
	}

	public boolean addCard(Card card) {
		boolean success = false;
		if (getAvailableCapacity() > 0){
			cards.add(card);
			success = true;
		}
		return success;		
	}

	public boolean removeCard(Card card) {
		boolean success = false;
		if (cards.contains(card)){
			cards.remove(card);
			success = true;
		}
		return success;
	}

}
