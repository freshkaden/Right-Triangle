import java.util.Scanner;




public class draw {

    public static void main(String[] args){

        char character;
        int height;

        Scanner scanner = new Scanner(System.in);

        // ask user for desired character to use in the drawing
        System.out.println("-----Right Triangle Drawer-----");
        System.out.print("Enter a character: ");

        // read the character provided by user into character variable to draw triangle
        character = scanner.next().charAt(0);

        // ask user for height of desired triangle
        System.out.print("Enter height of triangle: ");
        height = scanner.nextInt();
        System.out.print("-------------------------------\n");


        // draw the triangle using those variables
        for (int i = 1; i <= height; i++){
            for (int k = 1; k <= i; k++){
                System.out.print(character + " ");
            }
            
            System.out.println();
        }

        scanner.close();


    }

}