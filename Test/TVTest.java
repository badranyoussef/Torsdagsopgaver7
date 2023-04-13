import Task1.TV;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TVTest {

    @BeforeEach
    void setUp() {

        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);

        TV tv2 = new TV();
        tv2.channelUp();
        tv2.channelUp();
        tv2.turnOn();
        tv2.volumeUp();

    }

    @Test
    void setChannel() {

        assertEquals(30,tv1)

    }

    @Test
    void setVolume() {
    }

    @Test
    void turnTvOff() {
    }

    @Test
    void turnTvOn() {
    }
}