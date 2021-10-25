package Core.Ques13;

import java.util.Scanner;
class LibraryManagementSystem {
    public static void main(String arg[]) {
        char r;
        do {
            System.out.println("Library Management System*");
            System.out.println("Press 1 to add book");
            System.out.println("Press 2 to issue a book");
            System.out.println("Press 3 to return a book");
            System.out.println("Press 4 to print complete issue details");
            System.out.println("Press 5 to exit");
            Scanner obj1 = new Scanner(System.in);
            System.out.println("Enter any Number");
            int option = obj1.nextInt();
            switch (option) {
                case 1:
                    Library addbook_obj = new Library();
                    addbook_obj.add();
                    break;
                case 2:
                    Library issuebook_obj = new Library();
                    issuebook_obj.iss();
                    break;
                case 3:
                    Library returnbook_obj = new Library();
                    returnbook_obj.ret();
                    break;
                case 4:
                    Library detail_obj = new Library();
                    detail_obj.details();
                    break;
                case 5:
                    Library add = new Library();
                    add.exit();
                    break;
                default:
                    System.out.println("Invalid number");
            }
            System.out.println("Do you want to select next option(y/n)");
            r = obj1.next().charAt(0);

        }while (r == 'Y' || r == 'y') ;
        if (r == 'N' || r == 'n') {
            Library z = new Library();
            z.exit();
        }
    }
}


