import java.util.Random;

public class RollingDice {

	public static void main(String[] args) {
		displayingnumbers();

	}

	private static void displayingnumbers() {
		Random numbers = new Random();
		int x = numbers.nextInt(55);

		System.out.println("AZHER:" + x);
	}

}
