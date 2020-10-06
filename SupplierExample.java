package ex06;

import java.util.function.IntSupplier;
import lombok.extern.log4j.Log4j;


@Log4j
public class SupplierExample {

	// 받는 데이터는 없이, 내부에서 데이터를 생성하여
	// 호출자에게 생성한 데이터를 공급하는 비지니스로직을 구현
	public static void main(String[] args) {
		// 
		IntSupplier intSupplier = () -> 
		(int) (Math.random() * 6) + 1;
		// int 값을 생성하여 공급해주겠다
		
		int num = intSupplier.getAsInt();
		log.info("눈의 수: " + num);
	} // main
	
} // end class