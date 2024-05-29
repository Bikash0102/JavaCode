import java.util.*;
public class String3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String c = sc.nextLine();

        char k[] = c.toCharArray();
        int l[] = new int[26];

        for (int i = 0; i < k.length; i++) {
            if (Character.isLetter(k[i])) { /
                int index = k[i] - 'a'; 
                l[index]++;
            }
        }

        char maxchar = ' ';
        int maxoccur = 0;
        for (int i = 0; i < l.length; i++) {
            if (l[i] >= maxoccur) {
                maxoccur = l[i];
                maxchar = (char) (i + 'a');
            }
        }

        char lowchar = ' ';
        int lowoccur = Integer.MAX_VALUE;
        for (int i = 0; i < l.length; i++) {
            if (l[i] > 0 && l[i] <= lowoccur) {
                lowoccur = l[i];
                lowchar = (char) (i + 'a');
            }
        }
        System.out.println("Lowest Occurring character: " + lowchar + ", Occurrences: " + lowoccur);
        System.out.println("Highest Occurring character: " + maxchar + ", Occurrences: " + maxoccur);
    }
}

