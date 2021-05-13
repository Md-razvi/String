//import javax.swing.plaf.synth.SynthOptionPaneUI;

public class String_pr8 {
    public static void main(String[] args) {

        String name="Max Tennison";
        String nameCopy="max Tennison";
        String nameCopy1="Max Tennison";
        String name1="Ben";
        System.out.println(name.equalsIgnoreCase(nameCopy));// This function ignores cases but minds the content
        System.out.println(name.equalsIgnoreCase(name1));// THe content is different
        System.out.println(name.startsWith("Max"));// Works as the function name suggest
        System.out.println(name.endsWith("on"));// Opposite of the function starts with
        System.out.println(name.compareTo(nameCopy));// Returns negative or positive value if not equal
        System.out.println(name.compareTo(nameCopy1));// Returns zero when totally equal
    
    }
}
