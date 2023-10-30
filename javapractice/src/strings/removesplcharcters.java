package strings;

public class removesplcharcters {

	public static void main(String[] args) {
		String s="ja#@$va#%^isgo(*&{}od";
		s=s.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(s);

	}

}
