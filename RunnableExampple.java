package ex06;

import lombok.extern.log4j.Log4j;


@Log4j
public class RunnableExampple {

	
	public static void main(String[] args) {
		// Runnable functional interface를
		// 람다식으로 구현(익명구현객체 생성)하여
		// 스레드가 실행할 task를 생성
		Runnable task = () -> {
			
			for(int i=0; i<10; i++) {
				log.info(i);
			} // for
			
		}; // Runnable 타입의 task 생성하는 람다식
		
		
		Thread thread = new Thread(task);
		thread.start();
		
		//---------------------------//
		
		// 람다식을 사용하여 스레드가 실행할 Runnable
		// task를 생성
		Thread thread2 = new Thread( () -> {
			
			for(int i=0; i<10; i++) {
				log.info(i);
			} // for
		});	// 익명자식객체 코딩기법
		
		thread2.start();
		
	} // main
	
} // end class