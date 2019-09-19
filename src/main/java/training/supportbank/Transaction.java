package training.supportbank;

import java.math.BigDecimal;
import java.util.Date;

class Transaction {
    private Date date;
    private String toName;
    private String fromName;
    private String narrative;
    private BigDecimal amount;


    public Date getDate() {
        return date;
    }

    public String getToName(){
        return toName;
    }

    public String getFromName(){
        return fromName;
    }

    public String getNarrative(){
        return narrative;
    }

    public BigDecimal getAmount() {
        return amount;
    }


}
