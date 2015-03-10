package com.javatunes.persist;

import javax.persistence.EntityManager;

public class JpaMusicItemDAO implements MusicItemDAO {
	
	// TOOO: Add annotation to inject the EM
	private EntityManager em;

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

	public MusicItem findById(Long id) {
		return null;  // TODO: Finish this by using em.find()
	}

}
