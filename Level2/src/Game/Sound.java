package Game;

import javax.sound.sampled.*;

public class Sound {
	
	private Clip clip;
	
	public static Sound sound1 = new Sound("Alla_Turka.wav");
	public static Sound sound2 = new Sound("Floor_2.wav");
	public static Sound sound3 = new Sound("Floor_3.wav");
	public static Sound finale = new Sound("Finale.wav");
	public static Sound sound4 = new Sound("Menu.wav");
	public static Sound click = new Sound("Click.wav");
	public static Sound death = new Sound("death.wav");
	public static Sound win = new Sound("win.wav");
	public static Sound win2 = new Sound("win2.wav");
	public static Sound end = new Sound("end.wav");
	
	public Sound (String fileName) {
		try {
			AudioInputStream ais = AudioSystem.getAudioInputStream(Sound.class.getResource(fileName));
			clip = AudioSystem.getClip();
			clip.open(ais);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void play() {
		try {
			if (clip != null) {
				new Thread() {
					public void run() {
						synchronized (clip) {
							clip.stop();
							clip.setFramePosition(0);
							clip.start();
						}
					}
				}.start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void stop(){
		if(clip == null) return;
		clip.stop();
	}
	
	public void loop() {
		try {
			if (clip != null) {
				new Thread() {
					public void run() {
						synchronized (clip) {
							clip.stop();
							clip.setFramePosition(0);
							clip.loop(Clip.LOOP_CONTINUOUSLY);
						}
					}
				}.start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public boolean isActive(){
		return clip.isActive();
	}
}