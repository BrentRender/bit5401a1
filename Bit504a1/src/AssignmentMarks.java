

public class AssignmentMarks {
	


	private String coursename;
	private int assignment1;
	private int assignment2;
	private int assignment3;
	
	AssignmentMarks(String coursename, int assignment1, int assignment2, int assignment3){
		this.coursename = coursename;
		this.assignment1 = assignment1;
		this.assignment2 = assignment2;
		this.assignment3 = assignment3; 
	}
		
	
	public String getCoursename() {
		return coursename;
	}



	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}



	public int getAssignment1() {
		return assignment1;
	}



	public void setAssignment1(int assignment1) {
		this.assignment1 = assignment1;
	}



	public int getAssignment2() {
		return assignment2;
	}



	public void setAssignment2(int assignment2) {
		this.assignment2 = assignment2;
	}



	public int getAssignment3() {
		return assignment3;
	}



	public void setAssignment3(int assignment3) {
		this.assignment3 = assignment3;
	}
    
   
	public String getMark(int assignmentNumber) {
		
		return "      " + assignment1 + " " + assignment2 + " " + assignment3;
	}
	
	public int getAverageMark() {
		int total = assignment1 + assignment2 + assignment3;
		return total / 3;
	}
    
	public String getGrade(int assignmentNumber) {
		
		if (assignmentNumber >= 95) {
				return "A+"; 
		}
		if (assignmentNumber >= 90 && assignmentNumber <= 94) {
			return "A ";
		}
		if (assignmentNumber >= 85 && assignmentNumber <= 89) {
			return "A-";
		}
		if (assignmentNumber >= 80 && assignmentNumber <= 84 ) {
			return "B+";
		}
		if (assignmentNumber >= 75 && assignmentNumber <= 79) {
			return "B ";
		}
		if (assignmentNumber >= 70 && assignmentNumber <= 74 ) {
			return "B-";
		}
		if (assignmentNumber >= 60 && assignmentNumber <= 69) {
			return "C+";
		}
		if (assignmentNumber >= 50 && assignmentNumber <= 59) {
			return "C ";
		}
		if (assignmentNumber >= 40 && assignmentNumber <= 49) {
			return "C-";
		}
		if (assignmentNumber >=0 && assignmentNumber <= 49) {
			return "D ";
		}
		else return "Student not Found";
	}
	}
