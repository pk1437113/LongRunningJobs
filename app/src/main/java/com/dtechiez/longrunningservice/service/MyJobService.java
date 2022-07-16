package com.dtechiez.longrunningservice.service;

import android.annotation.SuppressLint;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Log;

@SuppressLint("SpecifyJobSchedulerIdRange")
public class MyJobService extends JobService {
    @Override
    public boolean onStartJob(JobParameters params) {
        // Write your code here
        Log.d("MyJobService", "called");
        return true;
    }


    @Override
    public boolean onStopJob(JobParameters params) {
        return true;
    }

}
