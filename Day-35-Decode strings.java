// 394. Decode String
//TIme Complexity: O(n)
import java.util.*;

class Solution {

    public String decodeString(String s) {

        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();

        String currentString = "";

        int k = 0;

        for(char ch : s.toCharArray()) {

            // build number
            if(Character.isDigit(ch)) {

                k = k * 10 + (ch - '0');
            }

            // opening bracket
            else if(ch == '[') {

                countStack.push(k);
                stringStack.push(currentString);

                k = 0;
                currentString = "";
            }

            // closing bracket
            else if(ch == ']') {

                int repeat = countStack.pop();

                String previousString = stringStack.pop();

                StringBuilder temp = new StringBuilder(previousString);

                for(int i = 0; i < repeat; i++) {

                    temp.append(currentString);
                }

                currentString = temp.toString();
            }

            // normal character
            else {

                currentString += ch;
            }
        }

        return currentString;
    }
}