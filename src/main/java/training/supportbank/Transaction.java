package training.supportbank;

import java.math.BigDecimal;
import java.util.Date;

class Transaction {
    private Date date;
    private String sender;
    private String receiver;
    private String narrative;
    private BigDecimal amount;


    public Date getDate() {
        return date;
    }

    public String getSender(){
        return sender;
    }

    public String getReceiver(){
        return receiver;
    }

    public String getNarrative(){
        return narrative;
    }

    public BigDecimal getAmount() {
        return amount;
    }


}
