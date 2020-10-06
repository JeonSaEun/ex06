package ex06;

import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
public class Student2 {

	private String name;
	@Getter private String sex;
	@Getter private int score;
	
} // end class