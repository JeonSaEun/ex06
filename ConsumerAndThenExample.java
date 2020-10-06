package ex06;

import java.util.function.Consumer;
import lombok.extern.log4j.Log4j;


@Log4j
public class ConsumerAndThenExample {

	
	public static void main(String[] args) {
		Consumer<Member> consumerA = 
			m -> log.info("consumerA: " + m.getName());
	
		//----------------------------//
	
		Consumer<Member> consumerB = 
			m -> log.info("consumerB: " + m.getId());
			
		//----------------------------//
		
		// 두 함수적 인터페이스로 파이프라인 구성
		Consumer<Member> consumerAB =
				consumerA.andThen(consumerB);
		
		// 생성된 파이프라인 순차적 수행 실행
		consumerAB.
			accept(
				new Member("홍길동", "hong", null)
			); // accept
		
	} // main
	
} // end class
