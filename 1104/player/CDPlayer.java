package player;

public class CDPlayer extends Player {
	//전체 트랙 개수
	private int track;
	private int currentTrack;

	public CDPlayer(int track) {
		this.track = track;
	}

	@Override
	public void play() {
		System.out.println("Track "+currentTrack+" Play");
	}

	@Override
	public void stop() {
		System.out.println("Play Stop");
	}

	@Override
	public void next() {
		currentTrack++;
		if(currentTrack > track)
			currentTrack = 0;
		play();
	}

	@Override
	public void prev() {
		currentTrack--;
		if(currentTrack < 0)
			currentTrack = track;
		play();
	}
	
	
	
}



