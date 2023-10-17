package softEng;

public class MusicPlayerOff {
    private MusicPlayer musicPlayer;

    public MusicPlayerOff(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute() {
        System.out.println(musicPlayer.turnOff());
    }
}
