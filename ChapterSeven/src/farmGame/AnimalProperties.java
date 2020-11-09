package farmGame;

public enum AnimalProperties {
	PIG(	5, 		// feeding interval
			250, 	// maximum weight
			12, 	// days needed between growing
			10), 	// weight gained when grown
	
	DOG(	2, 		// feeding interval
			55, 	// maximum weight
			7, 		// days needed between growing
			4), 	// weight gained when grown

	COW(	4, 		// feeding interval
			700, 	// maximum weight
			9, 		// days needed between growing
			15);	// weight gained when grown

	public final int feedingInterval;
	public final int maxWeight;
	public final int growInterval;
	public final int weightIncrement;

	private AnimalProperties(int feedingInterval, int maxWeight, int growInterval, int weightIncrement) {
		this.feedingInterval = feedingInterval;
		this.maxWeight = maxWeight;
		this.growInterval = growInterval;
		this.weightIncrement = weightIncrement;
	}

}
