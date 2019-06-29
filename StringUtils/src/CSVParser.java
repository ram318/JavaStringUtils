import java.util.ArrayList;
import java.util.List;

public class CSVParser {

	public static void main(String[] args) {
		String input = "Hello,One,two,three,\"four,five\",six";
		System.out.println(input);
		List<String> tokens = CSVParser(input);
		System.out.println(tokens);
	}

	public static List<String> CSVParser(String input) {
		
		List<String> result =new ArrayList<>();
		
		char[] charArray = input.toCharArray();
		StringBuilder sb = new StringBuilder();
		boolean found = false;
		for(int i =0; i<charArray.length;i++) {
			char temp= charArray[i];
			//System.out.print(temp);
			if(temp=='"') {
				found = !found;
				//System.out.println(found);
			}
			if(!found) {
				if(temp!=',') {
					if(temp!='"')
					sb.append(temp);
				}else {
					result.add(sb.toString());
					sb =new StringBuilder();
				}
			}else {
				if(temp!='"')
				sb.append(temp);
			}
		}
		result.add(sb.toString());
		return result;
	}

}
