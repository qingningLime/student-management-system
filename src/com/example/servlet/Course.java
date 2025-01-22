package com.example.servlet;

public class Course {

        private String name;
        private String teacher;

        // 构造方法
        public Course(String name, String teacher) {
            this.name = name;
            this.teacher = teacher;
        }

        // Getter and Setter
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getTeacher() {
            return teacher;
        }

        public void setTeacher(String teacher) {
            this.teacher = teacher;
        }
}
