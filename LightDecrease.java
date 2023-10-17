package softEng;

public class LightDecrease implements Command{
    private Light light;

    public LightDecrease(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        System.out.println(light.decrease());
    }
}
