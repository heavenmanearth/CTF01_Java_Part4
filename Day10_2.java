package ctf01.java.collections;

public class Day10_2 {

	public static void main(String[] args) {
		CEO ceo = new CEO("Captain", "Marvel", 30000);
		IWebsiteCreator dang = new Programmer("Dang", "Red", 10000);
		Programmer dang2 = (Programmer) dang;
		AI alphaGo = new AI("alphaGo", "Java");
		IWebsiteCreator alphaGo2 = alphaGo;
		ceo.orderWebsite(dang);
		ceo.orderWebsite(dang2);
		ceo.orderWebsite(alphaGo);
		ceo.orderWebsite(alphaGo2);
	}
}