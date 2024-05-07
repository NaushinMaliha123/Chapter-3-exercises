public class LightController {
    private int firstSwitchState;
    private int secondSwitchState;
    private int lampState;

    public LightController() {
        firstSwitchState = 0;
        secondSwitchState = 0;
        lampState = 0;
    }

    public LightController(int firstSwitchState, int secondSwitchState, int lampState) {
        this.firstSwitchState = firstSwitchState;
        this.secondSwitchState = secondSwitchState;
        this.lampState = lampState;
    }

    public int getFirstSwitchState() {
        return firstSwitchState;
    }

    public int getSecondSwitchState() {
        return secondSwitchState;
    }

    public int getLampState() {
        return lampState;
    }
    public void toggleFirstSwitch() {
        firstSwitchState = (firstSwitchState == 0) ? 1 : 0;
        toggleLamp();
    }

    public void toggleSecondSwitch() {
        secondSwitchState = (secondSwitchState == 0) ? 1 : 0;
        toggleLamp();
    }

    public void toggleLamp() {
        if (firstSwitchState == 1 || secondSwitchState == 1) {
            lampState = (lampState == 0) ? 1 : 0;
        }
    }
}
