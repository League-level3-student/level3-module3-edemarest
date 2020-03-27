package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String news="";
		for(int i = 0; i < s.length(); i++) {
			if(i==0) {
				news = news+Character.toString(s.charAt(i)).toLowerCase();
			}
		else if(i%2==1) {
				news = news+(Character.toString(s.charAt(i)).toUpperCase());
			}
			else {
				news = news+(Character.toString(s.charAt(i)));
			}
		}
		return news;
	}

}
