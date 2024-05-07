public class LightRunner {
    public static void main(String[] args) {
        LightController hallwayLight = new LightController(0,0,0);
        LightController hallwayLight1 = new LightController(1,1,1);
        LightController hallwayLight2 = new LightController(1,0,1);

        // Initial state
        System.out.println("First Switch State: " + hallwayLight.getFirstSwitchState());
        System.out.println("Second Switch State: " + hallwayLight.getSecondSwitchState());
        System.out.println("Lamp State: " + hallwayLight.getLampState());

        // Toggle first switch
        hallwayLight.toggleFirstSwitch();
        System.out.println("Lamp State After Toggling First Switch: " + hallwayLight1.getLampState());

        // Toggle second switch
        hallwayLight.toggleSecondSwitch();
        System.out.println("Lamp State After Toggling Second Switch: " + hallwayLight1.getLampState());
        System.out.println("Lamp State: " + hallwayLight1.getLampState());

        hallwayLight.toggleFirstSwitch();
        System.out.println("Lamp State After Toggling First Switch: " + hallwayLight2.getLampState());

        // Toggle second switch
        hallwayLight.toggleSecondSwitch();
        System.out.println("Lamp State After Toggling Second Switch: " + hallwayLight2.getLampState());
        System.out.println("Lamp State: " + hallwayLight2.getLampState());

    }
    }

