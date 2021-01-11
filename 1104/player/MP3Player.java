package player;

public class MP3Player extends Player{
	private String[] list;//곡 목록
	private int index;//현재 지정된 곡 리스트 번호

	public MP3Player(String[] list) {
		this.list = list;
		index = 0;
	}
	@Override
	public void play() {
		System.out.println(list[index] + "곡 재생");
	}

	@Override
	public void stop() {
		System.out.println(list[index] + "곡 재생 정지");
	}

	@Override
	public void next() {
		index++;
		if(index >= list.length)
			index=0;
		play();
	}

	@Override
	public void prev() {
		index--;
		if(index < 0)
			index = list.length-1;
		play();
	}
	
	
	
}
