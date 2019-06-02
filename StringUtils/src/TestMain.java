
public class TestMain {

	public static void main(String[] args) {
		
		String input = "Ramarao";
		System.out.println(StringUtils.toAlternateCase(input, true));
		System.out.println(StringUtils.toAlternateCase(input, false));
		System.out.println(StringUtils.toReverseCase(input));
	}
}
