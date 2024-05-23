import java.util.Scanner;

public class RRRR {



    public static void main(String[] Name) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("input:");

        String UserChat = scanner.nextLine();

        String result = String.valueOf(main2(UserChat));


        if (result.length() > 40) {
            result = result.substring(0, 40) + "...";
            System.out.println("Output:");
            System.out.println("\"" + result + "\"");
        }else {
            System.out.println("Output:");
            System.out.println("\"" + result + "\"");
        }
    }

    public static String main2(String UserChat) {

        String Res;

        String[] Box = UserChat.split(" ");

            if (!Box[0].equals("1") && !Box[0].equals("2") && !Box[0].equals("3") && !Box[0].equals("4") && !Box[0].equals("5") && !Box[0].equals("6") && !Box[0].equals("7")
                    && !Box[0].equals("8") && !Box[0].equals("9") && !Box[0].equals("10")) {


                //Вычитание1
                if (!Box[1].equals("+") && !Box[1].equals("-") && !Box[1].equals("*") && !Box[1].equals("/")) {

                    String Box01 = Box[0] + " " + Box[1];

                    String str1 = Box01.substring(1, Box01.length() - 1);
                    String str2 = Box[3].substring(1, Box[3].length() - 1);

                    if (Box[2].equals("-")) {
                        Res = str1.replace(str2, "");
                        return Res;
                    }
                }


                String str1 = Box[0].substring(1, Box[0].length() - 1);

                if (str1.length() > 10) {

                    throw new IllegalArgumentException("т.к. первый операнд не может быть больше 10 символов");

                }


                if (Box[2].equals("1") || Box[2].equals("2") || Box[2].equals("3") || Box[2].equals("4")
                        || Box[2].equals("5") || Box[2].equals("6") || Box[2].equals("7") || Box[2].equals("8")
                        || Box[2].equals("9") || Box[2].equals("10")) {

                    if (!Box[2].equals("1") && !Box[2].equals("2") && !Box[2].equals("3") && !Box[2].equals("4")
                            && !Box[2].equals("5") && !Box[2].equals("6") && !Box[2].equals("7") && !Box[2].equals("8")
                            && !Box[2].equals("9") && !Box[2].equals("10")) {

                        throw new IllegalArgumentException("т.к. второй операнд не является целым числом от 1 до 10");

                    }

                    //Умножение и деление

                    if (Box[1].equals("*")) {

                        switch (Box[2]) {
                            case "1":
                                Res = str1;
                                return Res;
                            case "2":
                                Res = str1 + str1;
                                return Res;
                            case "3":
                                Res = str1 + str1 + str1;
                                return Res;
                            case "4":
                                Res = str1 + str1 + str1 + str1;
                                return Res;
                            case "5":
                                Res = str1 + str1 + str1 + str1 + str1;
                                return Res;
                            case "6":
                                Res = str1 + str1 + str1 + str1 + str1 + str1;
                                return Res;
                            case "7":
                                Res = str1 + str1 + str1 + str1 + str1 + str1 + str1;
                                return Res;
                            case "8":
                                Res = str1 + str1 + str1 + str1 + str1 + str1 + str1 + str1;
                                return Res;
                            case "9":
                                Res = str1 + str1 + str1 + str1 + str1 + str1 + str1 + str1 + str1;
                                return Res;
                            case "10":
                                Res = str1 + str1 + str1 + str1 + str1 + str1 + str1 + str1 + str1 + str1;
                                return Res;
                        }

                    } else if (Box[1].equals("/")) {
                        int IntBox2 = Integer.parseInt(Box[2]);
                        int IntlengthBox0 = str1.length();
                        int IntRes = IntlengthBox0 / IntBox2;
                        return str1.substring(0, Math.min(IntRes, IntlengthBox0));
                    }

                }
                //Сложение
                String str2 = Box[2].substring(1, Box[2].length() - 1);

                if (Box[1].equals("+")) {
                    Res = str1 + str2;
                    return Res;
                }
                //Вычтьание2
                if (Box[1].equals("-")) {
                    Res = str1.replace(str2, "");
                    return Res;
                }
            }
            throw new IllegalArgumentException("т.к. первый операнд не может быть числом");
    }
}
