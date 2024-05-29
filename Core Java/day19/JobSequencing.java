package com.day19;


import java.util.ArrayList;
import java.util.List;

import com.day19.Job;


public class JobSequencing{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Job> jobs = new ArrayList<>();
		jobs.add(new Job(1,2,50));
		jobs.add(new Job(2,1,100));
		jobs.add(new Job(3,3,30));
		jobs.add(new Job(4,2,20));
		
		List<Job> scheduledJobs = scheduleJobs(jobs);
		System.out.println("Scheduled Jobs (in order of execution):");
		for (Job job : scheduledJobs) {
			System.out.println("Job ID: "+ job.id + ", profit: " + job.profit +", Deadline: "+ job.deadline);
		}
	}

	


				public static List<Job> scheduleJobs(List<Job> jobs){
			jobs.sort((job1, job2) -> Integer.compare(job2.profit, job1.profit ));
			List<Job> scheduledJobs = new ArrayList<>();
			int maxDeadline = 0;
			for(Job job : jobs) {
				maxDeadline = Math.max(maxDeadline, job.deadline);
			}
			//int[] slots = new int[maxDeadline,job.deadline];
		//}
		int[] slots = new int[maxDeadline];
		for(Job job : jobs) {
			for(int slot = job.deadline - 1; slot >= 0; slot--) {
				if(slots[slot]==0) {
					slots[slot]=job.id;
					scheduledJobs.add(job);
					break;
				}
			}
		}
		return scheduledJobs;
	
	}
	
	}
	class Job {
		int id;
		int deadline;
		int profit;
		
		public Job(int id, int deadline, int profit) {
			this.id = id;
			this.deadline = deadline;
			this.profit = profit;
		}
	
	}


