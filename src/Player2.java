
public class Player2 extends Player1{
	private int health1;
	private boolean armour;
	public Player2(String name, String weapon, int health1, boolean armour) {
		super(name, weapon);
		this.health1 = health1;
		this.armour = armour;
	}
	@Override
	public void damageByGun1() {
		// TODO Auto-generated method stub
		if(armour) {
			health1 -= 20;
			if(this.health1<0)
				health1 = 0;
			System.out.println("Armour is got. Got health by Gun 1. Health is reduced by 20.");
			System.out.println("New health is "+this.health1);
		}else {
			this.health1 -= 30;
			if(this.health1 < 0)
				this.health1 = 0;
			System.out.println("Armour is got. Got health by Gun 1. Health is reduced by 30.");
			System.out.println("New health is "+this.health1);
		}
	}
	public int getHealth1() {
		return health1;
	}
	public void setHealth1(int health1) {
		this.health1 = health1;
	}
	@Override
	public void damageByGun2() {
		if(armour) {
			health1 -= 40;
			if(this.health1<0)
				health1 = 0;
			System.out.println("Armour is got. Got health by Gun 1. Health is reduced by 40.");
			System.out.println("New health is "+this.health1);
		}else {
			this.health1 -= 50;
			if(this.health1 < 0)
				this.health1 = 0;
			System.out.println("Armour is got. Got health by Gun 1. Health is reduced by 50.");
			System.out.println("New health is "+this.health1);
		}
	}
	@Override
	public void heal() {
		// TODO Auto-generated method stub
		if(health1<=0) 
			System.out.println("Player cannot be healed");
		else
			health1 = 100;
		
		System.out.println("New health is "+health1);
	}
	
}
