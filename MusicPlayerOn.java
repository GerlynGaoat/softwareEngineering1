package softEng;

public class MusicPlayerOn implements Command{
    private MusicPlayer musicPlayer;

    public MusicPlayerOn(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute() {
        System.out.println(musicPlayer.turnOn());
    }
}
