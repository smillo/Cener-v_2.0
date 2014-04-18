package General;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Numero_fattura {

	static String percorso = "C:\\Users\\massimiliano\\Documents\\conteggio.txt";
	static int count = 0;

	public Numero_fattura() {

	}

	public static String contaFattura() throws IOException {
		File file = new File(percorso);
		if (!file.exists()) {

			file.createNewFile();
			BufferedWriter bufferedwriter = new BufferedWriter(new FileWriter(
					(new StringBuilder()).append(percorso).toString()));
			bufferedwriter.write("1");
			bufferedwriter.flush();
			bufferedwriter.close();

		}
		FileReader filereader = new FileReader((new StringBuilder()).append(
				percorso).toString());
		BufferedReader bufferedreader = new BufferedReader(filereader);
		String s = bufferedreader.readLine();
		bufferedreader.close();
		filereader.close();
		count = Integer.parseInt(s);
		count++;
		FileWriter filewriter = new FileWriter((new StringBuilder()).append(
				percorso).toString());
		BufferedWriter bufferedwriter1 = new BufferedWriter(filewriter);
		String s1 = Integer.valueOf(count).toString();
		bufferedwriter1.write(s1);
		bufferedwriter1.close();
		filewriter.close();
		return s;
	}
}