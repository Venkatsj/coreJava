import java.util.Scanner;

public class StringIndexesByWord {

    public static void findIndexes(){

        System.out.println("Enter String :");
        Scanner sc = new Scanner(System.in);

        String searchableString = sc.next();
        String keyword = "be";
        String uniq = new String();
        for(char ch:searchableString.toCharArray()){
            if(!uniq.contains(String.valueOf(ch)))
                uniq += ch;
        }


        for(char ch:uniq.toCharArray()) {
            int index = searchableString.indexOf(ch);
            System.out.print("\n"+ch+" - ");
            while (index >= 0) {
                System.out.print( " "+ index);
                index = searchableString.indexOf(ch, index + 1);
            }
        }
    }

    public static void main(String[] args) {
        findIndexes();
    }
}
