
public class MidtermLabTest {

	public static void main(String[] args) {
		
		Warrior warrior = new Warrior("William Wallace"); 
		warrior.inventory.add(new Sword());
		warrior.inventory.add(new MagicHerb());
		System.out.println(warrior);
		System.out.println("Is alive : " + warrior.isAlive());
		System.out.println();
		
		Wizard wizard = new Wizard("Merlin"); 
		wizard.inventory.add(new Sword());
		wizard.inventory.add(new MagicHerb());
		System.out.println(wizard);
		System.out.println("Is alive : " + wizard.isAlive());
		System.out.println();
		
		System.out.println("Warrior uses sword on wizard:");
		Weapon weapon = warrior.inventory.fetchWeapon("Sword");
		System.out.println("Fetched : " + weapon);
		for (int i=0; i<5; i++) {
			warrior.attack(wizard, weapon);
			System.out.println(wizard);
		}
		System.out.println();

		System.out.println("Wizard uses herb to heal himself:");		
		Herb herb = wizard.inventory.fetchHerb("MagicHerb");
		wizard.heal(herb);
		System.out.println(wizard);
		
		System.out.println("Wizard uses sword on warrior:");
		Weapon sword = wizard.inventory.fetchWeapon("Sword");
		System.out.println("Fetched : " + sword);
		while (warrior.isAlive()) {
			wizard.attack(warrior, weapon);
			System.out.println(warrior);
		}
	}
	

}
