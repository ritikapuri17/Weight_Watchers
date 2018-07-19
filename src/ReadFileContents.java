import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;

public class ReadFileContents {

	private static final String String = null;

	static void doesFileExist(String path) throws IOException {

		File f = new File(path);

		if (f.exists()) {
			System.out.println("File exists");
		} else {
			System.out.println("File not found!");
		}

		try {

			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String line = "";
			while ((line = br.readLine()) != null) {
				System.out.println(line);

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			doesFileExist("C:\\Users\\workr\\Downloads\\Hello.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
