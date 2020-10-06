package ex06;

import lombok.extern.log4j.Log4j;


@Log4j
public class MyFunctionalInterfaceExample {

	
	public static void main(String[] args) {
		// 우리가 만든 함수적 인터페이스 -> 이게,
		// 지금 우리가 구현할 람다식의 "타겟타입"이 됨
		MyFunctionalInterface fi;
		
		// 타겟타입을 구현하는 첫번째 람다식의 구현
		fi = () -> {
			String str = "method call1";
			
			log.info(str);
		}; // Lambda Expression
		
		// 익명구현객체가 람다식에 의해 자동으로 만들어졌으므로,
		// 인터페이스에 선언되어있는 추상메소드를 호출하여 사용가능
		fi.method();
		
		log.info(fi);
		
		//---------------------------------------//
		
		// 두번째 람다식(익명구현객체 생성)
		// 실행블록안에 실행문장을 하나로 만든 것
		fi = () -> { log.info("method call2"); };
		fi.method();

		log.info(fi);
		
		//---------------------------------------//
		
		// 세번째 람다식(익명구현객체 생성)
		// 실행블록에 오로지 단 1개의 실행문장만 있다면 -> 생략조건에 부합
		// 생략대상: 중괄호 블록 기호의 생략
		fi = () -> log.info("method call3");
		fi.method();

		log.info(fi);
	} // main
	
} // end class