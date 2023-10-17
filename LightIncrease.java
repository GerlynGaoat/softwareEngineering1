package softEng;

public class LightIncrease implements Command {
    private Light light;

    public LightIncrease(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        System.out.println(light.increase());
    }
    
}
