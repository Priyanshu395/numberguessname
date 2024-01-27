import java.util.Scanner;

 class main {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int generatednum=(int)(Math.random()*100);
        int guessednum;
        do{
            System.out.println("Enter the guessed number ");
            guessednum=sc.nextInt();

            if(guessednum==generatednum){
                System.out.println("yeah!! you are correct ");
                break;
            } else if (guessednum>generatednum) {
                System.out.println("choose a smaller num");
            }
            else {
                System.out.println("choose a greater num ");
            }
        }while(guessednum>0);
        System.out.println("generated number is "+ generatednum);
    }
}