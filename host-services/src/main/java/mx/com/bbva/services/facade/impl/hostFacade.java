package mx.com.bbva.services.facade.impl;

import mx.com.bbva.commons.to.UserTO;
import mx.com.bbva.services.facade.IhostFacade;
import mx.com.bbva.services.service.IhostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class hostFacade implements IhostFacade {

    @Autowired
    private IhostService hostService;

    public List<UserTO> getAllUsers() {
        return this.hostService.getUsers();
    }
}
