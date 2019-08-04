public class Student {
       private int id;
       private String firstname;
       private String lastname;
       AssignmentMarks mathMarks;
       AssignmentMarks englishMark;
       
       public Student(int id, String firstname, String lastname) {
    	   this.id = id;
    	   this.firstname = firstname;           //constructor for the student object
    	   this.lastname = lastname;    	   
    	   
       }
 
       public String getMathMarks() {
		return Integer.toString(mathMarks.getAssignment1()) +"   "+ Integer.toString(mathMarks.getAssignment2())+"   " + Integer.toString(mathMarks.getAssignment3());
		
	}
	public void setMathMarks(AssignmentMarks mathMarks) {
		this.mathMarks = mathMarks;
	}

	public String getEnglishMark() {
		return "           "+ Integer.toString(englishMark.getAssignment1()) +"   "+ Integer.toString(englishMark.getAssignment2())+"   " + Integer.toString(englishMark.getAssignment3());
	}
	public void setEnglishMark(AssignmentMarks englishMark) {
		this.englishMark = englishMark;
	}
      
      
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	} 

	public String getFullName() {
		
		String fullName = firstname + " " + lastname;
		for (int i = fullName.length(); i<=22; i++) {
			fullName +=" ";
		}
		return fullName;
		
	}

	  
	
	


	
		}
		
	

