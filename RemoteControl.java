package softEng;

import java.util.ArrayList;
import java.util.List;

public class RemoteControl {
    
    private List<Command> commandQueue = new ArrayList<>();

    public void addCommand(Command command) {
        commandQueue.add(command);
    }

    public void deviceControl(int button) {
        commandQueue.get(button).execute();
        commandQueue.clear();
    }
}
