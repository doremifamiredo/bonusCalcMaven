import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BonusSrviceTest {

    @Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();
        long amount = 1000;
        boolean registered = true;
        long expected = 30;
        long actual = service.calcBonus(amount, registered);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();
        long amount = 1_000_000;
        boolean registered = true;
        long expected = 500;
        long actual = service.calcBonus(amount, registered);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForUnregisteredAndUnderLimit() {
        BonusService service = new BonusService();
        long amount = 1000;
        boolean registered = false;
        long expected = 10;
        long actual = service.calcBonus(amount, registered);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForUnregisteredAndOverLimit() {
        BonusService service = new BonusService();
        long amount = 1_000_000_000;
        boolean registered = false;
        long expected = 500;
        long actual = service.calcBonus(amount, registered);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldClaculateForRegistredAndGetOneBonus() {
        BonusService service = new BonusService();
        long amount = 34;
        boolean registered = true;
        long expected = 1;
        long actual = service.calcBonus(amount, registered);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldClaculateForRegistredAndNotEnoughToGetOneBonus() {
        BonusService service = new BonusService();
        long amount = 33;
        boolean registered = true;
        long expected = 0;
        long actual = service.calcBonus(amount, registered);
        Assertions.assertEquals(expected, actual);
    }
}
