/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelo.Materia;

/**
 *
 * @author TUL-00041FCLEM
 */
@Stateless
public class MateriaFacade extends AbstractFacade<Materia> implements MateriaFacadeLocal {
    @PersistenceContext(unitName = "DemoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MateriaFacade() {
        super(Materia.class);
    }
    
}
