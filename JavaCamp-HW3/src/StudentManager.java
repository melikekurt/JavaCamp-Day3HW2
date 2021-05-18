
public class StudentManager extends UserManager{
	public void findScore(Student student) {
		System.out.println(student.firstName+" "+student.lastName+" Notu:"+" "+student.score);
	}
}
