package softEng;

public class LightOff implements Command {
    private Light light;

    public LightOff(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        System.out.println(light.switchOff());
    }
    
}
