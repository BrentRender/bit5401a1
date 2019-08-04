import java.util.*;
import java.io.*;

public class main {
    static Student student1;
    static Student student2;
    static Student student3;
    static Student student4;
    static Student student5;
    
    static AssignmentMarks stu1Mathmark;
    static AssignmentMarks stu1engmark;
    static AssignmentMarks stu2Mathmark;
    static AssignmentMarks stu2engmark;
    static AssignmentMarks stu3Mathmark;
    static AssignmentMarks stu3engmark;
    static AssignmentMarks stu4Mathmark;
    static AssignmentMarks stu4engmark;
    static AssignmentMarks stu5Mathmark;
    static AssignmentMarks stu5engmark;
    static LinkedList<Student> studentlist = new LinkedList<Student>();
    static LinkedList<Student> markslist = new LinkedList<Student>();
       	
	/**
	* Reads a text file containing student data and uses this to populate the student objects
	*
	* @param filename Path to the student data file to be read
	* @return Whether the file was read successfully
	*/
	public static boolean readFile(String filename) { File file = new File(filename);
	try {
	Scanner scanner = new Scanner(file);
	while(scanner.hasNextLine()){
	scanner.useDelimiter("\\n\\r");
	String[] words = scanner.next().split(",");
	ArrayList<String> id = new ArrayList<String>();	
	id.add(words[0].replaceAll("\\r\\n", ""));
	id.add(words[9].replaceAll("\\r\\n", ""));                                                  /// not very clean code i know but this is the only way i could think of to set the strings into arraylists
	id.add(words[18].replaceAll("\\r\\n", ""));
	id.add(words[27].replaceAll("\r\\n",""));
	id.add(words[36].replaceAll("\\r\\n", ""));
	ArrayList<String> firstname = new ArrayList<String>();
	firstname.add(words[1]);
	firstname.add(words[10]);
	firstname.add(words[19]);
	firstname.add(words[28]);
	firstname.add(words[37]);
	ArrayList<String> lastname = new ArrayList<String>();
	lastname.add(words[2]);
	lastname.add(words[11]);
	lastname.add(words[20]);
	lastname.add(words[29]);
	lastname.add(words[38]);
	
	ArrayList<String> mathmarks1 = new ArrayList<String>();
	mathmarks1.add(words[3]);
	mathmarks1.add(words[12]);
	mathmarks1.add(words[21]);
	mathmarks1.add(words[30]);
	mathmarks1.add(words[39]);
	ArrayList<String> mathmarks2 = new ArrayList<String>();
	mathmarks2.add(words[4]);
	mathmarks2.add(words[13]);
	mathmarks2.add(words[22]);
	mathmarks2.add(words[31]);
	mathmarks2.add(words[40]);
	ArrayList<String> mathmarks3 = new ArrayList<String>();
	mathmarks3.add(words[5]);
	mathmarks3.add(words[14]);
	mathmarks3.add(words[23]);
	mathmarks3.add(words[32]);
	mathmarks3.add(words[41]);
	ArrayList<String> englishmarks1 = new ArrayList<String>();
	englishmarks1.add(words[6]);
	englishmarks1.add(words[15]);
	englishmarks1.add(words[24]);
	englishmarks1.add(words[33]);
	englishmarks1.add(words[42]);
	ArrayList<String> englishmarks2 = new ArrayList<String>();
	englishmarks2.add(words[7]);
	englishmarks2.add(words[16]);
	englishmarks2.add(words[25]);
	englishmarks2.add(words[34]);
	englishmarks2.add(words[43]);
	ArrayList<String> englishmarks3 = new ArrayList<String>();
	englishmarks3.add(words[8]);
	englishmarks3.add(words[17]);
	englishmarks3.add(words[26]);
	englishmarks3.add(words[35]);
	englishmarks3.add(words[44]);	
		
	addStudent(id,firstname,lastname,mathmarks1,mathmarks2,mathmarks3,englishmarks1,englishmarks2,englishmarks3); // TODO: Finish adding the parameters
	 
	}
	scanner.close();
	} catch (FileNotFoundException e) { System.out.println("Failed to read file");
	}
	return true;
	}
		
	
	public static void addStudent(ArrayList<String> id, ArrayList<String> firstName,ArrayList<String> lastName, ArrayList<String> mathMark1, ArrayList<String> mathMark2, ArrayList<String> mathMark3, ArrayList<String> EnglishMark1, ArrayList<String> EnglishMark2, ArrayList<String> EnglishMark3) {
		
		
		     student1 = new Student(Integer.parseInt(id.get(0)), firstName.get(0), lastName.get(0));
		     student2 = new Student(Integer.parseInt(id.get(1)), firstName.get(1), lastName.get(1));
		     student3 = new Student(Integer.parseInt(id.get(2)), firstName.get(2), lastName.get(2));
		     student4 = new Student(Integer.parseInt(id.get(3)), firstName.get(3), lastName.get(3));
		     student5 = new Student(Integer.parseInt(id.get(4)), firstName.get(4), lastName.get(4));
			
			stu1Mathmark = new AssignmentMarks("Mathmatics", (Integer.parseInt(mathMark1.get(0))), (Integer.parseInt(mathMark2.get(0))), (Integer.parseInt(mathMark3.get(0))));
			student1.setMathMarks(stu1Mathmark);
			stu1engmark = new AssignmentMarks("English", (Integer.parseInt(EnglishMark1.get(0))), (Integer.parseInt(EnglishMark1.get(0))), (Integer.parseInt(EnglishMark1.get(0))));
			student1.setEnglishMark(stu1engmark);			
	
			stu2Mathmark = new AssignmentMarks("Mathmatics", (Integer.parseInt(mathMark1.get(1))), (Integer.parseInt(mathMark2.get(1))), (Integer.parseInt(mathMark3.get(1))));
			student2.setMathMarks(stu2Mathmark);
			stu2engmark = new AssignmentMarks("English", (Integer.parseInt(EnglishMark1.get(1))), (Integer.parseInt(EnglishMark1.get(1))), (Integer.parseInt(EnglishMark1.get(1))));;
			student2.setEnglishMark(stu2engmark);
			
			stu3Mathmark = new AssignmentMarks("Mathmatics", (Integer.parseInt(mathMark1.get(2))), (Integer.parseInt(mathMark2.get(2))), (Integer.parseInt(mathMark3.get(2))));
			student3.setMathMarks(stu3Mathmark);
			stu3engmark = new AssignmentMarks("English", (Integer.parseInt(EnglishMark1.get(2))), (Integer.parseInt(EnglishMark1.get(2))), (Integer.parseInt(EnglishMark1.get(2))));
			student3.setEnglishMark(stu3engmark);

			stu4Mathmark = new AssignmentMarks("Mathmatics", (Integer.parseInt(mathMark1.get(3))), (Integer.parseInt(mathMark2.get(3))), (Integer.parseInt(mathMark3.get(3))));
			student4.setMathMarks(stu4Mathmark);
			stu4engmark = new AssignmentMarks("English", (Integer.parseInt(EnglishMark1.get(3))), (Integer.parseInt(EnglishMark1.get(3))), (Integer.parseInt(EnglishMark1.get(3))));
			student4.setEnglishMark(stu4engmark);
			
			stu5Mathmark = new AssignmentMarks("Mathmatics", (Integer.parseInt(mathMark1.get(4))), (Integer.parseInt(mathMark2.get(4))), (Integer.parseInt(mathMark3.get(4))));
			student5.setMathMarks(stu5Mathmark);
			stu5engmark = new AssignmentMarks("English", (Integer.parseInt(EnglishMark1.get(4))), (Integer.parseInt(EnglishMark1.get(4))), (Integer.parseInt(EnglishMark1.get(4))));
			student5.setEnglishMark(stu5engmark);
			
		    studentlist.add(student1);
		    studentlist.add(student2);
		    studentlist.add(student3);
		    studentlist.add(student4);
		    studentlist.add(student5);
				
		
	}
	
	
		
