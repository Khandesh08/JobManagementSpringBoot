package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Job;
import com.service.JobService;

@RestController
@ResponseBody
public class JobController 
{
	@Autowired
	private JobService serv;
	
	@GetMapping("/name")
    public String getname()
    {
    	return "huggg";
    }
	
	
	@PostMapping("/data")
	public Job savedata(@RequestBody  Job job)
	{
		return serv.savedata(job);
	}
	
	@GetMapping("/gett/{id}")
	public Job getdata(@PathVariable("id") int id)
	{
		return serv.getdata(id);
	}
	
	@GetMapping("/getall")
	public List<Job> getAlljJobs()
	{
		return serv.getAll();
	}
	
	@PutMapping("/update/{id}/{company}")
	public Job updatevalue(@PathVariable("id") int id, @PathVariable ("company") String company)
	{
		return serv.getupdate(id, company);
	}
	
	@DeleteMapping("/del/{id}")
	public String delete(@PathVariable("id") int id)
	{
		return serv.delete(id);
	}
}
