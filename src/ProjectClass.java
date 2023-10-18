public class ProjectClass {
    public static void main(String[] args) {

        float myWeightEarthNhlanhla = 60f;
        /*This is the calculation of my weight on Mars by taking 38% of my Earth weight */
        float myWeightMarsNhlanhla  = ( myWeightEarthNhlanhla * 38)/100;
        double myWeightMarsInDouble = myWeightMarsNhlanhla;
        int myWeightMarsInInt = (int) myWeightMarsInDouble;
        char myWeightMarsInChar = (char)myWeightMarsInInt;
        char CharacterResult = (char) (myWeightMarsInInt + 50d);
        int CharacterResultInt = (int) CharacterResult;




        /*This is the outputs meant to be displayed in the console*/
        System.out.printf("%.1f kg on Earth is %2f kg on Mars",myWeightEarthNhlanhla,myWeightMarsNhlanhla);
        System.out.printf("\nKilograms on Mars after I convert it to double is %f",myWeightMarsInDouble);
        System.out.printf("\nKilograms on Mars when displayed to four decimal places is %.4f",myWeightMarsNhlanhla);
        System.out.printf("\nKilograms on Mars when casted to integer is " + myWeightMarsInInt);
        System.out.printf("\nThe ASCII table equivalent of marsWeightInInt is %c",myWeightMarsInChar);
        System.out.printf("\nAn example of a mathematical operation on the char type is "+ CharacterResultInt);









    }
}
