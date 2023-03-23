public class Main {
    public static void main(String[] args) {

    // method - a block of code that is executed whenever it is called upon
    // we have begun all of our programs with the "main" method -  ' public static void main(String[] args) {} '
    // any code within the brackets will be performed when method is called

        String name = "Bro";
         // hello(); here we call this method, which prints "Hello"

        hello(name); // here you are sending a string through to your method
                     // the variables and such you send are known as arguments | method needs parameters to do this


         }

    static void hello(String name) { // we precede our new method with static, as we are calling it using our main method (which is public)
        System.out.println("Hello "+name);

    }
}



// setting up parameter for a method :

// static void hello(String name) // arguments and params. match // param is the data type you use bruh
// you can change "name" within method to another string and it will still work | 'title' for example

//passing through more than one argument to a method

// int age = 21; => static void hello(String name, int age) { | hello(name,age)
// then print age, params now match arguments


