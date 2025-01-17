package q105;

import java.text.DecimalFormat;

public class Main {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("###,###");

		City[] cities = { new City("Seoul", df.format(10312545), df.format(91375)),
				new City("Pusan", df.format(3567910), df.format(5868)),
				new City("Incheon", df.format(2758296), df.format(64888)),
				new City("Daegu", df.format(2511676), df.format(17230)),
				new City("Gwangju", df.format(1454636), df.format(29774)) };

		for (City city : cities) {
			city.printInfo();
		}
	}
}

class City {
	private String name;
	private String population;
	private String growth;

	public City(String name, String population, String growth) {
		this.name = name;
		this.population = population;
		this.growth = "+" + growth;
	}

	public void printInfo() {
		System.out.printf("%15s%15s%15s\n", name, population, growth);
	}
}