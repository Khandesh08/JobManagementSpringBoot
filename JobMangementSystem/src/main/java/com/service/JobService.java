package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.Jobdao;
import com.model.Job;

@Service
public class JobService 
{
   @Autowired
   private Jobdao dao;
   
   public Job savedata(Job job)
   {
	   return dao.savedata(job);
   }
   
   public Job getdata(int id)
   {
	   return dao.getdata(id);
   }
   
   public List<Job> getAll()
   {
	   return dao.getAll();
   }
   
   public Job getupdate(int id, String Company)
   {
	   return dao.update(id, Company);
   }
   
   public String delete(int id)
   {
	   return dao.delete(id);
   }
}
