package com.company;

public class Main {

    public static void main(String[] args) {
	Auto auto1 = new Auto("Citroen", "2ZV", 1987,"benzin", 24);
	Auto auto2 = new Auto("Audi", "Q3", 2015,"dizel", 130);
	Auto auto3 = new Auto("Volkswagen", "Passat", 2011,"dizel", 140);
	Auto auto4 = new Auto("Tesla", "Model 3", 2019,"electro", 464);
	Auto auto5 = new Auto("Ford", "Mustang", 2014,"benzin", 449);

	Auto []autoArray = {auto1,auto2,auto3,auto4,auto5};
		for (int i = 0; i < autoArray.length; i++) {
			autoArray[i].print();

		}
    }
}
