package split_z_dwoma_znakami;

public class Split_two_characters {
    public static String[] split2(String s, char zn, char zn2) {
        int l = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == zn || s.charAt(i) == zn2) {
                l++;
            }
        }

        String[] tStr = new String[l + 1];
        for (int i = 0; i < tStr.length; tStr[i++] = "") ;
        l = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == zn || s.charAt(i) == zn2) {
                l++;
            } else {
                tStr[l] += s.charAt(i);
            }
        }

        return tStr;
    }


    public static void main(String[] args) {
        String lan = "Ala ma kota Kot_ma_Alę";
        // Zastosowanie metody split(" ") zwróci tablicę ciągów:
        //     0 - Ala
        //     1 - ma
        //     2 - kota
        //     3 - Kot_ma_Alę
        String[] tmpTStr = lan.split(" ");
        System.out.println("Wynik działania split(\" \")");
        for (int i = 0; i < tmpTStr.length; i++) {
            System.out.println(tmpTStr[i]);
        }

        // Zastosowanie funkcji split2(' ', '_') zwróci tablicę ciągów:
        //     0 - Ala
        //     1 - ma
        //     2 - kota
        //     3 - Kot
        //     4 - ma
        //     5 - Alę
        String[] tmpTStr2 = split2(lan, ' ', '_');
        System.out.println("Wynik działania split2(\' \', )");
        for (int i = 0; i < tmpTStr2.length; i++) {
            System.out.println(tmpTStr2[i]);
        }


    }
}