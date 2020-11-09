package farmGame;

public class Cow extends Animal {
	
	private static final AnimalProperties animalType = AnimalProperties.COW;
	
	public Cow(String name, int weight) {
		super(name, weight);
	}
	
	public Cow(String name, int weight, int daysUnfed, int daysUngrown) {
		super(name, weight, daysUnfed, daysUngrown);
	}

	@Override
	protected int getFeedingInterval() {
		return animalType.feedingInterval;
	}

	@Override
	protected int getMaxWeight() {
		return animalType.maxWeight;
	}

	@Override
	protected int getGrowInterval() {
		return animalType.growInterval;
	}

	@Override
	protected int getWeightIncrement() {
		return animalType.weightIncrement;
	}

}
