package softEng;

public class MusicPlayerDecrease implements Command {
    private MusicPlayer musicPlayer;

    public MusicPlayerDecrease(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute() {
        System.out.println(musicPlayer.decreaseVolume());
    }
}
