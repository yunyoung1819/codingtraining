package coding_1_50;

/**
 * 012번. 기본 타입 바르게 사용하기
 * (캐스팅, 변수 범위)
 */

public class CastingRangeMain{
	public static void main(String[] args){
		char cc = 'ㄱ';
		System.out.println(cc);
		System.out.println((int)cc);	//int로 바꾸어 찍자.
		
		cc = 'ㄴ';
		System.out.println(cc); 	 //char를 찍자.
		System.out.println((int)cc); //int로 바꾸어 찍자.
		
		cc = 'ㄷ';
		System.out.println(cc);      //char를 찍자.
		System.out.println((int)cc); //int로 바꾸어 찍자.
		
		cc = 'ㄹ';
		System.out.println(cc);      //char를 찍자.
		System.out.println((int)cc); //int로 바꾸어 찍자.
		System.out.println("-----------------------");
		
		for(int i=1; i<=100; i++){
			System.out.print((char)i + ""); //찍고 그 자리에 공백 추가
			// (char) i --> int를 char로 캐스팅
			if((i%10==0)){						// 10으로 나누어 떨어지는가?
				System.out.println();		    // 한 칸을 내려라
			}
		}
		
		System.out.println("test");
		System.out.printf("test");
	}
}