// Matching a String Against a Regular Expression With matches()
public class String_pr7 {
    public static void main(String[] args)
    {
        //Matches is returns a boolean value
        //regular expression contains (.* )
        String a="Welcome to the java Project";
        System.out.println(a.matches("(.*)Welcome"));
        System.out.println(a.matches("Welcome(.*)"));

        System.out.println(a.matches("Project(.*)"));
        System.out.println(a.matches("(.*)Project(.*)"));
        System.out.println(a.matches("(.*)Project"));


    }
}
