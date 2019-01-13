public class second {

    public static void main (String[] args) {

        //№5
        int []mas5 = {1,2,3,4,5,6,};
        int max=mas5[0];
        for (int i :mas5){
            if (i>max){
                max=i;
            }
        }
        System.out.println(max);
/*
        //№4 не доделано
        int [][] mas4 = new int [4][4];
        for (int i = 0; i <mas4.length; i++) {
            mas4[i][i] = 1;
            int j = mas4[i].length - i ;
            mas4[i][j] = 1;
        for (int i = 0; i <mas4.length ; i++) {
            for (int j = 0; j < mas4[i].length; j++) {
                System.out.print(mas4[i][j]);
            }
            System.out.println(" ");
        }
*/

        //№3
        /*
        int [] mas3 = {1,1,0,0,0,1,1,0,1};
        for (int i: mas3 ){
            if (i == 0){
                i=1;
            }
            else {
                i = 0;
            }
        }*/

        //№1
        /*
        int [] mas2 = {1,5,3,2,11,4,5,2,4,8,9,1};
        for (int i : mas2) {
            if (i < 6) {
                i *= 2;
            }
        }*/

        //№2
        /*
        int [] mas1 = new int [8];
        for (int i = 0; i <mas1.length; i++) {
            mas1[i]= i * 3;
        }*/
    }
    }

