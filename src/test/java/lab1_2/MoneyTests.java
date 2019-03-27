package lab1_2;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import pl.com.bottega.ecommerce.sharedkernel.Money;

public class MoneyTests {

    @Test
    public void shouldReturnMoneyMultipliedByTwo() {
        Money money = new Money(100);
        Money moneyAfterMultiplying = new Money(200);
        money = money.multiplyBy(2);
        assertThat(moneyAfterMultiplying.equals(money), equalTo(true));
    }
}
