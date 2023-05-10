
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player1 p1 = new Player1("Warrior","Sword",100);
//		System.out.println("Player 1 name: "+p1.getName());
//		System.out.println("Player 1 weapon: "+p1.getWeapon());
//		System.out.println("Player 1 health: "+p1.getHealth());
		
		p1.damageByGun1();
		p1.damageByGun2();
		p1.damageByGun1();
		p1.heal();
		
		Player2 p2 = new Player2("Soldier" , "Pistol" , 90 , true);
		System.out.println("Player 2 name: "+p2.getName());
		System.out.println("Player 2 weapon: "+p2.getWeapon());
		System.out.println("Player 2 health: "+p2.getHealth1());
		p2.damageByGun1();
		p2.damageByGun2();
		p2.damageByGun1();
		p2.heal();
	}

}
