
public class Principal01 {

	public static void main(String[] args) {
		for (LanguageEnum lang : LanguageEnum.values()) 
		{
			if (LanguageEnum.Java.equals(lang))
			{
				System.out.println("I love "+lang.toString());
			} 
			else 
			{
				System.out.println(lang);
			}
		}
	}

}
