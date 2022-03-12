import com.epam.mentoring.testautomation.AccountFrozenException;
import com.epam.mentoring.testautomation.BankAccount;
import org.junit.jupiter.api.*;

import java.util.logging.Level;
import java.util.logging.Logger;

@DisplayName("Credit test for BankAccount")
public class CreditTest {
    private static final Logger LOG = Logger.getLogger(CreditTest.class.getName());
    private BankAccount bankAccount;

    @BeforeEach
    public void setUp() {
        bankAccount = new BankAccount("Mr. Test User03", 50.00, -50.00);
    }

    @Test
    @DisplayName("Deposit 50 successfully")
    public void testCredit50() throws AccountFrozenException {
        bankAccount.credit(50.00);
        Assertions.assertEquals(100.00, bankAccount.getBalance());

    }

    @Test
    @DisplayName("Negative deposit")
    public void testNegativeCredit() throws AccountFrozenException {
        bankAccount.credit(-100.00);
        Assertions.assertEquals(-50.00, bankAccount.getBalance());
    }

    @AfterEach
    public void tearDown() {
        System.out.println(bankAccount.getAccountDetails());
        LOG.log(Level.INFO, "The CreditTest has finished.");
    }
}