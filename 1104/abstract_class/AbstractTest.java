package abstract_class;

public class AbstractTest {

	public static void main(String[] args) {
//		Player player = new Player();
		Player player = new MP3Player();
		player.play();
		player.stop();
		player.next();
		player.prev();
	}

}
