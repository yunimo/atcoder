import java.util.Scanner;

public class ABC349C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        String T = scanner.next();

        char[] s = new char[S.length()];

        for (int i = 0; i < S.length(); i++){
            s[i] = S.charAt(i);
        }

        char[] t = new char[3];

        for (int i = 0; i < 3; i++){
            t[i] = T.charAt(i);
        }

        boolean rslt = false;

        char t0 = Character.toLowerCase(t[0]);
        char t1 = Character.toLowerCase(t[1]);
        char t2 = Character.toLowerCase(t[2]);

        if (t2 == 'x'){
            for (int i = 0; i < S.length(); i++){
                if (t0 == s[i]){
                    for (int j = i + 1; j < S.length(); j++){
                        if (t1 == s[j]){
                            rslt = true;
                            break;
                        }
                    }
                }
                if (rslt){
                    break;
                }
            }
        } else {
            for (int i = 0; i < S.length(); i++){
                if (t0 == s[i]){
                    for (int j = i + 1; j < S.length(); j++){
                        if (t1 == s[j]){
                            for (int k = j + 1; k < S.length(); k++){
                                if (t2 == s[k]){
                                    rslt = true;
                                    break;
                                }                                
                            }
                        }
                        if (rslt){
                            break;
                        }
                    }
                }
                if (rslt){
                    break;
                }
            }
        }
        if (rslt) System.out.println("Yes");
        else System.out.println("No");
    }    
}