	public static void main(String[] args) throws IOException  {
	 			
		readFile("C:\\temp\\studentdata.txt");
		displayMenu();		
			
	}
	
	@Override
	public String toString() {
		return "main []";
	}
	static Scanner scanner = new Scanner(System.in);
	public static void displayMenu() {
		
		
		int num;
		do {	
		
		System.out.println("Student Report System");
		System.out.println("---------------------");
		System.out.println("1) Display student marks");
		System.out.println("2) Display Student grades");
		System.out.println("3) Add new student");
		System.out.println("4) Remove Student");
		System.out.println("5) Exit");
		num = scanner.nextInt();

		
		switch (num) {
		
		case 1: {
			
			displayReportByMarks();
			System.out.print("Press any key to continue");
			scanner.next();
			break;
			
		}
		
		case 2: {
			
			displayReportByGrades();
			System.out.print("Press any key to continue");
			scanner.next();
			break;
		}
		case 3: {
			addNewStudent();
				scanner.next();
				System.out.print("Press any key to return to the main menu");
				break;
			}
			
		
		case 4: {
			
			removeStudent();
			break;
		}
		}
		} while (num != 5);
	}
	
	   
	
	private static void displayReportByMarks() {
		
		System.out.println("Name             Maths A1   A2   A3   Average   English A1   A2   A3   Average");
		System.out.println("-------------------------------------------------------------------------------");
		
		for (Student stu : studentlist) {
			System.out.println(stu.getFullName() + stu.getMathMarks() +"     "+ stu.mathMarks.getAverageMark()+"   "+stu.getEnglishMark()+"     "+stu.englishMark.getAverageMark()); 
			}
	    }  
		

		
	  
	
	
