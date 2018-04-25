import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JamesBond {
	public static Boolean bondRegex(String input) {
		Pattern p = Pattern.compile("(\\d*\\(*\\)*)*\\((\\d*\\(*\\)*)*007(\\d*\\(*\\)*)*\\)(\\d*\\(*\\)*)*");
		Matcher m = p.matcher(input);
		return m.matches();
	}
	public static void main(String[]args) {
		System.out.println(bondRegex("(00007)"));
	}
}
