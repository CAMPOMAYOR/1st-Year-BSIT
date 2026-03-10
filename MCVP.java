
import java.util.InputMismatchException;
import java.util.Scanner;

public class MCVP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    
        System.out.println("======================================");
        System.out.println("        MCVP JAVA QUIZ SYSTEM         ");
        System.out.println("======================================");

        int no=0;

        while(true){
            try{
                System.out.println("Enter number of students: ");
                no=sc.nextInt();
                break;

            }catch(InputMismatchException e){
                System.out.println("Invalid input. Please enter numbers only.");
                sc.next();
            }
        }
        
        sc.nextLine();
        
        int[] score = new int[no];
        String[] names = new String[no];

        for(int i=0; i<no; i++){
            System.out.println("Enter name of student "+(i+1)+": ");
            names[i] = sc.nextLine();
        }
        
        String[] Questions = {
            "1. Who invented Java?",
            "2. Java is a ____ language.",
            "3. Which company developed Java?",
            "4. Which keyword creates a class?",
            "5. Entry point of a Java program?",
            "6. Which symbol ends a statement?",
            "7. Data type for whole numbers?",
            "8. Keyword for inheritance?",
            "9. Loop that runs at least once?",
            "10. Keyword to stop a loop?"
        };

        String[][] options = {
            {"A. James Gosling","B. Dennis Ritchie","C. Bjarne Stroustrup","D. Guido van Rossum"},
            {"A. Low-level","B. Object-Oriented","C. Machine","D. Assembly"},
            {"A. Microsoft","B. Apple","C. Sun Microsystems","D. IBM"},
            {"A. define","B. class","C. struct","D. object"},
            {"A. start()","B. main()","C. run()","D. init()"},
            {"A. .","B. :","C. ;","D. ,"},
            {"A. int","B. float","C. char","D. boolean"},
            {"A. implement","B. extends","C. inherits","D. super"},
            {"A. for","B. while","C. do-while","D. foreach"},
            {"A. stop","B. break","C. exit","D. end"}
        };

        char[] Answers = {'A','B','C','B','B','C','A','B','C','B'};

        while(true){
            try{
                for(int i=0;i<Questions.length;i++){
                    System.out.println("\n"+Questions[i]);

                    for(int j=0;j<options[i].length;j++){
                        System.out.println(options[i][j]);
                    }

                    for(int k=1; k<=no; k++){

                        while(true){
                            try{
                                System.out.print("Student "+names[k-1]+": ");
                                char ans = sc.next().toUpperCase().charAt(0);

                                if(ans!='A' && ans!='B' && ans!='C' && ans!='D'){
                                    throw new Exception("Invalid choice! Please enter only A, B, C, or D");
                                }

                                if(ans == Answers[i]){
                                    score[k-1]++;
                                }
                                break;
                            }catch(Exception e){
                                System.out.println(e.getMessage());
                            }
                        }
                    }
                }
                break;
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        
        sc.nextLine();
        
        String[] fillQuestions = new String[] {
            "11. An array is a collection of ____.",
            "12. Java is a ____ -oriented programming language.",
            "13. The property used to get the size of an array is ____.",
            "14. The data structure used to store multiple values of the same type is ____.",
            "15. The position of an element in an array is called its ____.",
            "16. The loop used when number of iterations is known is ____.",
            "17. The keyword used to define a constant is ____.",
            "18. The file extension of Java source code is ____.",
            "19. Java is compiled into ____ code.",
            "20. The company that owns Java today is ____."
        };

        String[] fillAnswers = {
            "elements",
            "object",
            "length",
            "array",
            "index",
            "for",
            "final",
            ".java",
            "byte",
            "oracle"
        };
        
         for(int i=0;i<fillQuestions.length;i++){
            System.out.println("\n"+fillQuestions[i]);
            for(int k=1; k<=no;k++){
            System.out.print("Student "+names[k-1]+": ");
                String ans = sc.nextLine().toLowerCase();
    
                if(ans.equals(fillAnswers[i])){
                    score[k-1]++;
                }
            }
             
        }

        for(int i=0; i<score.length-1; i++){
            for(int j=0; j<score.length-i-1; j++){
                if(score[j] < score[j+1]){
    
                    int tempScore = score[j];
                    score[j] = score[j+1];
                    score[j+1] = tempScore;

                    String tempName = names[j];
                    names[j] = names[j+1];
                    names[j+1] = tempName;
                }
            }
        }

        System.out.println("============ QUIZ RESULT =============");
        for(int i=0;i<score.length;i++){
            double percentage = ((double)score[i] / 20) * 100;
            System.out.printf("Student %s Score: %d/20 Percentage: %.2f%%\n", names[i], score[i], percentage);
        }
    }
}
