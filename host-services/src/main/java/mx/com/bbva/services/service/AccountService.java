package mx.com.bbva.services.service;

import mx.com.bbva.commons.to.ResponseTO;

public interface AccountService {

    public ResponseTO doWithdrawal();

    public ResponseTO doDesposit();

}
