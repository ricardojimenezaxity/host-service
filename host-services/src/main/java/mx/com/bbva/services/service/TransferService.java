package mx.com.bbva.services.service;

import mx.com.bbva.commons.to.ResponseTO;

public interface TransferService {

    public ResponseTO doTransferAccount();

    public ResponseTO doTransferSpei();
}
