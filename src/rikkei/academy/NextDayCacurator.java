package rikkei.academy;

import java.util.Scanner;

public class NextDayCacurator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào ngày: ");
        int day = sc.nextInt();
        System.out.println("Nhập vào tháng: ");
        int month = sc.nextInt();
        System.out.println("Nhập vào năm: ");
        int year = sc.nextInt();

        System.out.println("ngày tiếp theo : ");
        nextDay(day, month, year);
    }

    public static String nextDay(int day, int month, int year) {

        if (day <= 0 || month <= 0 || year <= 0) {
            System.out.println("vui lòng nhập lại");
        } else {
            switch (month) {
                case 1:
                    if (day == 31) {
                        day = 1;
                        month = 2;
                        break;
                    }
                    day += 1;
                    break;
                case 2:
                    if (day == 28 || day == 29) {
                        day = 1;
                        month = 3;
                        break;
                    }
                    day += 1;
                    break;
                case 3:
                    if (day == 31) {
                        day = 1;
                        month = 4;
                        break;
                    }
                    day += 1;
                    break;
                case 4:
                    if (day == 30) {
                        day = 1;
                        month = 5;
                        break;
                    }
                    day += 1;
                    break;
                case 5:
                    if (day == 31) {
                        day = 1;
                        month = 6;
                        break;
                    }
                    day += 1;
                    break;

                case 6:
                    if (day == 30) {
                        day = 1;
                        month = 7;
                        break;
                    }
                    day += 1;
                    break;
                case 7:
                    if (day == 31) {
                        day = 1;
                        month = 8;
                        break;
                    }
                    day += 1;
                    break;
                case 8:
                    if (day == 31) {
                        day = 1;
                        month = 9;
                        break;
                    }
                    day += 1;
                    break;
                case 9:
                    if (day == 30) {
                        day = 1;
                        month = 10;
                        break;
                    }
                    day += 1;
                    break;
                case 10:
                    if (day == 31) {
                        day = 1;
                        month = 11;
                        break;
                    }
                    day += 1;
                    break;
                case 11:
                    if (day == 30) {
                        day = 1;
                        month = 12;
                        break;
                    }
                    day += 1;
                    break;
                case 12:
                    if (day == 31) {
                        day = 1;
                        month = 1;
                        year += 1;
                        break;
                    }
                    day += 1;
                    break;
            }
        }
        return day + "/" + month + "/" + year;
    }

}
