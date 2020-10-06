package ex06;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

import lombok.extern.log4j.Log4j;


@Log4j
public class FunctionalExample1 {

	// JCF의 List 객체 생성(Arrays helper class)
	private static List<Student> list = 
		Arrays.asList(
			new Student("홍길동", 90, 96),
			new Student("신용권", 95, 93)
			); // 첫번째 필드
	
	//----------------------------------------//
	
	public static void printString(
			Function<Student, String> function
	) {
		for(Student student : list) {
			log.info(function.apply(student) + " ");
		} // enhanced for
		
		log.info("\n");
	} // 메소드 선언, printString
	
	public static void printInt(
		ToIntFunction<Student> function
	) {
		for(Student student : list) {
			log.info(function.applyAsInt(student) + " ");
		} // enhanced for
		
		log.info("\n");
	} // 두번째 메소드 선언, printInt
	
	//----------------------------------------//
	
	public static void main(String[] args) {
		log.info("[학생 이름]");
		printString( t -> t.getName() );	// 람다식 적용
		
		//-----------------------------//
		
		log.info("[영어 점수]");
		printInt( t -> t.getEnglishScore() );	// 람다식 적용
		
		//-----------------------------//
		
		log.info("[수학 점수]");
		printInt( t -> t.getMathScore() ); 	// 람다식 적용
	} // main
	
} // end class