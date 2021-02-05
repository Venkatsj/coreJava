import org.w3c.dom.Node;

public class StringIndex {
    public static void main(String[] args){
        String st = "Hellow World";
        String input1 = st.toLowerCase();
        String input = "";
        int length = input1.length();
        for(int i = 0; i < length; i++){
            if(!input.contains(String.valueOf(input1.charAt(i))))
                input +=String.valueOf(input1.charAt(i));
        }
        char[] chars = input.toCharArray();
        StringBuilder output = new StringBuilder();
        for(int i = 0; i < input.length(); i++){
            output.append(chars[i]+"=[");
            for(int j= 0; j<length;){
                int index = findIndex(input1.substring(j, length-1),chars[i]);
                if(index >=0)
                    output.append(index+j+",");
                else
                    break;

                j=j+index+1;
            }
            output.append("], ");
        }
        System.out.println(output.toString());
    }

    public static int findIndex(String subString, char temp){
        if(subString.indexOf(temp) != -1)
            return subString.indexOf(temp);
        else
            return -1;
    }
}
