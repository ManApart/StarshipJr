package rak.starshipJr.ship;

import rak.starshipJr.ship.systems.Cargo;
import rak.starshipJr.ship.systems.Navigation;
import rak.starshipJr.ship.systems.Power;
import rak.starshipJr.ship.systems.Sensors;
import rak.starshipJr.ship.systems.Shields;
import rak.starshipJr.ship.systems.Weapons;

public class Ship {

	private Cargo cargo;
	private Navigation navigation;
	private Power power;
	private Sensors sensors;
	private Shields shields;
	private Weapons weapons;
	private ShipLayout layout;
	
	public Ship(int size){
		init(size);
	}
	
	private void init(int size) {
		cargo = new Cargo();
		navigation = new Navigation();
		power = new Power();
		sensors = new Sensors();
		shields = new Shields();
		weapons = new Weapons();
		layout = new ShipLayout(size);
	}

	public void doTurn(){
		layout.resetPower();
	}

	public Cargo getCargo() {
		return cargo;
	}

	public Navigation getNavigation() {
		return navigation;
	}

	public Power getPower() {
		return power;
	}

	public Sensors getSensors() {
		return sensors;
	}

	public Shields getShields() {
		return shields;
	}

	public Weapons getWeapons() {
		return weapons;
	}

	public ShipLayout getLayout() {
		return layout;
	}
	
	
	
}
