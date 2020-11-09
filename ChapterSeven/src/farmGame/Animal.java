package farmGame;

import java.util.concurrent.ThreadLocalRandom;

abstract class Animal implements Feedable, Growable {

	public static final String NO_NAME = "Not named";
	private String name;
	private int weight;
	private int daysUnfed;
	private int daysUngrown;

	public Animal(String name, int weight) {

		if (name == null)
			name = Animal.NO_NAME;
		else
			this.name = name;

		this.setWeight(weight);
		this.setDaysUnfed(ThreadLocalRandom.current().nextInt(0, 5 + 1));
		this.setDaysUngrown(ThreadLocalRandom.current().nextInt(this.getGrowInterval() - this.getGrowInterval()/2, this.getGrowInterval() + this.getGrowInterval()/2 + 1));
	}

	public Animal(String name, int weight, int daysUnfed, int daysUngrown) {

		if (name == null)
			name = Animal.NO_NAME;
		else
			this.name = name;

		this.setWeight(weight);
		this.setDaysUnfed(daysUnfed);
		this.setDaysUngrown(daysUngrown);
	}

	private void setDaysUnfed(int daysUnfed) throws IllegalArgumentException {
		if (daysUnfed < 0)
			throw new IllegalArgumentException(
					this.getPrintString("requested to set number of days unfed to negative value."));
		this.daysUnfed = daysUnfed;
	}

	private void setDaysUngrown(int daysUngrown) throws IllegalArgumentException {
		if (daysUngrown < 0)
			throw new IllegalArgumentException(
					this.getPrintString("requested to set number of days ungrown to negative value."));
		this.daysUngrown = daysUngrown;
	}

	private void setWeight(int weight) throws IllegalArgumentException {
		if (weight < 0)
			throw new IllegalArgumentException(this.getPrintString("requested to set weight to negative value."));
		if (weight > getMaxWeight())
			throw new IllegalArgumentException(this.getPrintString("requested to set weight higher than its maximum."));
		this.weight = weight;
	}

	protected abstract int getFeedingInterval();

	protected abstract int getMaxWeight();

	protected abstract int getGrowInterval();

	protected abstract int getWeightIncrement();

	public boolean isHungry() {
		return (daysUnfed >= getFeedingInterval());
	}

	public boolean isFullyGrown() {
		return (weight >= getMaxWeight());
	}

	private boolean hasGrownRecently() {
		return (daysUngrown < getGrowInterval());
	}

	private boolean canGrow() {
		return (!isHungry() && !isFullyGrown() && !hasGrownRecently());
	}

	public void feed() {
		if (isHungry()) {
			this.setDaysUnfed(0);
			this.printMessage("has been fed.");
		} else {
			this.printMessage("is not hungry yet.");
		}
	}

	public void grow() {
		if (canGrow()) {
			this.increaseWeight();
			this.setDaysUngrown(0);
			return;
		}
		if (isFullyGrown())
			this.printMessage("cannot grow any more.");
		else if (isHungry())
			this.printMessage("is too hungry to grow now.");
		else if (hasGrownRecently())
			this.printMessage("has grown recetly and cannot grow just yet.");
	}

	private void increaseWeight() throws IllegalStateException {
		if (weight >= getMaxWeight())
			throw new IllegalStateException(
					getPrintString("requested increase of weight even with max weight reached!"));
		if ((weight + getWeightIncrement()) > getMaxWeight()) {
			this.setWeight(getMaxWeight());
			printMessage("has increased weight to its maximum.");
		} else {
			this.setWeight(weight + getWeightIncrement());
			printMessage("has gained weight.");
		}
	}

	private void printMessage(String mess) {
		System.out.println(getPrintString(mess));
	}

	private String getPrintString(String mess) {
		return this.toString() + " " + mess;
	}

	public void printStatus() {
		System.out.println(this.toLongString());
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [" + (name != null ? name : "nullName") + "]";
	}

	public String toLongString() {
		return this.getClass().getSimpleName() + " [" + (name != null ? "name=" + name + ", " : "") + "weight=" + weight + ", daysUnfed="
				+ daysUnfed + ", daysUngrown=" + daysUngrown + "]";
	}

	public void newDay() {
		this.setDaysUnfed(daysUnfed + 1);
		this.setDaysUngrown(daysUngrown + 1);
	}

}
