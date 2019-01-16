public class second {



        public static void main(String[] args) {
            //№5
        /*
        int[] mas5 = {1, 2, 3, 4, 5, 6,};
        int max = mas5[0];
        int min = mas5[0];
        for (int i : mas5) {
           if  (i > max){
                    max = i;
        }
            if (i<min){
                min=i;
            }
    }
    */


            //№4
        /*
        int[][] mas4 = new int[4][4];
        int  j;

            for (int i = 0; i <mas4.length; i++) {
            mas4[i][i] = 1;
            j = mas4[i].length - i ;
            mas4[i][j] = 1; // вот эта строка ?
    }

        for (int i = 0; i < mas4.length; i++) {
            for (int l = 0; l < mas4.length; l++) {
                System.out.print(mas4[i][l]);

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
//№6
  private boolean check1 ( int[] mass6){
            int middle = mass6.length % 2;
            int sumleft = 0, sumright = 0;
            middle = (middle > 0) ? (middle /= 2) : ((middle / 2) + 1);
                for (int i = 0; i < mass6.length; i++) {
                    middle = (i < middle) ? (sumleft += mass6[i]) : (sumright += mass6[i]);
                }
            boolean ch = (sumleft == sumright) ? true : false;
            return ch;
                }

}