	private static void displayReportByGrades() {
		
		System.out.println("Name             Maths Grade   English Grade");
		System.out.println("--------------------------------------------------------------------------");
	               for (Student stu : studentlist)        {
	            	   System.out.println(stu.getFullName() +stu.mathMarks.getGrade(stu.mathMarks.getAverageMark())+"           "+ stu.englishMark.getGrade(stu.englishMark.getAverageMark()));
	            	   
	               }
	    
	}
	
	
	private static void addNewStudent() {
		System.out.println("Please enter the Student ID");
		int id = scanner.nextInt();
		System.out.println("Please enter the Student's Firstname");
		String fname = scanner.next();
		System.out.println("Please enter the Student's Lastname");
		String lname = scanner.next();
		
		System.out.println("Please enter the Student's English A1 Mark");
		int ea1 = scanner.nextInt();
		
		System.out.println("Please enter the Student's English A2 Mark");
		int ea2 = scanner.nextInt();
		
		System.out.println("Please enter the Student's English A3 Mark");
		int ea3 = scanner.nextInt();
		
		System.out.println("Please enter the Student's Math A1 Mark");
		int ma1 = scanner.nextInt();
		
		System.out.println("Please enter the Student's Math A2 Mark");
		int ma2 = scanner.nextInt();
		
		System.out.println("Please enter the Student's Math A3 Mark");
		int ma3 = scanner.nextInt();
		
		
		Student newstudent = new Student(id, fname, lname);
		AssignmentMarks newmarkeng = new AssignmentMarks("English", ea1,ea2,ea3);
		AssignmentMarks newmarkmat = new AssignmentMarks("Math", ma1,ma2,ma3);
		newstudent.setEnglishMark(newmarkeng);
		newstudent.setMathMarks(newmarkmat);
		studentlist.add(newstudent);
			
			
		}
	private static void removeStudent()	{
		System.out.println("Please enter the student ID of the student to be removed");
		int id = scanner.nextInt();
		
		for (Student stu : studentlist) {
			
			if (stu.getId() == id) {
				
				studentlist.remove(stu);
				System.out.println("Student removed");
			}
		
			
		}
		
	
	}
	  
	}
	 
	 
		 
	 
		
	
	
	


	

		
	
