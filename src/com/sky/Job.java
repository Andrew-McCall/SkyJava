package com.sky;

public enum Job {
    CEO(100000, 10),
    Janitor(20000, 60),
    Developer(25000, 60),
    SoftwareTester(20000, 50);

    private int Salary;
    private int WeeklyHours;

    Job(int salary, int weeklyHours){
        Salary = salary;
        WeeklyHours = weeklyHours;
    }

    public int getSalary() {
        return Salary;
    }

    public int getWeeklyHours() {
        return WeeklyHours;
    }

    public double getHourlyRate(){
        return Salary / (52.0*WeeklyHours);
    }

    public void Raise(){
        Salary *= 1.01;
    }

    public void Raise(int raisePercentage){
        Salary *= (1+(raisePercentage/100.0));
    }
}
