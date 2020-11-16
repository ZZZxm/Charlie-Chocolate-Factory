package team.charliechocolatefactory.product.chocolateProduct.chocolatemix;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import team.charliechocolatefactory.product.chocolate.Chocolate;
import team.charliechocolatefactory.product.chocolate.*;
import team.charliechocolatefactory.rawmaterial.RawMaterial;
import team.charliechocolatefactory.rawmaterial.Box;
import team.charliechocolatefactory.product.Product;

/**
 * @project chocolateFactory
 * @classname ChocolateMix
 * @description Mixed chocolate pack. This is a part of Flyweight Pattern.
 * @author Ngae Zeh-ghau
 * @date 2020/11/16 12:27
 */
public class ChocolateMix extends Product {

	private final Chocolate[] chocolates;

	/**
	 * ctor of ChocolateMix
	 * 
	 * @param typeList List of extended class of Chocolate. Eg: MilkChocolate.class
	 * @throws NewInstanceFailureException Thrown when failed to create an instance.
	 */
	public ChocolateMix(List<Class<? extends Chocolate>> typeList)
			throws NewInstanceFailureException {
		super("Chocolate Mix", Integer.MAX_VALUE, 0);
		Chocolate chocolate = null;
		int chocolateShelfLife = 0;
		int index = 0;

		chocolates = new Chocolate[typeList.size()];
		for (Class<? extends Chocolate> type : typeList) {
			chocolate = MixChocolateFactory.getChocolate(type);
			chocolates[index] = chocolate;
			weight += chocolate.getWeight();
			chocolateShelfLife = chocolate.getShelfLife();
			if (chocolateShelfLife < shelfLife) {
				shelfLife = chocolateShelfLife;
			}
			index++;
		}
	}

	/**
	 * Get chocolate instance at index.
	 * 
	 * @param index index of instance
	 * @return chocolate instance
	 */
	public Chocolate at(int index) {
		if (index >= 0 && index < chocolates.length) {
			return chocolates[index];
		} else {
			return null;
		}
	}

	@Override
	public void packaging() {
		super.gotoNextState();
		System.out.println("Start packaging Chocolate Mix...");
		super.pack = new Box(0);
		super.gotoNextState();
		System.out.println("Finish packaging Chocolate Mix.");
		super.gotoNextState();

		Date day = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		super.setProducedDate(df.format(day));
	}

	@Override
	protected void initIngredientList() {
		for (Chocolate chocolate : chocolates) {
			for (RawMaterial material : chocolate.ingredientList) {
				if (!ingredientList.contains(material)) {
					ingredientList.add(material);
				}
			}
		}
	}

	/**
	 * Test for Flyweight Pattern.
	 * 
	 * @param args dummy
	 */
	public static void main(String[] args) throws Exception {
		// create an array of [Matcha, Dark, Milk, Matcha, Dark, White, Sandwich, White]
		ArrayList<Class<? extends Chocolate>> classes = new ArrayList<>();
		classes.add(MatchaChocolate.class);
		classes.add(DarkChocolate.class);
		classes.add(MilkChocolate.class);
		classes.add(MatchaChocolate.class);
		classes.add(DarkChocolate.class);
		classes.add(WhiteChocolate.class);
		classes.add(SandwichChocolate.class);
		classes.add(WhiteChocolate.class);

		/*
		 * the following line should print:
		 * 
		 * "Creating chocolate of type: MatchaChocolate"
		 * 
		 * "Creating chocolate of type: DarkChocolate"
		 * 
		 * "Creating chocolate of type: MilkChocolate"
		 * 
		 * "Creating chocolate of type: WhiteChocolate"
		 * 
		 * "Creating chocolate of type: SandwichChocolate"
		 */
		ChocolateMix chocolateMix = new ChocolateMix(classes);
		// the following lines should both print "true"
		System.out.println(chocolateMix.at(0) == chocolateMix.at(3));
		System.out.println(chocolateMix.at(1) == chocolateMix.at(4));

		DarkChocolate myDarkChocolate = new DarkChocolate();
		// the following line should print "false"
		System.out.println(chocolateMix.at(1) == myDarkChocolate);

		/*
		 * the following lines should print:
		 * 
		 * "Creating chocolate of type: Chocolate"
		 * 
		 * "[Exception Handled] Cannot directly instantiate Chocolate!"
		 */
		try {
			ArrayList<Class<? extends Chocolate>> baseChocolate = new ArrayList<>();
			baseChocolate.add(Chocolate.class);
			new ChocolateMix(baseChocolate);
		} catch (NewInstanceFailureException e) {
			System.out.println("[Exception Handled] Cannot directly instantiate Chocolate!");
		}
	}

}
