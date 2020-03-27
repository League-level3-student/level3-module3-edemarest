package _00_Text_Funkifier;

public class VowelString extends SpecialString{

	public VowelString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String news="";
		for(int i = 0; i < s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='y') {
				news = news + s.charAt(i);
			}
		}
		return news;
	}
}
