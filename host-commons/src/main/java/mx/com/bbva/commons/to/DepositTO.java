package mx.com.bbva.commons.to;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class DepositTO implements Serializable {
    private static final long serialVersionUID = 1l;
    private String accountNumber;
    private String cardNumber;
    private String clabe;
    private String ownerName;
    private String bank;
    private Double amount;
    private String concepto;

}
