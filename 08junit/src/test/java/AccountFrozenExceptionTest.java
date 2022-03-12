import com.epam.mentoring.testautomation.AccountFrozenException;
import com.epam.mentoring.testautomation.BankAccount;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Account Frozen Test")
public class AccountFrozenExceptionTest {
    @Test
    @DisplayName("Default limit is reached")
    public void testDefaultLimit() throws AccountFrozenException {
        BankAccount bankAccount01 = new BankAccount("Mr. Test User01", 50.00);
        bankAccount01.debit(50.00);
        Assertions.assertEquals(0.00, bankAccount01.getBalance());
        System.out.println(bankAccount01.getAccountDetails());
    }

    @Test
    @DisplayName("Default limit cannot be exceeded")
    public void testDefaultLimitExceed() throws AccountFrozenException {
        BankAccount bankAccount02 = new BankAccount("Mr. Test User02", 50.00, -50.00);
        bankAccount02.debit(101.00);
        Assertions.assertTrue(bankAccount02.isFrozen());
        System.out.println(bankAccount02.getAccountDetails());
    }

    @Test
    @DisplayName("Default balance cannot be lower than the limit")
    public void testLowerBalanceThanDefaultLimit() throws AccountFrozenException {
        BankAccount bankAccount05 = new BankAccount("Mr. Test User05", -100.00, -50.00);
        bankAccount05.credit(0.00);
        Assertions.assertTrue(bankAccount05.isFrozen());
        System.out.println(bankAccount05.getAccountDetails());
    }
}
