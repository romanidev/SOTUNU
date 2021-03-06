/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sot.fachadas;

import com.sot.entidades.Escuelaprofesional;
import com.sot.entidades.Personal;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author Raul
 */
@Stateless
public class PersonalFacade extends AbstractFacade<Personal> implements PersonalFacadeLocal {
  @PersistenceContext(unitName = "com.sot_SOTUNU-ejb_ejb_1.0PU")
  private EntityManager em;

  @Override
  protected EntityManager getEntityManager() {
    return em;
  }

  public PersonalFacade() {
    super(Personal.class);
  }
  
  @Override
  public List<Personal> findByEscuelaProfesional(Escuelaprofesional escuelaProfesional, String cargo) {
    TypedQuery<Personal> q = getEntityManager().createNamedQuery("Personal.findByEscuelaProfesional", Personal.class);
    q.setParameter("idEscuelaProfesional", escuelaProfesional);
    q.setParameter("cargo", cargo);
    List<Personal> list;
    try {
      list = q.getResultList();
    } catch (NoResultException e) {
      list = null;
    }
    return list;
  }
}
