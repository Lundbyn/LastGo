import hjelpeklasser.BinTre;

public class Main {
    public static void main(String[] args) {

        int[] posisjon = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,17,18,19,21,23,26,27,29};
        Character[] verdi = {'A','B','C','D','E','F','G','H','I','J','K',
                'L','M','N','O','P','Q','R','S','T','U','V'};

        int[] aPos = {1,2,3,5,6,7,10,11,12,13,21,24,25,42,43};
        Character[] aVerdi = {'D','I','H','L','O','B','A','E','N','G','K','M','J','F','C'};

        BinTre<Character> tre1 = new BinTre<>(aPos, aVerdi);
        System.out.println(tre1.fjern(25));

        int[] bPos = {1,2,3,4,5,6,7,10,11,13,14,22,23,28,29};
        char[] bVerdi = "EIBGAHKLODNMCJF".toCharArray();

        BinTre<Character> tre2 = new BinTre<>();
        for(int i = 0; i < bPos.length; i++) {
            tre2.leggInn(bPos[i], bVerdi[i]);
        }


        BinTre<Integer> perfektTre = new BinTre<>();
        for(int i = 1; i <= 15; i++) {
            perfektTre.leggInn(i,i);
        }

        BinTre<Integer> venstreTre = new BinTre<>();
        int n = 1;
        for(int i = 1; i <= 15; i++) {
            venstreTre.leggInn(n, i);
            n = n*2;
        }


        int[] vPos = {1,2,3,4,7,8,15,16,31,32,63,64,127,128,255};
        Integer[] vVerdi = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        BinTre<Integer> vTre = new BinTre<>(vPos, vVerdi);



    }
}
