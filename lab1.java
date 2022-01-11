public class lab1 {
    public static void main(String[] args)
    {
        System.out.print("Hello, I am Ryan!");
        System.out.println();

        System.out.println();
        System.out.println("Printing of complete module title");

        String modulecode ="CSC1009";
        System.out.print("Input:    "+modulecode);
        System.out.print("\nOutput: ");

        switch(modulecode.toUpperCase())
        {
            case "CSC1006":
                System.out.println("Mathematics 2");
                break;
            case "CSC1007":
                System.out.println("Operating System");
                break;
            case "CSC1008":
                System.out.println("Data Structures and Algorithms");
                break;
            case "CSC1009":
                System.out.println("Object-Oriented Programming");
                break;
            default:
                System.out.println("Unknown Module Code!");
                break;
        }

        System.out.println();
        System.out.println("Printing of odd number from 102 to 66");
        System.out.print("Value of x: \n");

        for(int x = 102; x >= 66; x--)
        {
            if(x%2 != 0)
            {
                System.out.print(x);
                System.out.print("\n");
            }
        }
    }
}
