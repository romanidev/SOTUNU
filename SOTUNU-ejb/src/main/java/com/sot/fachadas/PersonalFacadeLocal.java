/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sot.fachadas;

import com.sot.entidades.Escuelaprofesional;
import com.sot.entidades.Personal;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Raul
 */
@Local
public interface PersonalFacadeLocal {

  void create(Personal personal);

  void edit(Personal personal);

  void remove(Personal personal);

  Personal find(Object id);
  
  List<Personal> findByEscuelaProfesional(Escuelaprofesional escuelaProfesional, String cargo);
  
  List<Personal> findAll();

  List<Personal> findRange(int[] range);

  int count();
  
}
