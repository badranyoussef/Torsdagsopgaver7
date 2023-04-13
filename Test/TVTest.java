import Task1.TV;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TVTest {


    TV tv1;
    TV tv2;

    @BeforeEach
    void setUp() {

        tv1 = new TV();
        tv2 = new TV();


    }

    @Test
    void tv1Test() {
        assertEquals(true,tv1.turnOn());
        assertEquals(30,tv1.setChannel(30));
        assertEquals(3,tv1.setVolume(3));
    }

    @Test
    void tv2Test() {
        assertEquals(1,tv2.channelUp()); //fejler da TV2 endnu ikke er tændt.
        assertEquals(true,tv2.turnOn());
        assertEquals(3,tv2.setVolume(3));
    }

}