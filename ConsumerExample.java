package ex06;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

import lombok.extern.log4j.Log4j;


@Log4j
public class ConsumerExample {

	
	// 매개변수로 전달된 데이터(전달인자)를 소비만 하는
	// 비지니스 로직을 개발할 때에는, 이 Consumer 인터페이스를 사용
	public static void main(String[] args) {
		
		//-------------------------------//
		
		Consumer<String> consumer = 
			t -> log.info(t + "8"); 
				
		consumer.accept("Java");
		
		//-------------------------------//
		
		BiConsumer<String, String> bigConsumer =
			(t, u) -> log.info(t + u);
		
		bigConsumer.accept("Java", "8");
		
		//-------------------------------//
		
		DoubleConsumer doubleConsumer =
			d -> log.info("Java" + d);
				
		doubleConsumer.accept(8.0);
		
		//-------------------------------//
		
		ObjIntConsumer<String> objIntConsumer =
			(t, i) -> log.info(t + i);
			
		objIntConsumer.accept("Java", 8);
	} // main
	
} // end class
