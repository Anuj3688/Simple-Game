
public class Player1 {
	private String name;
	private String weapon;
	private int health;
	
	public Player1(String name, String weapon, int health) {
		this.name = name;
		this.weapon = weapon;
		this.health = health;
		if(this.health < 0 || this.health > 100) {
			this.health = 100;
		}
	}
	public Player1(String name , String weapon){
		this.name = name;
		this.weapon = weapon;
	}
	public void damageByGun1() {
		this.health -= 30;
		if(this.health<=0)
			health = 0;
		System.out.println("Got hit by Gun 1 health reduced by 30 "+"New Health is "+this.health);
		
		if(this.health == 0) {
			System.out.println(getName()+" is dead");
		}
	}
	
	public void damageByGun2() {
		this.health -= 50;
		if(this.health<=0)
			health = 0;
		System.out.println("Got hit by Gun 1 health reduced by 50 "+"New Health is "+this.health);
		
		if(this.health == 0) {
			System.out.println(getName()+" is head");
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWeapon() {
		return weapon;
	}
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public void heal() {
		if(health<=0) 
			System.out.println("Player cannot be healed");
		else
			health = 100;
		
		System.out.println("New health is "+health);
	}
}
