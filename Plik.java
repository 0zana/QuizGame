import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Plik {
	public static long dlugoscPliku() {
		Path plik=Paths.get("/Users/dell user/Desktop/QuizGame.txt");
		try {
			long dlugosc = Files.lines(plik).count();
			return dlugosc;
		} catch (IOException e) {
			e.getStackTrace();
		}
		return 0;
	}
	public static String czytanie (int numerLinii) throws IOException {
		BufferedReader reader;
			reader = new BufferedReader(new FileReader("/Users/dell user/Desktop/QuizGame.txt"));
					String line = Files.readAllLines(Paths.get("/Users/dell user/Desktop/QuizGame.txt")).get(numerLinii);
					return line;
					}
	
	}

