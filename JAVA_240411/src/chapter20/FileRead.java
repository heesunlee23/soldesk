// 봤음
package chapter20;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
	
	void read() throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new FileReader("ab.txt")); // BufferedReader는 다음주에 설명 
		String text;
		while((text = bufferedReader.readLine()) != null) {
			System.out.println(text);
		}
		bufferedReader.close();
	}
}
