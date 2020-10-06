package ex06;

import lombok.extern.log4j.Log4j;


@Log4j
public class UsingThis {

	public int outterField = 10;	// 인스턴스 필드 선언
	
	// 중첩클래스 선언 - 클래스 안에 클래스 선언(이를 중첩클래스라 함)
	class Inner {	// Inner Class
		int innerField = 20;
		
		void method() {
			//람다식
			MyFunctionalInterface fi = () -> {
				// 대전제1: 람다식 실행블록 내에서는,
				// 자기를 둘러싸고 있는 바깥쪽 클래스의
				// 멤버(필드, 메소드)를 맘대로 사용가능
				
				// 대전제2: 람다식 실행블록 내에서, this를 사용한다면
				// 이때 this는, 람다식이 만든 익명구현객체의 참조가 아니라
				// 이 람다식을 포함하고 있는 객체의 참조이다
				log.info(">>> Inner's this: " + this);
				log.info(">>> UsingThis.this: " + UsingThis.this);
				
//				log.info("outterField: " + outterField);
//				log.info("outterField: " + UsingThis.this.outterField + "\n");
//				
//				log.info("innerField: " + innerField);
//				log.info("innerField: " + this.innerField + "\n");
			}; // 람다식(타겟타입의 익명구현객체 생성
			
			fi.method(); 		// 익명구현객체의 메소드 호출
		} // method
		
	} // end inner class
	
} // end class