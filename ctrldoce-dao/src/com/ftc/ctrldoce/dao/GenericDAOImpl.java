package com.ftc.ctrldoce.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.ftc.ctrldoce.exception.CtrlDoceException;


public class GenericDAOImpl<T, Id extends Serializable> implements GenericDAO<T, Id> {

	private Class<T> clase;		
	protected static EntityManagerFactory factory = Persistence.createEntityManagerFactory("pixup-model");

	public GenericDAOImpl(Class<T> clase){
		this.clase = clase;
	}

	public T save(T obj) throws CtrlDoceException{
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		try{
			em.persist(obj);
			em.getTransaction().commit();
			em.refresh(obj);		
			return obj;
		}catch(PersistenceException e){
			e.printStackTrace(System.out);
			throw new CtrlDoceException("Ocurrió un error al guardar, causado por: "+e.getCause());
		}finally{				
			em.close();
		}					
	}

	public T update(T obj)throws CtrlDoceException{
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		try{
			T resultado = null;
			resultado = em.merge(obj);		
			em.getTransaction().commit();
			return resultado;
		}catch(PersistenceException e){
			e.printStackTrace(System.out);
			throw new CtrlDoceException("Ocurrió un error al actualizar, causado por: "+e.getCause());
		}finally{
			em.close();
		}
	}

	public void delete(T obj) throws CtrlDoceException{
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		try{
			if(em.find(obj.getClass() , obj)!=null){
				System.out.println("=====> Object found, it exists in the unit persistence as " + obj.toString());
				em.remove(obj);
			}else{
				System.out.println("=====> The object does not exists in the unit persistence "+obj.toString());
			}
			em.getTransaction().commit();
		}catch(PersistenceException e){
			e.printStackTrace(System.out);
			throw new CtrlDoceException("Ocurrió un error al eliminar, causado por: "+e.getCause());
		}finally{
			em.close();
		}
	}

	public boolean contains(T obj) throws CtrlDoceException{
		EntityManager em = factory.createEntityManager();
		try{
			return em.contains(obj);
		}catch(PersistenceException e){
			e.printStackTrace(System.out);
			throw new CtrlDoceException("Ocurrió un error al ejecutar contains(), causado por: "+e.getCause());
		}finally{
			em.close();
		}
	}

	public List<T> findAll()throws CtrlDoceException{
		EntityManager em = factory.createEntityManager();
		try{
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT obj FROM ").append(clase.getSimpleName()).append(" obj");
			TypedQuery<T> query = em.createQuery(sql.toString(), clase);
			return query.getResultList();
		}catch(PersistenceException e){
			e.printStackTrace(System.out);
			throw new CtrlDoceException("Ocurrió un error en findAll(), causado por: "+e.getCause());
		}finally{
			em.close();
		}
	}

	public T findById(String id)throws CtrlDoceException{
		EntityManager em = factory.createEntityManager();
		try{
			return em.find(clase, id);
		}catch(PersistenceException e){
			e.printStackTrace(System.out);
			throw new CtrlDoceException("Ocurrió un error en findById(), causado por: "+e.getCause());
		}finally{
			em.close();
		}
	}

	/**
	 * Ejecuta un Query JQPL obteniendo una Lista con el resultado del Query
	 * 
	 * @param jpql
	 *            Query en formato JQPL
	 * @param values
	 *            Parametros del Query
	 * @return Lista con el resultado del Query
	 * @see javax.persistence.Query
	 */
	//@SuppressWarnings("unchecked")
	protected List<T> executeQuery(String jpql, Object... values)throws CtrlDoceException{
		EntityManager em = factory.createEntityManager();
		try{
			TypedQuery<T> query = em.createQuery(jpql, clase);
			int iParametro = 1;
			for (Object object : values) {
				query.setParameter(iParametro++, object);				
			}
			return query.getResultList();
		}catch(Exception e){
			e.printStackTrace(System.out);
			throw new CtrlDoceException("Ocurrió un error en executeQuery(), causado por: "+e.getCause());
		}finally{
			em.close();
		}
	}
	
	/**
	 * Ejecuta un Query Nativo
	 * @param sql Sentencia a ejecutar. Se usa executeUpdate
	 */
	protected int executeNativeQuery(String sql)throws CtrlDoceException{
		EntityManager em = factory.createEntityManager();
		try{
			Query query = em.createNativeQuery(sql);
			return query.executeUpdate();
		}catch(Exception e){
			e.printStackTrace(System.out);
			throw new CtrlDoceException("Ocurrió un error en executeNativeQuery(), causado por: "+e.getCause());
		}finally{
			em.close();
		}
	}
	
	/*
	private Class<T> getClase() {
		return clase;
	}
	
	private void setClase(Class<T> clase) {
		this.clase = clase;
	}
	 */
}
