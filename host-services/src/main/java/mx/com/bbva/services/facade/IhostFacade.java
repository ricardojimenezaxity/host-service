package mx.com.bbva.services.facade;

import mx.com.bbva.commons.to.UserTO;

import java.util.List;

public interface IhostFacade {

    List<UserTO> getAllUsers();

}
