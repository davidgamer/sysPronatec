/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate;

import java.util.Calendar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;



/**
 *
 * @author David
 */
public class Hibernate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
       
     
        
        Tarefa tf = new Tarefa();
        tf.setDescricao("Estou bom");
        tf.setFinalizado(true);
        tf.setDataFinalizacao(Calendar.getInstance());
  
        
         Transaction tx = session.beginTransaction();
        
        
        tx.commit();
        session.saveOrUpdate(tf);
      
        session.flush();
        
        
         session.close();
      
        System.out.println("Help Man");
        
    
}
}
