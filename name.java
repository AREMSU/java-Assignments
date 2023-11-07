public class name{
    public static void main(String[] args) {
        String name="Aarnav";
        System.out.println(name.toLowerCase());//this converts all the letters to lowercase
        System.out.println(name.toUpperCase());//this converts all the letters to uppercase
        System.out.println(name.equals("aarnav"));//this compares the vale of string,here name with the value in bracket, here "aarnav"
        System.out.println(name.equalsIgnoreCase("AaRnAV"));//this works same as equals except it isn't case sensative
        System.out.println(name.charAt(2));//this returns character value as the provided index. if provided value is more than that of the string then it returns error
        System.out.println(name.indexOf("a"));//this returns the index position of the specified character in string
        System.out.println(name.contains("A"));//this returns true if specified charcater is present in string, if not returns false
        System.out.println(name.length());//this returns the length of charcters in string
    }
    }