package d;

public class ArrayCreator {

	public static void main(String[] args) throws InterruptedException {

		int dummyArraySize = 15;
		System.out.println("Max JVM memory: " + Runtime.getRuntime().maxMemory());
		long memoryConsumed = 0;

		long[] memoryAllocated = null;
		for (int loop = 0; loop < Integer.MAX_VALUE; loop++) {
			memoryAllocated = new long[dummyArraySize];
			memoryAllocated[0] = 0;
			memoryConsumed += dummyArraySize * Long.SIZE;
			System.out.println("Memory Consumed till now: " + memoryConsumed);
			dummyArraySize *= dummyArraySize * 2;
			Thread.sleep(500);
		}
	}
}
