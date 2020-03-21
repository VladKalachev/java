/**
 * 
 * Java Core
 * 
 * Class Hello World
 */
class Main {
    public static void main(String[] args) {
        String name = "Vlad";
        int age = 1;
        System.out.println("Hello World");
        System.out.println("Hello " + name + " age " + age);

        // Basic types data Java
        String str = "Vlad";
        String t = new String("Vlad");
        if(str.equals(t)) System.out.println("equals");
        if(str == t) System.out.println("equals 2");
    }
}