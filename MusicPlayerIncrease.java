package softEng;

public class MusicPlayerIncrease implements Command {
    private MusicPlayer musicPlayer;

    public MusicPlayerIncrease(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute() {
        System.out.println(musicPlayer.increaseVolume());
    }
}
