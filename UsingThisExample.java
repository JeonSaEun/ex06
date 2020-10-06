package ex06;


public class UsingThisExample {

	
	public static void main(String[] args) {
		// 1. Outer 클래스의 객체 생성
		UsingThis usingThis = new UsingThis();
		
		// 2. 만일 Inner 클래스에서 객체를 찍어내려면 어떻게 할까
		// (1) 가장 바깥쪽 클래스의 객체를 먼저 생성 후
		// (2) (1)에서 생성한 객체를 이용해, 안쪽 클래스의 객체를 생성
		UsingThis.Inner inner = usingThis.new Inner();
		
		inner.method();	// 이 메소드 안에서, 람다식이 생성
	} // main
	
} // end class
