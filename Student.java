package ex06;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor(access=lombok.AccessLevel.PUBLIC)
public class Student {

	private String name;
	private int englishScore;
	private int mathScore;
	
} // end class