package player;

public class UserMain {

	public static void main(String[] args) {
		CDPlayer player = new CDPlayer(7);
		String[] list = {
				"Dynamite","Lovestick Girl", "DON'T TOUCH ME",
				"잠이 오질 않네요","취기를 빌려","힘든건 사랑이아니다."
		};
		MP3Player mp3 = new MP3Player(list);
		
		User user = new User(mp3);
		user.playPlayer();
		user.nextPlayer();
		user.nextPlayer();
		user.nextPlayer();
		user.changePlayer(player);
		user.nextPlayer();
		user.nextPlayer();
		user.nextPlayer();
		user.nextPlayer();
	}

}








