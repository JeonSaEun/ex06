package ex06;

import java.util.function.Function;

import lombok.extern.log4j.Log4j;


@Log4j
public class FunctionAndThenComposeExample {

	
	public static void main(String[] args) {
		Function<Member, Address> functionA;
		Function<Address, String> functionB;
		
		Function<Member, String> functionAB;	// pipeline
		
		//---------------------------//
		String city = null;
		
		functionA =
			m -> m.getAddress();	// 람다식
			
		functionB =
			a -> a.getCity();		// 람다식
			
		//---------------------------//
		// 두 함수적 인터페이스의 람다식으로 파이프라인 구성
		// (*주의*) Function 인터페이스는 리턴값이 존재함!
		functionAB = functionA.andThen(functionB);
		city = functionAB.apply(
				new Member("홍길동", "hong", 
				new Address("한국", "서울")
			)	
		);
		
		log.info("거주 도시: " + city);
		
		
	} // main
	
} // end class