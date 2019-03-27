package lab1_2;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import java.util.Currency;

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

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentExceptionWithCurrencyMismatchWhenAdding() {
        Money eurMoney = new Money(1, Currency.getInstance("EUR"));
        Money usdMoney = new Money(1, Currency.getInstance("USD"));
        eurMoney.add(usdMoney);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentExceptionWithCurrencyMismatchWhenSubstracting() {
        Money eurMoney = new Money(1, Currency.getInstance("EUR"));
        Money usdMoney = new Money(1, Currency.getInstance("USD"));
        eurMoney.subtract(usdMoney);
    }

    @Test
    public void shouldAddOne() {
        Money moneyOne = new Money(1);
        Money moneyTwo = new Money(2);
        assertThat(moneyOne.add(moneyOne), equalTo(moneyTwo));
    }

    @Test
    public void shouldSubstractOne() {
        Money moneyOne = new Money(1);
        Money moneyTwo = new Money(2);
        assertThat(moneyTwo.subtract(moneyOne), equalTo(moneyOne));
    }

}
