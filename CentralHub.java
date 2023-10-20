package softEng;

import java.util.Scanner;

public class CentralHub {
    public static void main(String args[]) {
        // Initialize a scanner for user input
        Scanner sc = new Scanner(System.in);

        // Create a continuous loop for device selection and control
        while (true) {
            System.out.println("Smart Home Automation Devices");
            System.out.println("1. Lights");
            System.out.println("2. Thermostat");
            System.out.println("3. Music Player");
            System.out.println("4. Exit");
            System.out.println("Which device would you like to control?");
            int userChoice = sc.nextInt();

            // Exit the program if the user chooses option 4
            if (userChoice == 4) {
                System.out.println("Goodbye!");
                break;
            }

            switch (userChoice) {
                case 1: 
                    while(true) {
                        int choice;
                        System.out.println("1. Turn on Lights");
                        System.out.println("2. Turn off Lights");
                        System.out.println("3. Increase Brightness");
                        System.out.println("4. Decrease Brightness");
                        System.out.println("0. Exit");
                        System.out.println("What would you like to do?");
                        choice = sc.nextInt();
                        if(choice == 0) {
                            System.out.println("Exiting");
                            break;
                            }
                        else {
                            deviceControl(choice, userChoice);
                        }
                        System.out.println();
                    }
                    break;
                case 2: 
                    while(true) {
                        int choice;
                        System.out.println("1. Turn on Thermostat");
                        System.out.println("2. Turn off Thermostat");
                        System.out.println("3. Increase Temperature");
                        System.out.println("4. Decrease Temperature");
                        System.out.println("0. Exit");
                        System.out.println("What would you like to do?");
                        choice = sc.nextInt();
                        if(choice == 0) {
                            System.out.println("Exiting");
                            break;
                            }
                        else {
                            deviceControl(choice, userChoice);
                        }
                        System.out.println();
                    }
                    break;
                case 3: 
                    while(true) {
                        int choice;
                        System.out.println("1. Turn on Music Player");
                        System.out.println("2. Turn off Music Player");
                        System.out.println("3. Increase Volume");
                        System.out.println("4. Decrease Volume");
                        System.out.println("0. Exit");
                        System.out.println("What would you like to do?");
                        choice = sc.nextInt();
                        if(choice == 0) {
                            System.out.println("Exiting");
                            break;
                            }
                        else {
                            deviceControl(choice, userChoice);
                        }
                        System.out.println();
                    }
                    break;
                default:
                    System.out.println("Please choose 0-4 only!");
            }
        }
    }

    // Method to handle device-specific commands
    private static void deviceControl(int choice, int userChoice) {
        switch (userChoice) {
            case 1: 
            
                Light light = new Light();
                RemoteControl remoteControlLight = new RemoteControl();
                Command lightOn = new LightOn(light);
                Command lightOff = new LightOff(light);
                Command brightnessIncrease = new LightIncrease(light);
                Command brightnessDecrease = new LightDecrease(light);
                remoteControlLight.addCommand(lightOn);
                remoteControlLight.addCommand(lightOff);
                remoteControlLight.addCommand(brightnessIncrease);
                remoteControlLight.addCommand(brightnessDecrease);
                switch (choice){
                    case 1:
                        remoteControlLight.deviceControl(0);
                        break;
                    case 2:
                        remoteControlLight.deviceControl(1);
                        break;
                    case 3:
                        remoteControlLight.deviceControl(2);
                        break;
                    case 4:
                        remoteControlLight.deviceControl(3);
                        break;
                    default:
                        System.out.println("Invalid Choice!");
                        break;
            }
                break;
            case 2: 
            
                Thermostat thermostat = new Thermostat();
                RemoteControl remoteControlThermostat = new RemoteControl();
                Command thermostatOn = new ThermostatOn(thermostat);
                Command thermostatOff = new ThermostatOff(thermostat);
                Command temperatureIncrease = new ThermostatIncrease(thermostat);
                Command temperatureDecrease = new ThermostatDecrease(thermostat);
                remoteControlThermostat.addCommand(thermostatOn);
                remoteControlThermostat.addCommand(thermostatOff);
                remoteControlThermostat.addCommand(temperatureIncrease);
                remoteControlThermostat.addCommand(temperatureDecrease);
                switch (choice){
                    case 1:
                        remoteControlThermostat.deviceControl(0);
                        break;
                    case 2:
                        remoteControlThermostat.deviceControl(1);
                        break;
                    case 3:
                        remoteControlThermostat.deviceControl(2);
                        break;
                    case 4:
                        remoteControlThermostat.deviceControl(3);
                        break;
                    default:
                        System.out.println("Invalid Choice!");
                        break;
                }
                break;
            case 3: 
            
                MusicPlayer musicPlayer = new MusicPlayer();
                RemoteControl remoteControlMusicPlayer = new RemoteControl();
                Command musicPlayerOn = new MusicPlayerOn(musicPlayer);
                Command musicPlayerOff = new MusicPlayerOff(musicPlayer);
                Command volumeIncrease = new MusicPlayerIncrease(musicPlayer);
                Command volumeDecrease = new MusicPlayerDecrease(musicPlayer);
                remoteControlMusicPlayer.addCommand(musicPlayerOn);
                remoteControlMusicPlayer.addCommand(musicPlayerOff);
                remoteControlMusicPlayer.addCommand(volumeIncrease);
                remoteControlMusicPlayer.addCommand(volumeDecrease);
                switch (choice){
                    case 1:
                        remoteControlMusicPlayer.deviceControl(0);
                        break;
                    case 2:
                        remoteControlMusicPlayer.deviceControl(1);
                        break;
                    case 3:
                        remoteControlMusicPlayer.deviceControl(2);
                        break;
                    case 4:
                        remoteControlMusicPlayer.deviceControl(3);
                        break;
                    default:
                        System.out.println("Invalid Choice!");
                        break;
            }
                break;
        }
    }
}