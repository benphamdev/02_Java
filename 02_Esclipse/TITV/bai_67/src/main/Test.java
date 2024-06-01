package main;

import java.io.File;
import java.io.IOException;

public class Test {
	public static void main(String[] args) {
//		note : 
//		windows : \ => \\
//		linux, mac : /

		File directory = new File("D:\\WorkSpace\\SourceCode\\Esclipse\\bai_66");
		File directory1 = new File("D:\\WorkSpace\\SourceCode\\Esclipse\\bai_68");
		System.out.println("file exists : " + directory1.exists());

		File directory2 = new File("D:\\WorkSpace\\SourceCode\\Esclipse\\bai_67\\example");
		directory2.mkdir();

		File directory3 = new File("D:\\WorkSpace\\SourceCode\\Esclipse\\bai_67\\example1\\test1");
		directory3.mkdirs();

		File file = new File("D:\\WorkSpace\\SourceCode\\Esclipse\\bai_67\\file.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			// ko co quyen tao tap tin
			// o cung bi day
			// duong dan sai
			e.printStackTrace();
		}
	}
}
