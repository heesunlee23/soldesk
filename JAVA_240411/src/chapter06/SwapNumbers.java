// 수업 때 한게 아니고 독자적으로 작성한 것
package chapter06;

public class SwapNumbers {
	
    // 두 정수를 교환하는 메서드
    public static int[] swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        return new int[] {a, b}; // **** return new int[] {a, b};
    }
    
    public static void main(String[] args) {
    	
        int a = 10;
        int b = 20;

        System.out.println("Before swap: a = " + a + ", b = " + b);

        // swap 메서드를 호출하여 a와 b의 값을 교환
        int[] swapped = swap(a, b);
        a = swapped[0];
        b = swapped[1];
        
        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}