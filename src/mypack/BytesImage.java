package mypack;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class BytesImage {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File fi = new File("D:\\photo\\1058503.jpg");
		System.out.println("pathh "+fi.exists());
		byte[] fileContent = Files.readAllBytes(fi.toPath());
		System.out.println(""+fileContent);

	}

}
