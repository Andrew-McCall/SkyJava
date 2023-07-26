package com.sky;

public enum Day {
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday;

    private String MOTD = "hi!";

    public static Day GetToday(){
        return Wednesday;
    }

    public String getMOTD() {
        return MOTD;
    }

    public void setMOTD(String MOTD) {
        this.MOTD = MOTD;
    }

}
