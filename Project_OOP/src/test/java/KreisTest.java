import hnu.progtech.Kreis;

import static org.junit.jupiter.api.Assertions.*;

class KreisTest {

    @org.junit.jupiter.api.Test
    void getUmfang() {
        Kreis k1 = new Kreis(1);
        assertEquals(2*3.14, k1.getUmfang());
    }
}