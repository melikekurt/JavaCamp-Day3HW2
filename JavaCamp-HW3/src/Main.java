
public class Main {

	public static void main(String[] args) {
		Student s = new Student();
		s.setAge("18");
		s.setFirstName("Melike");
		s.setLastName("Kurt");
		s.setSchool("Ist. Medeniyet Uni.");
		s.setSchoolNo("12345");
		s.setScore("100");
	
		Instructor i = new Instructor();
		i.setAge("35");
		i.setFirstName("Engin");
		i.setLastName("Demirog");
		i.setMajor("Java");
		i.setSchool("-");
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(s);
		studentManager.findScore(s);
		
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(i);
		instructorManager.findMajor(i);
		
		
		
		
		
		studentManager.del(s);
		instructorManager.del(i);
		
		
	
	
	}

}
