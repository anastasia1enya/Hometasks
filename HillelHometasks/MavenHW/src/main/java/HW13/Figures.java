package HW13;

public class Figures {

    String[][] start =
                   {{" "},
                    {" "},
                    {" "},
                    {" "},
                    {" "},
                    {" "},
                    {" "}};


    public String[][] fig(String a) {

        String regex = "\\d+";

        if (a.matches(regex)) {

            char[] c = a.toCharArray();

            for (int i = 0; i < c.length; i++) {
                if (c[i] == '0') {

                    String[][] array =
                            {{" @ @ @ @ "},
                                    {" @     @ "},
                                    {" @     @ "},
                                    {" @     @ "},
                                    {" @     @ "},
                                    {" @     @ "},
                                    {" @ @ @ @ "}};

                    for (int j = 0; j < start.length; j++) {
                        for (int k = 0; k < start[0].length; k++) {
                            start[j][k] += array[j][k];

                        }
                    }
                }
                if (c[i] == '1') {

                    String[][] array =
                            {{"       @ "},
                                    {"    @  @ "},
                                    {" @     @ "},
                                    {"       @ "},
                                    {"       @ "},
                                    {"       @ "},
                                    {"       @ "}};

                    for (int j = 0; j < start.length; j++) {
                        for (int k = 0; k < start[0].length; k++) {
                            start[j][k] += array[j][k];

                        }
                    }
                }
                if (c[i] == '2') {

                    String[][] array =
                            {{" @ @ @ @ "},
                                    {" @     @ "},
                                    {" @     @ "},
                                    {"     @   "},
                                    {"   @     "},
                                    {" @     @ "},
                                    {" @ @ @ @ "}};

                    for (int j = 0; j < start.length; j++) {
                        for (int k = 0; k < start[0].length; k++) {
                            start[j][k] += array[j][k];

                        }
                    }
                }

                if (c[i] == '3') {

                    String[][] array =
                            {{" @ @ @ @ "},
                                    {" @     @ "},
                                    {"     @   "},
                                    {"   @     "},
                                    {"     @   "},
                                    {" @     @ "},
                                    {" @ @ @ @ "}};

                    for (int j = 0; j < start.length; j++) {
                        for (int k = 0; k < start[0].length; k++) {
                            start[j][k] += array[j][k];

                        }
                    }
                }

                if (c[i] == '4') {

                    String[][] array =
                                   {{"       @ "},
                                    {"     @ @ "},
                                    {"   @   @ "},
                                    {" @ @ @ @ "},
                                    {"       @ "},
                                    {"       @ "},
                                    {"       @ "}};

                    for (int j = 0; j < start.length; j++) {
                        for (int k = 0; k < start[0].length; k++) {
                            start[j][k] += array[j][k];

                        }
                    }
                }

                if (c[i] == '5') {

                    String[][] array =
                            {{" @ @ @ @ "},
                                    {" @       "},
                                    {" @ @ @   "},
                                    {"       @ "},
                                    {" @     @ "},
                                    {" @     @ "},
                                    {" @ @ @ @ "}};


                    for (int j = 0; j < start.length; j++) {
                        for (int k = 0; k < start[0].length; k++) {
                            start[j][k] += array[j][k];

                        }
                    }
                }
                if (c[i] == '6') {

                    String[][] array =
                                   {{" @ @ @ @ "},
                                    {" @       "},
                                    {" @       "},
                                    {" @ @ @ @ "},
                                    {" @     @ "},
                                    {" @     @ "},
                                    {" @ @ @ @ "}};


                    for (int j = 0; j < start.length; j++) {
                        for (int k = 0; k < start[0].length; k++) {
                            start[j][k] += array[j][k];

                        }
                    }
                }

                if (c[i] == '7') {

                    String[][] array =
                            {{" @ @ @ @ "},
                                    {" @     @ "},
                                    {"       @ "},
                                    {"       @ "},
                                    {"       @ "},
                                    {"       @ "},
                                    {"       @ "}};

                    for (int j = 0; j < start.length; j++) {
                        for (int k = 0; k < start[0].length; k++) {
                            start[j][k] += array[j][k];

                        }
                    }
                }
                if (c[i] == '8') {

                    String[][] array =
                            {{" @ @ @ @ "},
                                    {" @     @ "},
                                    {" @     @ "},
                                    {" @ @ @ @ "},
                                    {" @     @ "},
                                    {" @     @ "},
                                    {" @ @ @ @ "}};

                    for (int j = 0; j < start.length; j++) {
                        for (int k = 0; k < start[0].length; k++) {
                            start[j][k] += array[j][k];

                        }
                    }
                }

                if (c[i] == '9') {

                    String[][] array =
                            {{" @ @ @ @ "},
                                    {" @     @ "},
                                    {" @     @ "},
                                    {" @ @ @ @ "},
                                    {"       @ "},
                                    {" @     @ "},
                                    {" @ @ @ @ "}};

                    for (int j = 0; j < start.length; j++) {
                        for (int k = 0; k < start[0].length; k++) {
                            start[j][k] += array[j][k];

                        }
                    }
                }
            }

            return start;
        } else {
            System.out.println("Wrong, only numbers");
            return null;
        }
        }



        void print () {
            for (int j = 0; j < start.length; j++) {
                for (int k = 0; k < start[0].length; k++) {
                    System.out.print(start[j][k]);
                }
                System.out.println();
            }
        }

    }
