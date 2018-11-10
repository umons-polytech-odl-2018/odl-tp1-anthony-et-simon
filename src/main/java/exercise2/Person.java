package exercise2;

import jdk.management.resource.internal.TotalResourceContext;

class Person {
	private int age;
	private static int TotalAge=0;
	private static int PopulationSize=0;


	public Person(int a) {
		age = a;
		PopulationSize++;
		TotalAge+=age;
	}


	public static int computePopulationSize()
	{
		return PopulationSize;
	}

	public static float computeAveragePopulationAge()
	{
		return (float) TotalAge/PopulationSize;
	}

	public static void resetPopulation()
	{
		TotalAge=0;
		PopulationSize=0;
	}

}
