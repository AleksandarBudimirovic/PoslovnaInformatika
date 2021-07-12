package com.lama.LamaProject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.lama.LamaProject.main.StavkeCenovnika;

@Repository
public interface StavkaCenovnikaRepository extends JpaRepository<StavkeCenovnika, Long>{
	
}
