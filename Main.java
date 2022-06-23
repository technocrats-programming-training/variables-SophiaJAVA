public class Main {
  
    public static void main(String[] args) {
        // DO NOT CHANGE 
        String firstName = args[0];
        String lastName = args[1];
        int age = 0;
        try {
            age = Integer.parseInt(args[2]);
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }
        //System.out.println("hello world");
        // In this print statement you can use the variables named firstName, lastName and age. To join strings together, you can use the + sign, like "Hello, I am " + firstName + " " + lastName ... (java Main.java _____ _____ ___)
      
      // Print out the following string: "Hello, I am <firstName> <lastName>, and I am <age> years old"
      System.out.println("Hello, I am "+ firstName + " " + lastName + ", I am " + age + " years old");
      
        // you are going to need another + after lastName, and age should not be in quotes because it is a variable, not a string literal

      
        // Print out whether age is even
      System.out.println(age %2 == 0);
      
        // Print out whether firstName equals lastName
      System.out.println(firstName == lastName);
      
        // Print out whether age is greater than 0
        System.out.println(age > 0);
      
    }
}
