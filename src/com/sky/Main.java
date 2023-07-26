package com.sky;

import java.util.Arrays;
import java.util.ArrayList;

public class Main {

    private static final String DB_URL = "Hello World!";

    public static void main(String[] args) {
        Store<String> word = new Store();

        System.out.println(word.getStore());
        word.setStore("hehje");
        System.out.println(word.getStore());

        System.out.println(DB_URL);
//        DB_URL = "no"; // Cant be changed
        // Read Only

        Store<Day> today = new Store();
        today.setStore(Day.Friday);

        // Job Enum
        // Salary and Hours per Week
        // CalculateHourlyPay Method
        // Raise Method. Increases Salary by 1%
        // Switch through them - make something up

        // Enums
        // Exceptions - Try and Catch
        // Lambdas
        // Inputs
        // EOD Task

        Job job = Job.SoftwareTester;
        System.out.println(job);
        System.out.println(job.getSalary());
        System.out.println(job.getWeeklyHours());
        System.out.println(job.getHourlyRate());

        job.Raise();
        System.out.println(job.getHourlyRate());
        job.Raise(10);
        System.out.println(job.getHourlyRate());

        switch (job){
            case Janitor:
                job = Job.SoftwareTester;
                break;
            case SoftwareTester:
                job = Job.Developer;
                break;
            case Developer:
                job = Job.CEO;
                break;
            case CEO:
                job = Job.Janitor;
                break;
        }

        System.out.println(job);
        System.out.println(job.getSalary());
        System.out.println(job.getWeeklyHours());
        System.out.println(job.getHourlyRate());

        job.Raise();
        System.out.println(job.getHourlyRate());
        job.Raise(10);
        System.out.println(job.getHourlyRate());

    }

}