package calc;
import java.util.Scanner;
public class calc {

	public static void main(String[] args) {
		// cal BONUS try hard!

		
		
		Scanner in = new Scanner(System.in);
		
		int int1, int2;
		int operation;
		String answerShortcut =" selected\n " + " your" + " equation" + " is";
		String questionShortcut = "If " +  " so!\n" +  "                          Type" + " the" + " number:";
		
		
		System.out.println("  	                    -CALCU PRO- 	     \n	");
		System.out.println("                      Enter any integer below: "); 
		int1 = in.nextInt();
		System.out.println("                    Enter another integer below: ");
		int2 = in.nextInt();
		System.out.println("	               WHAT DO YOU REQUIRE?			\n \n"
				+ "			  Addition? "  + questionShortcut +  " 1\n\n"
				+ "			  Subtraction? " + questionShortcut + " 2\n\n"
				+ "			  Multipilcation? " + questionShortcut + " 3\n\n"
				+ "                          Division? "  + questionShortcut +  " 4\n\n");
		System.out.println("            "
				+ "            PRINT YOUR OPTION BELOW");
		operation = in.nextInt();
		
		switch (operation){
		case 1:
			System.out.println("                       1 means addition" + answerShortcut + ":           " + int1 + " + " + int2 + "\n                      That would equal= " + (int1 + int2 ));
			break;
		case 2:
			System.out.println("                     2 means subtraction" +answerShortcut + ":          " + int1 + " - "+ int2 +"\n                      That would equal= " + (int1 - int2));
			break;
		case 3:
			System.out.println("                     3 means multiplication" +answerShortcut + " :          " + int1 + " * " + int2 + "\n                  That would equal= " + (int1 * int2));
			break;
		case 4:
			System.out.println("                      4 means division" + answerShortcut + " (if possible):  " + int1 + " / " + int2 + "\n                 That would equal = " + (int1 / int2));
			break;
		
		}
		 
		System.out.println();
		
		
		
		
	}

}
