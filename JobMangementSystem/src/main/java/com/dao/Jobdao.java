package com.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Job;
import com.repo.JobRepository;

@Repository
public class Jobdao 
{
   @Autowired
   JobRepository jobrepo;
   
   public Job savedata(Job job)
   {
	   return jobrepo.save(job);
   }
   
   public Job getdata(int id)
   {
	   Optional<Job> byId = jobrepo.findById(id);
	   Job job = byId.get();
	   return job;
   }
   
   public List<Job> getAll()
   {
	   return jobrepo.findAll();
   }
   
   public Job update(int id, String Company)
   {
	   Optional<Job> byId = jobrepo.findById(id);
	   Job job = byId.get();
	   job.setCompany(Company);
	   return job;
	   
   }
   
   public String delete(int id)
   {
	   Optional<Job> byId = jobrepo.findById(id);
	   Job job = byId.get();
	   jobrepo.delete(job);
	   return "delete successfully";
   }
}
