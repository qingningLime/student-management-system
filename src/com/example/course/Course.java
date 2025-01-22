package com.example.course;

public class Course {
    private String course_name;
    private Integer course_id;
    private String course_description;
    private String course_duration;
    private String course_teacher;



    public Course(Integer course_id, String course_name, String course_description ,String course_teacher) {

        this.course_id = course_id;
        this.course_name = course_name;
        this.course_description = course_description;

        this.course_teacher = course_teacher;
//        this.course_duration = course_duration;

    }


    public String getCourse_teacher() {
        return course_teacher;
    }

    public void setCourse_teacher(String course_teacher) {
        this.course_teacher = course_teacher;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public Integer getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Integer course_id) {
        this.course_id = course_id;
    }

    public String getCourse_description() {
        return course_description;
    }

    public void setCourse_description(String course_description) {
        this.course_description = course_description;
    }

    public String getCourse_duration() {
        return course_duration;
    }

    public void setCourse_duration(String course_duration) {
        this.course_duration = course_duration;
    }
}
