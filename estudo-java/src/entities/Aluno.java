package entities;

public class Aluno {
	public double first, second, third;
	public String name;
	
	public double finalGrade() {
		return (first + second + third) / 3;
	}
	public String itsApproved() {
		if (finalGrade() >= 60) {
			return "PASS";
		}
		else {
			return "FAILED"
			+ " "
			+ "MISSING "
			+ (60 - finalGrade())
			+ " Points";
		}
	
	}

}
