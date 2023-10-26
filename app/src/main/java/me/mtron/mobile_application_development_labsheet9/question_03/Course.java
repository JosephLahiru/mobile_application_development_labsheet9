package me.mtron.mobile_application_development_labsheet9.question_03;

public class Course {
    private String courseCode;
    private String subjectName;
    private String lecturerName;
    private int credits;

    public Course(String courseCode, String subjectName, String lecturerName, int credits) {
        this.courseCode = courseCode;
        this.subjectName = subjectName;
        this.lecturerName = lecturerName;
        this.credits = credits;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public String getLecturerName() {
        return lecturerName;
    }

    public int getCredits() {
        return credits;
    }
}

