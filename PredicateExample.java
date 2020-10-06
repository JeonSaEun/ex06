package ex06;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import lombok.extern.log4j.Log4j;


@Log4j
public class PredicateExample {

	private static List<Student2> list =
		Arrays.asList(
			new Student2("홍길동","남자",90),
			new Student2("김순희","여자",90),
			new Student2("김자바","남자",95),
			new Student2("박한나","여자",92)
			); // List 객체 생성
	
	public static double avg(
		Predicate<Student2> predicate
	) {
		// 지역변수 2개 선언
//		int count = 0, sum = 0; <--- 가독성과 거짓 오류발생 쉬움
		int count = 0;
		int sum = 0;
		
		
		for(Student2 student : list) {
			
			// 조건에 부합하는지 판단 (predicate의 의미)
			if(predicate.test(student)) {
				count++;
				
				sum += student.getScore();
			} // if
			
		} // enhanced for
		return (double)sum / count;		// 평균계산 및 반환
	}; // avg
	
		//----------------------------------//
	
	public static void main(String[] args) {
		double maleAvg =
			// 람다식으로 조건 테스트 및 그 결과를 boolean으로 반환
			avg( t -> t.getSex().equals("남자") );
		
		log.info("남자 평균 점수: " + maleAvg);
		
		//----------------------------------//
		
		double femaleAvg =
			// 람다식으로 조건 테스트 및 그 결과를 boolean으로 반환
			avg( t -> t.getSex().equals("여자") );
		
		log.info("여자 평균 점수: " + femaleAvg);
		
	} // main
	
} // end class