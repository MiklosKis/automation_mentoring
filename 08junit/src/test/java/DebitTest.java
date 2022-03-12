import com.epam.mentoring.testautomation.AccountFrozenException;
import com.epam.mentoring.testautomation.BankAccount;
import org.junit.jupiter.api.*;

import java.util.logging.Level;
import java.util.logging.Logger;

@DisplayName("Debit test for BankAccount")
public class DebitTest {
    private static final Logger LOG = Logger.getLogger(DebitTest.class.getName());
    private BankAccount bankAccount;

    @BeforeEach
    public void setUp() {
        bankAccount = new BankAccount("Mr. Test User03", 50.00, -50.00);
    }

    @Test
    @DisplayName("Withdraw 50 successfully")
    public void testDebit50() throws AccountFrozenException {
        bankAccount.debit(45.00);
        Assertions.assertEquals(5.00, bankAccount.getBalance());
    }

    @Test
    @DisplayName("Negative withdrawal")
    public void testNegativeDebit() throws AccountFrozenException {
        bankAccount.debit(-100.00);
        Assertions.assertEquals(150.00, bankAccount.getBalance());
    }

    @AfterEach
    public void tearDown() {
        System.out.println(bankAccount.getAccountDetails());
        LOG.log(Level.INFO, "The DebitTest has finished.");
    }
}
