
public class YugiOhCard {
	String name;
	int level;
	int attack;
	int defence;

	public YugiOhCard(String name, int level, int attack, int defence) {
		super();
		this.name = name;
		this.level = level;
		this.attack = attack;
		this.defence = defence;
	}
    
                  //This method returns true only if the card that calls it is 'equal' to card o .
	public boolean equals(Object o) { // o is another card to compare with 
		YugiOhCard o2 = (YugiOhCard) o;
		return true; //remove this line
		// fill in the rest of the code

	}

}
