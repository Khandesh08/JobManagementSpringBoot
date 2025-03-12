package com.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Job;

public interface JobRepository extends JpaRepository<Job, Integer>
{

}
