import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Readandwritefile {

	public static void main(String[] args) throws IOException {

		Scanner input = new Scanner(System.in);
		System.out.print("Please enter string: ");
		String kelime = input.nextLine();

		File file = new File(
				"C:\\Users\\USER\\Desktop\\Projeler\\ReadFileandWriteFile\\Readandwrite\\dosya.txt");
		if (!file.exists()) {
			file.createNewFile();
		}

		FileWriter fileWriter = new FileWriter(file, false);
		BufferedWriter bWriter = new BufferedWriter(fileWriter);
		bWriter.write(kelime);
		System.out.println("Write ok...");
		System.out.println("Writing words: " + kelime);
		bWriter.close();

		FileReader fileReader = new FileReader(file);
		String line;

		BufferedReader br = new BufferedReader(fileReader);

		while ((line = br.readLine()) != null) {

			System.out.println("Reading words: " + line);

		}
		System.out.println("Read ok...");
		br.close();

	}

}