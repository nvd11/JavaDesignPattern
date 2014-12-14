package decorator;

public class HuntClient {
	public static void f(){
		Hunter h = new Hunter();
		HuntTakePic htp = new HuntTakePic(h);
		HuntTrainDog htd = new HuntTrainDog(htp);
		
		htd.hunt();
	}
}
