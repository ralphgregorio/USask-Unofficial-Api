package com.ralphgregorio.usaskunofficialapi.repository;

import com.ralphgregorio.usaskunofficialapi.model.Prerequisites;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrerequisitesRepository extends JpaRepository<Prerequisites, Long> {

}
