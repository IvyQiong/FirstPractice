
package studentlistextra;

/**
 *date: 2022-02-03
 * @author Qiong Liao
 */
public class Student2 {
    private String studentId;
    private String studentName;
    
    public Student2(String studentId, String studentName){
       this.studentId = studentId;
       this.studentName = studentName;
    }
    public String getStudentId(){
        return studentId;
    }
    public String getStudentName(){
        return studentName;
    }
    public void setStudentId(String studentId){
        this.studentId = studentId;
    }
    public void setStudentName(String studentName){
        this.studentName = studentName;
    }
    public String toString(){
        return "Student{" + "studdentId=" +studentId
                +", studnetName=" +studentName +"]";
    }
}
