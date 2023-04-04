import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import ru.netology.services.WorkSchedule;

public class WorkScheduleTest {

    @Test
    public void TestTimeSheduleManyVocation() {
        WorkSchedule service = new WorkSchedule();
        int expected = 3;
        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;
        int actual = service.calculate(income, expenses, threshold);

    }


    @Test
    public void TestTimeSheduleFewVocation() {
        WorkSchedule service = new WorkSchedule();
        int expected = 2;
        int income = 100000;
        int expenses = 60000;
        int threshold = 150000;
        int actual = service.calculate(income, expenses, threshold);

    }
}