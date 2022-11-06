import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class WPMCounter {
	
	static String words[] = {"Hello", "Microphone", "Test", "Register", "Square", "Laptop",
			"System", "Agile", "Smartphone", "Cat"};

	public static void main(String[] args) throws InterruptedException {
		System.out.println("3");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("2");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("1");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("Start");
		TimeUnit.SECONDS.sleep(1);
		
		Random rand = new Random();
		for(int i=0; i<10; i++) {
			System.out.print(words[rand.nextInt(9)] + " ");
		}
		System.out.println();
		
		double start = LocalTime.now().toNanoOfDay();
		
		Scanner scan = new Scanner(System.in);
		String typeWords = scan.nextLine();
		System.out.println(typeWords);
		
		double end = LocalTime.now().toNanoOfDay();
		double elapsedTime = end - start;
		double seconds = elapsedTime / 1000000000.0;
		// WPM = (n characters / 5) / 1min
		int charCount = typeWords.length();
		int wpm = (int)((((double)charCount / 5) / seconds) * 60);
		System.out.println("Your WPM is " + wpm + "!");
		
		
		


	}

}
