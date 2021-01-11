package r0829194;

public final class DesktopComputer extends Device {

	private final int cpuCores; // number of processor cores
	private final int memSize; // memory size
	private final int noHDD; // number of Hard drives

	public DesktopComputer(String infoSummary, String brand, double screenDiagonal, int cpuCores, int memSize,
			int noHDD) {
		super(infoSummary, brand, screenDiagonal);
		this.cpuCores = cpuCores;
		this.memSize = memSize;
		this.noHDD = noHDD;
	}

	public int getCpuCores() {
		return cpuCores;
	}

	public int getMemSize() {
		return memSize;
	}

	public int getNoHDD() {
		return noHDD;
	}

}
