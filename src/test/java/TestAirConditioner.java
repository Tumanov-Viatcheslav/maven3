import air_conditioner.AirConditioner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestAirConditioner {
    @Test
    void testAirConditionerConstructor() {
        Assertions.assertDoesNotThrow(() -> new AirConditioner(20, 10, "heat"));
    }

    @Test
    void testAirConditionerMethodsDoesNotThrow() {
        AirConditioner airConditioner = new AirConditioner(20, 10, "heat");
        Assertions.assertDoesNotThrow(airConditioner::work);
        Assertions.assertDoesNotThrow(airConditioner::fan);
        Assertions.assertDoesNotThrow(airConditioner::freeze);
        Assertions.assertDoesNotThrow(airConditioner::heat);
        Assertions.assertDoesNotThrow(airConditioner::auto);
        Assertions.assertDoesNotThrow(airConditioner::toString);
    }

    @Test
    void testFan1() {
        AirConditioner airConditioner1 = new AirConditioner(20, 10, "heat");
        Assertions.assertEquals(20, airConditioner1.fan());
    }
    @Test
    void testFan2() {
        AirConditioner airConditioner2 = new AirConditioner(20, 20, "heat");
        Assertions.assertEquals(20, airConditioner2.fan());
    }
    @Test
    void testFan3() {
        AirConditioner airConditioner3 = new AirConditioner(10, 20, "heat");
        Assertions.assertEquals(10, airConditioner3.fan());
    }

    @Test
    void testFreeze1() {
        AirConditioner airConditioner1 = new AirConditioner(20, 10, "heat");
        Assertions.assertEquals(10, airConditioner1.freeze());
    }
    @Test
    void testFreeze2() {
        AirConditioner airConditioner2 = new AirConditioner(20, 20, "heat");
        Assertions.assertEquals(20, airConditioner2.freeze());
    }
    @Test
    void testFreeze3() {
        AirConditioner airConditioner3 = new AirConditioner(10, 20, "heat");
        Assertions.assertEquals(10, airConditioner3.freeze());
    }

    @Test
    void testHeat1() {
        AirConditioner airConditioner1 = new AirConditioner(20, 10, "heat");
        Assertions.assertEquals(20, airConditioner1.heat());
    }
    @Test
    void testHeat2() {
        AirConditioner airConditioner2 = new AirConditioner(20, 20, "heat");
        Assertions.assertEquals(20, airConditioner2.heat());
    }
    @Test
    void testHeat3() {
        AirConditioner airConditioner3 = new AirConditioner(10, 20, "heat");
        Assertions.assertEquals(20, airConditioner3.heat());
    }

    @Test
    void testAuto1() {
        AirConditioner airConditioner1 = new AirConditioner(20, 10, "heat");
        Assertions.assertEquals(10, airConditioner1.auto());
    }
    @Test
    void testAuto2() {
        AirConditioner airConditioner2 = new AirConditioner(20, 20, "heat");
        Assertions.assertEquals(20, airConditioner2.auto());
    }
    @Test
    void testAuto3() {
        AirConditioner airConditioner3 = new AirConditioner(10, 20, "heat");
        Assertions.assertEquals(20, airConditioner3.auto());
    }

    @Test
    void testWork1() {
        AirConditioner airConditioner1 = new AirConditioner(20, 10, "heat");
        AirConditioner airConditioner2 = new AirConditioner(20, 10, "freeze");
        AirConditioner airConditioner3 = new AirConditioner(20, 10, "fan");
        AirConditioner airConditioner4 = new AirConditioner(20, 10, "auto");
        Assertions.assertEquals(20, airConditioner1.work());
        Assertions.assertEquals(10, airConditioner2.work());
        Assertions.assertEquals(20, airConditioner3.work());
        Assertions.assertEquals(10, airConditioner4.work());
    }
    @Test
    void testWork2() {
        AirConditioner airConditioner1 = new AirConditioner(20, 20, "heat");
        AirConditioner airConditioner2 = new AirConditioner(20, 20, "freeze");
        AirConditioner airConditioner3 = new AirConditioner(20, 20, "fan");
        AirConditioner airConditioner4 = new AirConditioner(20, 20, "auto");
        Assertions.assertEquals(20, airConditioner1.work());
        Assertions.assertEquals(20, airConditioner2.work());
        Assertions.assertEquals(20, airConditioner3.work());
        Assertions.assertEquals(20, airConditioner4.work());
    }
    @Test
    void testWork3() {
        AirConditioner airConditioner1 = new AirConditioner(10, 20, "heat");
        AirConditioner airConditioner2 = new AirConditioner(10, 20, "freeze");
        AirConditioner airConditioner3 = new AirConditioner(10, 20, "fan");
        AirConditioner airConditioner4 = new AirConditioner(10, 20, "auto");
        Assertions.assertEquals(20, airConditioner1.work());
        Assertions.assertEquals(10, airConditioner2.work());
        Assertions.assertEquals(10, airConditioner3.work());
        Assertions.assertEquals(20, airConditioner4.work());
    }
    @Test
    void testWork4() {
        AirConditioner airConditioner1 = new AirConditioner(10, 20, "heat");
        AirConditioner airConditioner2 = new AirConditioner(10, 20, "freeze");
        AirConditioner airConditioner3 = new AirConditioner(10, 20, "fan");
        AirConditioner airConditioner4 = new AirConditioner(10, 20, "auto");
        Assertions.assertEquals(airConditioner4.work(), airConditioner1.work());
        Assertions.assertEquals(airConditioner1.work(), airConditioner4.work());
        Assertions.assertEquals(airConditioner2.work(), airConditioner3.work());
        Assertions.assertEquals(airConditioner3.work(), airConditioner2.work());
    }
    @Test
    void testWork5() {
        AirConditioner airConditioner1 = new AirConditioner(10, 20, "heat");
        AirConditioner airConditioner2 = new AirConditioner(10, 20, "freeze");
        AirConditioner airConditioner3 = new AirConditioner(10, 20, "fan");
        AirConditioner airConditioner4 = new AirConditioner(10, 20, "auto");
        Assertions.assertEquals(airConditioner1.heat(), airConditioner1.work());
        Assertions.assertEquals(airConditioner2.freeze(), airConditioner2.work());
        Assertions.assertEquals(airConditioner3.fan(), airConditioner3.work());
        Assertions.assertEquals(airConditioner4.auto(), airConditioner4.work());
    }
    @Test
    void testWork6() {
        AirConditioner airConditioner1 = new AirConditioner(20, 20, "heat");
        AirConditioner airConditioner2 = new AirConditioner(20, 20, "freeze");
        AirConditioner airConditioner3 = new AirConditioner(20, 20, "fan");
        AirConditioner airConditioner4 = new AirConditioner(20, 20, "auto");
        Assertions.assertEquals(airConditioner1.heat(), airConditioner1.work());
        Assertions.assertEquals(airConditioner2.freeze(), airConditioner2.work());
        Assertions.assertEquals(airConditioner3.fan(), airConditioner3.work());
        Assertions.assertEquals(airConditioner4.auto(), airConditioner4.work());
    }
    @Test
    void testWork7() {
        AirConditioner airConditioner1 = new AirConditioner(20, 10, "heat");
        AirConditioner airConditioner2 = new AirConditioner(20, 10, "freeze");
        AirConditioner airConditioner3 = new AirConditioner(20, 10, "fan");
        AirConditioner airConditioner4 = new AirConditioner(20, 10, "auto");
        Assertions.assertEquals(airConditioner1.heat(), airConditioner1.work());
        Assertions.assertEquals(airConditioner2.freeze(), airConditioner2.work());
        Assertions.assertEquals(airConditioner3.fan(), airConditioner3.work());
        Assertions.assertEquals(airConditioner4.auto(), airConditioner4.work());
    }
    @Test
    void testWork8() {
        AirConditioner airConditioner1 = new AirConditioner(20, 10, "heat");
        AirConditioner airConditioner2 = new AirConditioner(20, 10, "freeze");
        AirConditioner airConditioner3 = new AirConditioner(20, 10, "fan");
        AirConditioner airConditioner4 = new AirConditioner(20, 10, "auto");
        Assertions.assertNotEquals(airConditioner1.work(), airConditioner2.work());
        Assertions.assertNotEquals(airConditioner1.work(), airConditioner4.work());
        Assertions.assertNotEquals(airConditioner2.work(), airConditioner3.work());
        Assertions.assertNotEquals(airConditioner3.work(), airConditioner4.work());
    }
    @Test
    void testWork9() {
        AirConditioner airConditioner1 = new AirConditioner(20, 20, "heat");
        AirConditioner airConditioner2 = new AirConditioner(20, 20, "freeze");
        AirConditioner airConditioner3 = new AirConditioner(20, 20, "fan");
        AirConditioner airConditioner4 = new AirConditioner(20, 20, "auto");
        Assertions.assertEquals(airConditioner1.work(), airConditioner2.work());
        Assertions.assertEquals(airConditioner1.work(), airConditioner3.work());
        Assertions.assertEquals(airConditioner1.work(), airConditioner4.work());
    }
    @Test
    void testWork10() {
        AirConditioner airConditioner1 = new AirConditioner(20, 20, "hell");
        Assertions.assertEquals(-273, airConditioner1.work());
    }
}
