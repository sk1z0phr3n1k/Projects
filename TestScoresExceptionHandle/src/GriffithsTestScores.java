/**
 * 
 * @author Mark Griffiths
 * Date: 11/17/2019
 * Class: CSC 151
 * Purpose: To enter a set of test scores and handle exceptions if number exceeds amount, and if scores are out of range
 */
public class GriffithsTestScores {
	
	String name;
	int numScores;
	double testScores[];
	
	public GriffithsTestScores() {
		this.name = "Student";
		this.numScores = 0;
	}
	
	public GriffithsTestScores(String name, int numScores, double testScores[]) {
		this.name = name;
		this.numScores = numScores;
		this.testScores[numScores] = testScores[numScores];
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setNumScores(int numScores) {
		this.numScores = numScores;
	}
	
	public void setTestScores(double [] testScores) {
		this.testScores = new double[numScores];
		for(int i = 0; i < numScores; i ++) {
			this.testScores[i] = testScores[i];
		}
	}
	
	public String getName() {
		return name;
	}
	
	public int getNumScores() {
		return numScores;
	}
	
	public double calcAverage() {
		double total = 0;
		for(int i = 0; i < numScores; i ++) {
			 total += testScores[i];
			}
		return total / numScores;
	}
	
	public char determineLetter() {
		char letter;
		if(calcAverage() < 60) {
			letter = 'F';
			}
		else if(calcAverage() < 70) {
			letter = 'D';
			}
		else if(calcAverage() < 80) {
			letter = 'C';
			}
		else if(calcAverage() < 90) {
			letter = 'B';
			}
		else
			letter = 'A';
		
		return letter;
	}
	
	public String toString() {
		String str = "";
		str += "Student Name: " + this.name + "\n";
		str += "Average: " + String.format("%.2f", this.calcAverage()) + "\n";
		str += "Letter Grade: " + this.determineLetter() + "\n";
		return str; 
	}
}
