package chapter15.Example;

import java.util.Arrays;

/*
 * 문제3

파일이름 : 안녕
확장자 : .txt
 */
public class StringTest3 {

	public static void main(String[] args) {
		
		//파일명과 확장자를 분리하시오
		String str = "안녕.txt";
		String ext = ".txt";
		
//		String[] split = str.split(ext);
//		// System.out.println(Arrays.toString(split));
//		System.out.println("파일이름 : " + split[0]);
//		System.out.println("확장자 : " + ext);
		
		int extIndex = str.indexOf(ext);
		String fileName = str.substring(0, extIndex);
		String extName = str.substring(extIndex);
		
		System.out.println("파일이름 : " + fileName);
		System.out.println("파일이름 : " + extName);

	}

}

