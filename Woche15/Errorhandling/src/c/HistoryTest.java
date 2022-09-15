package c;

import java.io.IOException;

public class HistoryTest {

	public static void main(String[] args) throws IOException {
		ReadHistory h = new ReadHistory("src/c/hiistory.txt");
		String history = h.getHistory();
		System.out.println(history);
	}
}
