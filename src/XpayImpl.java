import com.teamrocket.Xpay;
public class XpayImpl implements Xpay {
    private String CradidCardNo;
    private String CustomerName;
    private String CardExpMonth;
    private String CardExpYear;
    private Short CardCVVNo;
    private Double Amount;

    @Override
    public String getCreditCardNo() {
        return this.CradidCardNo;
    }

    @Override
    public String getCustomerName() {
        return this.CustomerName;
    }

    @Override
    public String getCardExpMonth() {
        return this.CardExpMonth;
    }

    @Override
    public String getCardExpYear() {
        return this.CardExpYear;
    }

    @Override
    public Short getCardCVVNo() {
        return this.CardCVVNo;
    }

    @Override
    public Double getAmount() {
        return this.Amount;
    }

    @Override
    public void setCreditCardNo(String creditCardNo) {
        this.CradidCardNo = CradidCardNo;
    }

    @Override
    public void setCustomerName(String customerName) {
        this.CustomerName = CustomerName;
    }

    @Override
    public void setCardExpMonth(String cardExpMonth) {
        this.CardExpMonth = CardExpMonth;
    }

    @Override
    public void setCardExpYear(String cardExpYear) {
        this.CardExpYear = CardExpYear;
    }

    @Override
    public void setCardCVVNo(Short cardCVVNo) {
        this.CardCVVNo = CardCVVNo;
    }

    @Override
    public void setAmount(Double amount) {
        this.Amount = Amount;

    }
}
