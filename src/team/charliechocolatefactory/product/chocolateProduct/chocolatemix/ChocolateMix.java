package team.charliechocolatefactory.product.chocolateProduct.chocolatemix;

import java.text.SimpleDateFormat;
import java.util.AbstractList;
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
 * @date 2020/11/16 01:04
 */
public class ChocolateMix extends Product {

	private final Chocolate[] chocolates;

	/**
	 * ctor of ChocolateMix
	 * 
	 * @param typeList List of extended class of Chocolate. Eg: {MilkChocolate.class}
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
		ArrayList<Class<? extends Chocolate>> classes = new ArrayList<>();
		classes.add(MilkChocolate.class);
		classes.add(DarkChocolate.class);
		ChocolateMix chocolateMix = new ChocolateMix(classes);
		chocolateMix.at(1);
	}

}
