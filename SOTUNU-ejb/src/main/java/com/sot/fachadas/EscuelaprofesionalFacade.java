/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sot.fachadas;

import com.sot.entidades.Escuelaprofesional;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Raul
 */
@Stateless
public class EscuelaprofesionalFacade extends AbstractFacade<Escuelaprofesional> implements EscuelaprofesionalFacadeLocal {
  @PersistenceContext(unitName = "com.sot_SOTUNU-ejb_ejb_1.0PU")
  private EntityManager em;

  @Override
  protected EntityManager getEntityManager() {
    return em;
  }

  public EscuelaprofesionalFacade() {
    super(Escuelaprofesional.class);
  }

}
