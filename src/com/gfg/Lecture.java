package com.gfg;
import java.util.*;
public class Lecture {
    private String title;
    private String mentor;
    public String status;
    private Date creationDate;
public static Integer numOfObjects=0;
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMentor() {
        return mentor;
    }

    public void setMentor(String mentor) {
        this.mentor = mentor;
    }

    public Date getCreationDate() {
        return new Date(creationDate.getTime());
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "title='" + title + '\'' +
                ", mentor='" + mentor + '\'' +
                ", status='" + status + '\'' +
                ", creationDate=" + creationDate +
                '}';
    }

    public Lecture(String title, String mentor, String status) {
        this.title = title;
        this.mentor = mentor;
        this.status = status;
        numOfObjects++;
        creationDate=new Date();
    }
protected String lectureDetailsProtected()
{
    return title+ " "+status;
}
    public Lecture() {
        numOfObjects++;
        creationDate=new Date();
    }
}
