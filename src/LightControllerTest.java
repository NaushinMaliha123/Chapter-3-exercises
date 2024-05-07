import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.*;
class LightControllerTest {
    LightController light;
    @BeforeEach
    void setUp(){
        light = new LightController();
    }

    @Test
    void getlight() {
        assertEquals(0,light.getLampState());
    }

    @Test
     void getlight0() {
        light.toggleFirstSwitch();
        assertEquals(1,light.getLampState());
    }

    @Test
    void getlight1() {
        light.toggleSecondSwitch();
        assertEquals(1,light.getLampState());
    }

    @Test
    void getlight2() {
        light.toggleFirstSwitch();
        light.toggleSecondSwitch();
        assertEquals(0,light.getLampState());

    }


    @Test
    void getLampState() {
    }

    @Test
    void toggleFirstSwitch() {
    }

    @Test
    void toggleSecondSwitch() {
    }

    @Test
    void toggleLamp() {
    }
}