import java.util.Scanner;
/**
 * A class that emulates the properties of a triangle
 *
 * @author Leandros Dimitropoulos
 * @version v1.0
 * @since 10/19/2025
 */
public class Triangle{
    private String name;
    private double base, height;
    /**
     * Constructs triangle by setting name to Unknown, base to 0, and height to 0
     */
    public Triangle(){
        name = "Unknown";
        base = 0;
        height = 0;
    }
    /**
     * Constructs triangle using custom paramets for name, base, and height
     * @param inName Desired name of triangle
     * @param inBase Desired base of triangle
     * @param inHeight Desired height of triangle
     */
    public Triangle(String inName, double inBase, double inHeight){
        name = inName;
        base = inBase;
        height = inHeight;
    }
    /**
     * Prints out all the properties of the triangle class
     */
    public void writeOutput(){
        System.out.println("Triangle name is: "+name);
        System.out.printf("Triangle base is: %.1f\n",base);
        System.out.printf("Triangle height is: %.1f\n",height);
        System.out.printf("Triangle area is: %.1f\n",getArea());
        System.out.println();
    }
    /**
     * Changes the name property of the triangle
     * @param inName New name of the triangle
     */
    public void setName(String inName){
        name = inName;
    }
    /**
     * Changes the height property of the triangle
     * @param inHeight New height of the triangle
     */
    public void setHeight(double inHeight){
        height = inHeight;
    }
    /**
     * Changes the base property of the triangle
     * @param inBase New base of the triangle
     */
    public void setBase(double inBase){
        base = inBase;    
    }
    /**
     * Returns the area of the triangle using formula b*h/2
     * @return Area of the triangle
     */
    private double getArea(){
        return (base*height)/2.0;
    }
    /**
     * Uses scanner to take user input and change the name, height, and base properties of the triangle
     */
    public void readInput(){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is the triangle's name: ");
        name = keyboard.nextLine();
        System.out.print("What is the triangle's base: ");
        base = keyboard.nextDouble();
        System.out.print("What is the triangle's height: ");
        height = keyboard.nextDouble();
        System.out.println();
    }
}