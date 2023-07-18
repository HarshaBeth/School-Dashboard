import java.util.Scanner;

public class dashboard {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String [] subjects = {"english", "calculus", "programming"};
		
		String [] studEng = null;
		String [] assEng = null;
		Double [][] gradesEng = null;
		
		String [] studCalculus = null;
		String [] assCalculus = null;
		Double [][] gradesCalculus = null;
		
		String [] studProgramming = null;
		String [] assProgramming = null;
		Double [][] gradesProgramming = null;
		
		String login;
		String module;
		String YorN;
		String AYorN;
		String N;
		String exit;
		int moduleID;
		int studentID;
		
		
		int studRegEng = 0;
		int assRegEng = 0;
		int studRegCalc = 0;
		int assRegCalc = 0;
		int studRegProg = 0;
		int assRegProg = 0;

		do {
			System.out.println("Are you a student or a teacher? ");
			login = scan.next();
			
			if (login.equalsIgnoreCase("teacher")) {
				
				System.out.println("Welcome teacher, what module do you teach? (english/calculus/programming)");
				module = scan.next();
				
				System.out.println();
				
				switch (module) {
				case "english":	System.out.println("*** ENGLISH ***");
								
								do {
									System.out.println("Have students been registered? (y/n)");
									YorN = scan.next();
									
									//Allows teacher to register students in English
									if (YorN.equalsIgnoreCase("n")) {
										studRegEng = 0;
										studEng = registrationStud(studEng);
										studRegEng++;	
									}
									
									System.out.println("Have assessments been registered? (y/n)");
									AYorN = scan.next();
									
									//Allows teacher to register assessments in English
									if (AYorN.equalsIgnoreCase("n")) {
										assRegEng = 0;
										assEng = registrationAss(assEng);
										assRegEng++;
									}
									
									//Informs teacher if students or assessments are not registered
									if (studRegEng == 0) {
										System.out.println("Students have not been registered...");
									}
									if (assRegEng == 0) {
										System.out.println("Assessments have not been registered...");
									}
		
									System.out.println("Press 'next' to go to next page. Press any other key to go back to registration.");
									N = scan.next();
									
								} while (!N.equalsIgnoreCase("next"));
								
								//Teacher can enter grades here
								if (assRegEng != 0 && studRegEng != 0 && N.equalsIgnoreCase("next")) {
									System.out.println("*** ENTER GRADES ***");
									System.out.println();
									gradesEng = fill(gradesEng, studEng, assEng);
								}
								else {
									System.out.println("Make sure to register students and assessments first!");
								}
								
								break;
								
				case "calculus":System.out.println("*** CALCULUS ***");
								
								do {
									System.out.println("Have students been registered? (y/n)");
									YorN = scan.next();
									
									//Allows teacher to register students in Calculus
									if (YorN.equalsIgnoreCase("n")) {
										studRegCalc = 0;
										studCalculus = registrationStud(studCalculus);
										studRegCalc++;	
									}
									
									System.out.println("Have assessments been registered? (y/n)");
									AYorN = scan.next();
									
									//Allows teacher to register assessments in Calculus
									if (AYorN.equalsIgnoreCase("n")) {
										assRegCalc = 0;
										assCalculus = registrationAss(assCalculus);
										assRegCalc++;
									}
									
									//Informs teacher if students or assessments are not registered
									if (studRegCalc == 0) {
										System.out.println("Students have not been registered...");
									}
									if (assRegCalc == 0) {
										System.out.println("Assessments have not been registered...");
									}
				
									System.out.println("Press 'next' to go to next page. Press any other key to go back to registration.");
									N = scan.next();
									
								} while (!N.equalsIgnoreCase("next"));
								
								//Teacher can enter grades here
								if (assRegCalc != 0 && studRegCalc != 0 && N.equalsIgnoreCase("next")) {
									System.out.println("*** ENTER GRADES ***");
									System.out.println();
									gradesCalculus = fill(gradesCalculus, studCalculus, assCalculus);
								}
								else {
									System.out.println("Make sure to register students and assessments first!");
								}
								
								break;
								
				case "programming":	System.out.println("*** PROGRAMMING ***");
				
									do {
										System.out.println("Have students been registered? (y/n)");
										YorN = scan.next();
										
										//Allows teacher to register students in Programming
										if (YorN.equalsIgnoreCase("n")) {
											studRegProg = 0;
											studProgramming = registrationStud(studProgramming);
											studRegProg++;	
										}
										
										System.out.println("Have assessments been registered? (y/n)");
										AYorN = scan.next();
										
										//Allows teacher to register assessments in Programming
										if (AYorN.equalsIgnoreCase("n")) {
											assRegProg = 0;
											assProgramming = registrationAss(assProgramming);
											assRegProg++;
										}
										
										//Informs teacher if students or assessments are not registered
										if (studRegProg == 0) {
											System.out.println("Students have not been registered...");
										}
										if (assRegProg == 0) {
											System.out.println("Assessments have not been registered...");
										}
					
										System.out.println("Press 'next' to go to next page. Press any other key to go back to registration.");
										N = scan.next();
										
									} while (!N.equalsIgnoreCase("next"));
									
									//Teacher can enter grades here
									if (assRegProg != 0 && studRegProg != 0 && N.equalsIgnoreCase("next")) {
										System.out.println("*** ENTER GRADES ***");
										System.out.println();
										gradesProgramming = fill(gradesProgramming, studProgramming, assProgramming);
									}
									else {
										System.out.println("Make sure to register students and assessments first!");
									}
									
									break;
									
				default: System.out.println("This module does not exist! ");
						 break;
				}
				
			}
			else if (login.equalsIgnoreCase("student")) {
				
				System.out.println("Enter module ID: ");
				moduleID = scan.nextInt();
				
				System.out.println("Enter student ID: ");
				studentID = scan.nextInt();
				
				if (studEng == null && moduleID == 0) {
					System.out.println("Your teacher hasn't created a list yet!");
				}
				else if (studCalculus == null && moduleID == 1) {
					System.out.println("Your teacher hasn't created a list yet!");
				}
				else if (studProgramming == null && moduleID == 2) {
					System.out.println("Your teacher hasn't created a list yet!");
				}
				//Prints grades for entered student ID and entered module ID
				else if (moduleID == 0 && studEng != null && studentID>=0 && studentID<studEng.length) {	
					print(gradesEng, studEng, assEng, subjects, studentID, moduleID);
				}
				else if (moduleID == 1 && studCalculus != null && studentID>=0 && studentID<studCalculus.length) {
					print(gradesCalculus, studCalculus, assCalculus, subjects, studentID, moduleID);
				}
				else if (moduleID == 2 && studProgramming != null && studentID>=0 && studentID<studProgramming.length) {
					print(gradesProgramming, studProgramming, assProgramming, subjects, studentID, moduleID);
				}
				else if (moduleID != 0 && moduleID != 1 && moduleID != 2) {
					System.out.println("This module ID does not exist!");
					System.out.println();
				}
				else {
					System.out.println("This student ID does not exist!");
				}
				
				
			}
			else {
				System.out.println("NOT AVAILABLE!");
			}
			
			
			do {
				System.out.println("---Press 'E' to exit---");
				exit = scan.next();
			} while (!exit.equalsIgnoreCase("e"));
		
		} while (exit.equalsIgnoreCase("e"));
	}
	
	//Register students (students array)
	public static String [] registrationStud(String [] a) {
		Scanner ab = new Scanner(System.in);
		int nOfStud;
		
		System.out.println("How many students are in this module? ");
		nOfStud = ab.nextInt();
		a = new String [nOfStud];
		
		for (int i=0; i<a.length; i++) {
			System.out.println("Enter name for student " + (i+1) + ": ");
			a [i] = ab.next();
		}
		
		System.out.println("Students added: ");
		for (int i=0; i<a.length; i++) {
			System.out.print("-(" + a[i] + ")");
		}
		System.out.println("-");
		
		System.out.println();
		
		return a;
		
	}

	//Register assessments (assessment array)
	public static String [] registrationAss(String [] b) {
		Scanner bc = new Scanner(System.in);
		int nOfAss;
		
		System.out.println("How many assessments do you want to register? ");
		nOfAss = bc.nextInt();
		b = new String [nOfAss];
		
		for (int i=0; i<b.length; i++) {
			System.out.println("Enter name for assessment " + (i+1) + ": ");
			b[i] = bc.next();
		}
		
		System.out.println("Assessments added: ");
		for (int i=0; i<b.length; i++) {
			System.out.print("-(" + b[i] + ")");
		}
		System.out.println("-");
		
		System.out.println();
		
		return b;
		
	}

	//Enter grades (grades array, students array, assessments array)
	public static Double [][] fill(Double [][] c, String [] d, String [] e) {
		
		Scanner cd = new Scanner(System.in);
		c = new Double [e.length][d.length];
		
		for (int i=0; i<d.length; i++) {
			
			for (int j=0; j<e.length; j++) {
				System.out.println("Enter grade for student " + d[i] + " in assessment " + e[j] + ": ");
				c [j][i] = cd.nextDouble();	
			}
			
		}
		
		System.out.println("Grades added for: ");
		for (int i=0; i<d.length; i++) {
			System.out.print("-(" + d[i] + ")");
		}
		System.out.println("-");
		
		System.out.println();
		
		return c;
	}

	//Prints grades (grades array, students array, assessments array, subjects array, student ID, assessment ID)
	public static void print(Double [][] f, String [] g, String [] h, String [] l, int y, int z) {
		Scanner xy = new Scanner(System.in);
		
		System.out.println("Welcome to " + l [z] + " " + g [y] + "!");
			
		System.out.println();
		
		for (int i=0; i<h.length; i++) {
			System.out.println("You got " + f [i][y] + " in assessment " + h [i]);
		}
		
		System.out.println();
	}

}
