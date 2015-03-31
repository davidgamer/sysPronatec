/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syspronatec;

import Model.Curso;
import Model.Endereco;
import Model.Escolaridade;
import Model.Pessoa;

import Visao.Main;
import java.util.Calendar;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author David
 */
public class SysPronatec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        Main m = new Main();
        m.setVisible(true);
       
        
        
      /*  
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
          Transaction tx = null;
        
        
        session.beginTransaction();
        
      
        
        
        
        
     
        
        
        
       
        
        
     
          try {

          

         //   tx = session.beginTransaction();

        //    session.persist();
            //session.persist(Ed);

         //   tx.commit();

        } catch (Exception e) {

            if (tx != null)

              tx.rollback();

            System.out.println("Transação falhou : ");

            e.printStackTrace();

        }



        
        
        
        session.close();
        
    }
   */ 
}
}
