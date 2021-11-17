package Java100DaysChallenge;

import java.util.List;

public class LastElementOfaStream {

	public static void main(String[] args) {

   List<String> filetypes = List.of("jpg","png","docx");
   solution(filetypes);

	}
	
	public static void solution(List<String>  list) {
		
	String output = list.stream().reduce( (e1, e2) -> e2).get();
	
	// using skip
	
	String lastElement = list.stream()
			.skip(list.size() -1)
			.findFirst()
			.get();
	System.out.println(lastElement);
	System.out.println("Hello from Jenkins");
	System.out.println("Jenkins connectd to Git......");
	}

}
