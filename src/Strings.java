public class Strings {
    public static void main(String[] args){
        String name = "John Doe";
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.charAt(0));
        System.out.println(name.indexOf('o'));
        System.out.println(name.substring(0, 4));
        // name.compareTo(name2); to compare 2 strings

        StringBuilder sb = new StringBuilder("Hello World!");
        System.out.println(sb);

        sb.insert(0, "h");
        sb.delete(1, 2);
        sb.append(" Raj");

        System.out.println(sb);


    }    
}
