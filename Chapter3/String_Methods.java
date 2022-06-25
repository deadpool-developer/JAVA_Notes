package Chapter3;

// METHODS WE HAVE LEARNED

/*
1. name.length() --> returns the length of the string
2. name.toLowerCase() --> returns the new string in lower case 
3. name.toUpperCase() --> returns the new string in the upper case
4. trimming.trim() --> trims the extra spaces from the string and returns the new string
5. name.substring() --> returns the substring of the string 
6. name.replace() --> returns the new string by replacing the old string or keyword with the new keyword or string
7. name.startsWith() --> returns true if the string starts with the paramtered string else false
8. name.endsWith() --> return true if the string ends with the paramtered string else false
9. name.charAt() --> returns the character at the particular index given in the function
10. name.indexOf() --> returns the first index of the element in the string and also it takes fromIndex param to check the occurence of the element from the specific poistion
11. name.lastIndexOf() --> returns the last index of the element in the string and also it takes fromIndex param to check the occurence of the element from the specific position
12. name.equals() --> checks the string if the entered string in the param is equal to the string or not, returns true / false
13. name.equalsIgnoreCases() --> This ignores the cases of the param string and the main string and return true or false

*/

public class String_Methods {
    public static void main(String[] args) {
        String name = "Aditya";
        String trimming = "      Aditya Saini is the best";

        // A D I T Y A
        // 0 1 2 3 4 5 --> indexing of the elements in the array

        //STRING METHODS

        // 1. name.length() --> returns the length of the string

        System.out.println(name.length());

        // 2. name.toLowerCase() --> Gives a new string with all lowercase letters
        System.out.println(name.toLowerCase());

        // 3. name.toUpperCase() --> Gives a new string with all uppercase letters

        System.out.println(name.toUpperCase());

        // 4. name.trim() --> Returns a new string after removing all the leading and trailing spaces from the original string
        System.out.println(trimming);  // --> spaces will be there
        System.out.println(trimming.trim()); // --> removes the spaces

        // 5. name.substring(int start) --> Returns a substring from start to the end .
        System.out.println(name.substring(3));  //--> return tya

        // 6. name.substring(int start,int end) --> Returns a substring from start index to the end index. Start index is included and end is excluded
        System.out.println(name.substring(2, 5));  // --> returns ity

        // 7. name.replace('d','D') --> Returns a new string after replacong d with D. ADitya is returned --> this replace all the d character from the string to D
        System.out.println(name.replace('d', 'D'));
        System.out.println(name.replace("a", "Ad")); //--> this also replace the substring --> it replaces all the substring occurence from the original string

        // 8. name.startsWith("string") --> Returns true if name starts with string "Ad" -> true in this case
        System.out.println(name.startsWith("Ad"));

        // 9. name.endsWith("string") --> returns true if name ends with the string "ya" --> true in this case
        System.out.println(name.endsWith("ya"));

        // 10. name.charAt(index) --> returns the character at the given index position 
        System.out.println(name.charAt(3));

        // 11. name.indexOf("string") --> Returns the index of the given string --> eg. name.indexOf("di") return 1 which is the first occurence of di in string "Aditya", -1 otherwise
        System.out.println(name.indexOf("di"));

        // 12. name.indexOf("char/string",index) --> returns the index of the given string starting from the index 3, 5 is returned in this case
        System.out.println(name.indexOf('a', 3));

        // 13. name.lastIndexOf("string") --> returns the last index of the given string
        System.out.println(name.lastIndexOf('t'));
        System.out.println(name.lastIndexOf('t', 2));

        // 14. name.equals("Aditya") --> returns true if the given string is equal to "Aditya" false otherwise [case sensitive]
        System.out.println(name.equals("Aditya")); // --> Always check the string with the equals method of the java and do not use comparison operator

        // 15. name.equalIgnoreCase("string") --> this ignores the cases of the given string and match the values without considering the cases
        System.out.println(name.equalsIgnoreCase("aditya"));


        //ESCAPES SEQUENCE CHARACTER

        // 1. \n  ---> gives next line
        System.out.println("Hello I am \\n character \nand i make content to print in next line");

        // 2. \t --> gives a tab space or 4 spaces
        System.out.println("hello \t Aditya");

        // 3. \'
        System.out.println("If we want to enter the double quote in the string we do \" hello ");

        // 4. \\ --> backslash
    }
}
