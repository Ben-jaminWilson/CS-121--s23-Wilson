package Acitivty12;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class activity12Test {
    activity12 x = new activity12(1,5,5);



    @Test
    void displayData() {
        //assertEquals(3,x.displayData());
        assertEquals(1,x.getLength());
    }
    @Test
    void getLength(){

        assertEquals(1,x.getLength());
    }
}