import java.lang.reflect.Array;
import java.util.Arrays;

public class Figures {

    Character[][] array;
    Character[] [] prev;
   private int count =0;

   Figures(){
       //array = new Character[4][7];
   }

    public Character [][] fig (int a) {
        String b = String.valueOf(a);
        char[] c = b.toCharArray();


        for (int i = 0; i < c.length; i++) {
            System.out.println(i);
            if (c[i]=='0') {

                Character[][] array1 =
                               {{'@', '@', '@', '@'},
                                {'@', ' ', ' ', '@'},
                                {'@', ' ', ' ', '@'},
                                {'@', ' ', ' ', '@'},
                                {'@', ' ', ' ', '@'},
                                {'@', ' ', ' ', '@'},
                                {'@', '@', '@', '@'}};


                    Character[][] array = (Character[][]) Array.newInstance(array1.getClass().getComponentType(), prev.length + array1.length);
                    System.arraycopy(array1, 0, array, 0, prev.length);
                    System.arraycopy(array1, 0, array, array1.length, array1.length);
                    prev = array;

                count++;
            }


            if (c[i]=='1'){
                System.out.println(c[i]);
                Character[][]  array1 =
                                {{' ', ' ', ' ', '@'},
                                 {' ', ' ', '@', '@'},
                                 {' ', '@', ' ', '@'},
                                 {'@', ' ', ' ', '@'},
                                 {' ', ' ', ' ', '@'},
                                 {' ', ' ', ' ', '@'},
                                 {' ', ' ', ' ', '@'}};

                if (count==0){
                    prev = array1;
                    array = prev;
                    count++;
                } else {

                Character[][] array = (Character[][]) Array.newInstance(array1.getClass().getComponentType(), prev.length + array1.length);
                System.arraycopy(array1, 0, array, 0, prev.length);
                System.arraycopy(array1, 0, array, array1.length, array1.length);

                prev = array;
                count++;}
            }

            if (c[i]=='2'){
                System.out.println(c[i]);
                Character[][]  array1 =
                                {{' ','@','@',' '},
                                {'@',' ',' ','@'},
                                {' ',' ','@',' '},
                                {' ','@',' ',' '},
                                {'@',' ',' ',' '},
                                {'@',' ',' ',' '},
                                {'@','@','@','@'}};
                if (count==0){
                    prev = array1;
                    count++;

                } else {

                    Character[][] arrayNew = (Character[][]) Array.newInstance(array1.getClass().getComponentType(), prev.length + array1.length);
                    System.arraycopy(array1, 0, arrayNew, 0, prev.length);
                    System.arraycopy(array1, 0, arrayNew, array1.length, array1.length);

                    //  array=arrayNew;

                count++;}


            }
            if (c[i]=='3'){

                Character[][]  array1 =
                               {{' ','@','@',' '},
                                {'@',' ',' ','@'},
                                {' ',' ','@',' '},
                                {' ','@',' ',' '},
                                {' ',' ','@',' '},
                                {'@',' ',' ','@'},
                                {' ','@','@',' '}};
                if (count==0){
                    prev = array1;
                    array = prev;
                    count++;

                }

                Character[][] arrayNew = (Character[][]) Array.newInstance(array1.getClass().getComponentType(), prev.length + array1.length);
                System.arraycopy(array1, 0, arrayNew, 0, prev.length);
                System.arraycopy(array1, 0, arrayNew, array1.length, array1.length);

                array=arrayNew;
                count++;


            }
            if (c[i]=='4'){

                Character[][]  array1 =
                               {{' ',' ',' ','@'},
                                {' ',' ','@','@'},
                                {' ','@',' ','@'},
                                {'@','@','@','@'},
                                {' ',' ',' ','@'},
                                {' ',' ',' ','@'},
                                {' ',' ',' ','@'}};
                if (count==0){
                    prev = array1;
                    array = prev;
                    count++;

                }

                Character[][] arrayNew = (Character[][]) Array.newInstance(array1.getClass().getComponentType(), prev.length + array1.length);
                System.arraycopy(array1, 0, arrayNew, 0, prev.length);
                System.arraycopy(array1, 0, arrayNew, array1.length, array1.length);

                array=arrayNew;
                count++;

            }
            if (c[i]=='5'){

                Character[][]  array1 =
                               {{'@','@','@','@'},
                                {'@',' ',' ',' '},
                                {'@','@',' ',' '},
                                {' ',' ','@',' '},
                                {' ',' ',' ','@'},
                                {' ',' ','@',' '},
                                {'@','@',' ',' '}};
                if (count==0){
                    prev = array1;
                    array = prev;
                    count++;

                }

                Character[][] arrayNew = (Character[][]) Array.newInstance(array1.getClass().getComponentType(), prev.length + array1.length);
                System.arraycopy(array1, 0, arrayNew, 0, prev.length);
                System.arraycopy(array1, 0, arrayNew, array1.length, array1.length);

                array=arrayNew;
                count++;

            }
            if (c[i]=='6'){

                Character[][]  array1 =
                               {{' ','@','@',' '},
                                {'@',' ',' ','@'},
                                {'@',' ',' ',' '},
                                {'@','@','@',' '},
                                {'@',' ',' ','@'},
                                {'@',' ',' ','@'},
                                {' ','@','@',' '}};
                if (count==0){
                    prev = array1;
                    array = prev;
                    count++;
                }

                Character[][] arrayNew = (Character[][]) Array.newInstance(array1.getClass().getComponentType(), prev.length + array1.length);
                System.arraycopy(array1, 0, arrayNew, 0, prev.length);
                System.arraycopy(array1, 0, arrayNew, array1.length, array1.length);

                array=arrayNew;
                count++;

            }

             if (c[i]=='7'){

                Character[][]  array1 =
                               {{'@','@','@','@'},
                                {' ',' ',' ','@'},
                                {' ',' ','@',' '},
                                {' ','@',' ',' '},
                                {'@',' ',' ',' '},
                                {'@',' ',' ',' '},
                                {'@',' ',' ',' '}};
                if (count==0){
                    prev = array1;
                    array = prev;
                    count++;
                }

                Character[][] arrayNew = (Character[][]) Array.newInstance(array1.getClass().getComponentType(), prev.length + array1.length);
                System.arraycopy(array1, 0, arrayNew, 0, prev.length);
                System.arraycopy(array1, 0, arrayNew, array1.length, array1.length);

                array=arrayNew;
                count++;

            }

            if (c[i]=='8'){
                Character[][]  array1   =
                               {{'@', '@', '@', '@'},
                                {'@', ' ', ' ', '@'},
                                {'@', ' ', ' ', '@'},
                                {'@', '@', '@', '@'},
                                {'@', ' ', ' ', '@'},
                                {'@', ' ', ' ', '@'},
                                {'@', '@', '@', '@'}};

                if (count==0){
                    prev = array1;
                    array = prev;
                    count++;
                }

                Character[][] arrayNew = (Character[][]) Array.newInstance(array1.getClass().getComponentType(), prev.length + array1.length);
                System.arraycopy(array1, 0, arrayNew, 0, prev.length);
                System.arraycopy(array1, 0, arrayNew, array1.length, array1.length);

                array=arrayNew;
                count++;

            }

            if (c[i]=='9'){
                Character[][]  array1   =
                               {{'@', '@', '@', '@'},
                                {'@', ' ', ' ', '@'},
                                {'@', ' ', ' ', '@'},
                                {'@', '@', '@', '@'},
                                {' ', ' ', ' ', '@'},
                                {' ', ' ', ' ', '@'},
                                {'@', '@', '@', '@'}};

                if (count==0){
                    prev = array1;
                    array = prev;
                    count++;
                }

                Character[][] arrayNew = (Character[][]) Array.newInstance(array1.getClass().getComponentType(), prev.length + array1.length);
                System.arraycopy(array1, 0, arrayNew, 0, prev.length);
                System.arraycopy(array1, 0, arrayNew, array1.length, array1.length);

                array=arrayNew;
                count++;

            }

        }

return array;
    }

    void print() {
        for (int j = 0; j < array.length; j++) {
            for (int k = 0; k < array[0].length; k++) {
                System.out.print(array[j][k]);
            }
            System.out.println();
        }
    }
}
