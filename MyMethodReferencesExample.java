package ex06;

import lombok.extern.log4j.Log4j;


@Log4j
public class MyMethodReferencesExample {

	
	public static void main(String[] args) {
		MyFunctionalInterface2 fi;	// 타겟타입
		
		// 1st. lambda
		fi = (x) -> { // 생략조건1: 매개변수 선언부의 타입 생략가능
			int result = x * 5;
			log.info(result);
		}; // lambda
		
		fi.method(2);	// 익명구현객체의 메소드 호출
		
		//-----------------------------------------//
		
		// 2nd. lambda
		// 위의 실행블록의 2개의 실행문장을 1개로 통합
		fi = (x) -> { log.info(x*5); };
		fi.method(2);
		
		// 3rd. lambda
		// 생략조건2: 실행블록의 실행문장이 1개만 있다면, 중괄호 생략
		// 생략조건3: 오직 1개의 매개변수만 있다면, 소괄호 생략
		fi = x -> log.info(x*5);
		fi.method(2);	// 익명구현객체의 메소드 호출
	} // main
	
} // end class