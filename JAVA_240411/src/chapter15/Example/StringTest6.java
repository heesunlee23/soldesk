package chapter15.Example;

public class StringTest6 {

	public static void main(String[] args) {
	
		String animal = "개,고양이,참새,거북이";
		
//		//문자열을 분리해 배열에 담으세요
//		String[] split = animal.split(",");
//		
//		String merged = "";
//		
//		//분리된 문자열을 합치세요
//		for(int i = 0; i < split.length; i++) {
//			merged += split[i];
//		}
//		
//		System.out.println(merged);
		
		String[] splitAnimal = animal.split(",");
		for(String s : splitAnimal) {
			System.out.println(s);
		}
		
		String joinAnimal = String.join(",", splitAnimal); // *****
		System.out.println(joinAnimal);
	}
}
