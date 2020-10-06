package ex06;

import java.util.function.IntBinaryOperator;

import lombok.extern.log4j.Log4j;


@Log4j
public class OperatorExample {

	// 점수를 목록으로 가지는 배열 필드 선언
	private static int[] scores = { 92, 95, 87 };
	
	//-----------------------------------//
	// 배열에서 최대값(점수)를 반환하는 메소드
	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		
		for(int score : scores) {
			result = operator.applyAsInt(result, score);
		} // inhanced for
		
		return result;
	} // maxOrMin
	
	//-----------------------------------//
	
	public static void main(String[] args) {
	
		// 최대값 얻기
		int max = maxOrMin(
				
				(a, b) -> {
					
					if(a>=b) {
						return a;
					} else {
						return b;
					} // if-else
					
				} // 람다식
				
			); // maxOrMin
		
		// 최소값 얻기
		int min = maxOrMin(
				
				(a, b) -> {
					
					if(a<=b) {
						return a;
					} else {
						return b;
					} // if-else
					
				} // 람다식
			
			); // maxOrMin
		
		log.info("최소값: " + min);
		log.info("최대값: " + max);
	} // main
	
} // end class
