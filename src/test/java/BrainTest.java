import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BrainTest {

    @Test
    void isHasFrontalLobe() {
        Brain brain = new Brain();
        brain.hasFrontalLobe = false;
        assert(!brain.isHasFrontalLobe());
        System.out.println("hi from isHasFrontalLobe");
    }

    @Test
    void setHasFrontalLobe() {
        Brain brain = new Brain();
        brain.setHasFrontalLobe(false);
        assert(!brain.hasFrontalLobe);
        System.out.println("hi from setHasFrontalLobe");
    }

    @Test
    void hi() {
        assert false;
    }
}