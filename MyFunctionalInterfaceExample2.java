package ex06;

import lombok.extern.log4j.Log4j;


@Log4j
public class MyFunctionalInterfaceExample2 {

	
	public static void main(String[] args) {
		MyFunctionalInterface3 fi;	// 타겟타입
		
		//-----------------------------------------//
		fi = (x, y) -> {
			int result = x + y;
			
			return result;
		}; // 리턴타입이 있기 때문에, return 키워드로 값을 반환
		
		log.info(fi.method(2, 5)); // 메소드 호출
		
		//-----------------------------------------//		
		fi = (x, y) -> { return x + y; };
		
		log.info(fi.method(2, 5));
		
		//-----------------------------------------//
		fi = (x, y) -> x + y;
		
		log.info(fi.method(2, 5));
		
		//-----------------------------------------//
		fi = (x, y) -> sum(x, y);
		
		log.info(fi.method(2, 5));
	} // main

	public static <T extends Number> int sum(T x, T y) {
		return (x.intValue() + y.intValue());
	} // sum
	
} // end class