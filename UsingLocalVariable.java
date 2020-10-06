package ex06;

import lombok.extern.log4j.Log4j;


@Log4j
public class UsingLocalVariable {

	// 클로저(Closure) 문제 발생 및 극복
	void method(int arg) {	//arg는 final 특성을 가짐
		int localVar = 40;	//localVar는 final특성을 가짐
		int localVar2 = 1000; // final ????
		
//		arg = 31;		//final 특성때문에 수정 불가
//		localVar = 41;	//final 특성때문에 수정 불가
		localVar2 = 2000;
		
		// 람다식
		MyFunctionalInterface fi = () -> {
			//로컬변수 사용
			log.info("arg: " + arg);
			log.info("localVar: " + localVar + "\n");
		}; // 람다식을 이용한 익명구현객체 생성
		fi.method();
	} // method
	
} // end class
