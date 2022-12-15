public class Teacher {

    private int teacherId;
    private String teacherName;
    private String teacherSurname;
    private int identityNumberTeacher;
    private int ageTeacher;
    private String section;
    private int recordNumber;

    public Teacher() {

    }

    public Teacher(int teacherId, String teacherName, String teacherSurname, int identityNumberTeacher, int ageTeacher, String section, int recordNumber) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.teacherSurname = teacherSurname;
        this.identityNumberTeacher = identityNumberTeacher;
        this.ageTeacher = ageTeacher;
        this.section = section;
        this.recordNumber = recordNumber;
    }


    public Teacher(String teacherName, String teacherSurname, int ageTeacher, String section, int recordNumber) {
        this.teacherName = teacherName;
        this.teacherSurname = teacherSurname;
        this.ageTeacher = ageTeacher;
        this.section = section;
        this.recordNumber = recordNumber;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", teacherName='" + teacherName + '\'' +
                ", teacherSurname='" + teacherSurname + '\'' +
                ", identityNumberTeacher=" + identityNumberTeacher +
                ", ageTeacher=" + ageTeacher +
                ", section='" + section + '\'' +
                ", recordNumber=" + recordNumber +
                '}';
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherSurname() {
        return teacherSurname;
    }

    public void setTeacherSurname(String teacherSurname) {
        this.teacherSurname = teacherSurname;
    }

    public int getIdentityNumberTeacher() {
        return identityNumberTeacher;
    }

    public void setIdentityNumberTeacher(int identityNumberTeacher) {
        this.identityNumberTeacher = identityNumberTeacher;
    }

    public int getAgeTeacher() {
        return ageTeacher;
    }

    public void setAgeTeacher(int ageTeacher) {
        this.ageTeacher = ageTeacher;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public int getRecordNumber() {
        return recordNumber;
    }

    public void setRecordNumber(int recordNumber) {
        this.recordNumber = recordNumber;
    }

}
