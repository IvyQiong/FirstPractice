
package studentlistextra;
/**
 *
 * @author Qiong Liao
 */
public class StudentListExtra {
    public static void main(String[] args) {
     Student2[] studentList = new Student2[3];
     studentList[0] = new Student2("s1","Amy");
     studentList[1] = new Student2("s2","Bob");
     studentList[2] = new Student2("s3","John");
     
     for(Student2 s : studentList){
         System.out.println(s);
     }
     
    }
    
}
