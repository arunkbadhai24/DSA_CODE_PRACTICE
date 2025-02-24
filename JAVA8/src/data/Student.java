package data;

import java.util.List;

public class Student {

    private String name;
    private String gender;
    private Double gpa;
    private Integer gradeLevel;
    private List<String> acitvities;

    public Student(String name, String gender, Double gpa, Integer gradeLevel, List<String> acitvities) {
        this.name = name;
        this.gender = gender;
        this.gpa = gpa;
        this.gradeLevel = gradeLevel;
        this.acitvities = acitvities;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", gpa=" + gpa +
                ", gradeLevel=" + gradeLevel +
                ", acitvities=" + acitvities +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }

    public List<String> getAcitvities() {
        return acitvities;
    }

    public void setAcitvities(List<String> acitvities) {
        this.acitvities = acitvities;
    }

    public Integer getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(Integer gradeLevel) {
        this.gradeLevel = gradeLevel;
    }
}
