import hnu.progtech.Rechteck;

import static org.junit.jupiter.api.Assertions.*;

class RechteckTest {

    @org.junit.jupiter.api.Test
    void getUmfang() {
        Rechteck r1 = new Rechteck(2,4);
        assertEquals(12,r1.getUmfang());
    }
}