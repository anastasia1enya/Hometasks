public class Figures {

    Figures(int a) {

    }

    char[] print(int a) {
        String b = String.valueOf(a);
        char[] c = b.toCharArray();

        for (int i = 0; i < c.length; i++) {

            if (c[i] == 1) {
                String[][] array =
                               {{"   1"},
                                {" 1 1"},
                                {"1  1"},
                                {"   1"},
                                {"   1"},
                                {"   1"}};
            }

            if (c[i] == 2) {
                String[][] array =
                               {{"  2 2 "},
                                {"2    2"},
                                {"   2  "},
                                {" 2    "},
                                {"2     "},
                                {"2 2 2 "}};
            }

            if (c[i] == 3) {
                String[][] array =
                                {{"  3 3  "},
                                 {"3     3"},
                                 {"   3   "},
                                 {"      3"},
                                 {"3     3"},
                                 {"  3 3  "}};
            }

            if (c[i] == 4) {
                String[][] array =
                               {{"4     4"},
                                {"4     4"},
                                {"4 4 4 4"},
                                {"      4"},
                                {"      4"},
                                {"      4"}};
            }


            switch (c[i]){
                case 1:
            }
        }


        return null;
    }

}
