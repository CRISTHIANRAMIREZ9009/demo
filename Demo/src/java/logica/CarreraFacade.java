/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelo.Carrera;

/**
 *
 * @author TUL-00041FCLEM
 */
@Stateless
public class CarreraFacade extends AbstractFacade<Carrera> implements CarreraFacadeLocal {
    @PersistenceContext(unitName = "DemoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CarreraFacade() {
        super(Carrera.class);
    }
    
}
