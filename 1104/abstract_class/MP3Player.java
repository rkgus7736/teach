package abstract_class;

//추상 클래스 상속
public class MP3Player extends Player{

	@Override
	public void play() {
		System.out.println("MP3 Play");
	}

	@Override
	public void stop() {
		System.out.println("MP3 Stop");
	}

	@Override
	public void next() {
		System.out.println("MP3 Next Play");
	}

	@Override
	public void prev() {
		System.out.println("MP3 Prev Play");
	}

}





