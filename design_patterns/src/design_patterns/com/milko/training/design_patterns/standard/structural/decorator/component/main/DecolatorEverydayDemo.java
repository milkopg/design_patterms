package design_patterns.com.milko.training.design_patterns.standard.structural.decorator.component.main;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class DecolatorEverydayDemo {

	public static void main(String[] args) throws IOException {
		File file = new File("./output.txt");
		file.createNewFile();

		OutputStream oStream = new FileOutputStream(file);
		DataOutputStream doStream = new DataOutputStream(oStream);
		doStream.writeChars("text chars");
		doStream.close();
		oStream.close();
	}

}
