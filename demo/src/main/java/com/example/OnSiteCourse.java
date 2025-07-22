package com.example;

public class OnSiteCourse extends Course {
    private String room;
    private int maxQuota;

    public OnSiteCourse(String title, int duration, String professor, String room, int maxQuota) {
        super(title, duration, professor);
        this.room = room;
        this.maxQuota = maxQuota;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public int getMaxQuota() {
        return maxQuota;
    }

    public void setMaxQuota(int maxQuota) {
        this.maxQuota = maxQuota;
    }

    @Override
    public String showInformation() {
        return "[On Site] " + super.showInformation() + " - Room: " + room + ", Quota: " + maxQuota;
    }
}