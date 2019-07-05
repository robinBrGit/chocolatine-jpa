package dev.service;

import dev.entite.Chocolatine;
import dev.util.Constantes;

import javax.persistence.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChocolatineService {
     private EntityManagerFactory emf = Constantes.EMF;

     public ChocolatineService(){

     }

     public Map<Integer,Chocolatine> listerChocolatine(){
         EntityManager em  = emf.createEntityManager();
         Query q = em.createQuery("from Chocolatine");

         List<Chocolatine> chocolatines = q.getResultList();
         em.close();
         Map<Integer,Chocolatine> lesChocolatines = new HashMap<>();
         for(int i = 0;i < chocolatines.size();i++){
             lesChocolatines.put(i,chocolatines.get(i));
         }
         return lesChocolatines;
     }

     public void ajouterChocolatine(Chocolatine chocolatine){
         EntityManager em = emf.createEntityManager();
         EntityTransaction et = em.getTransaction();
         et.begin();
         em.persist(chocolatine);
         et.commit();
         em.close();
     }




}
