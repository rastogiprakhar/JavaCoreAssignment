package Core.Ques13;

import java.util.Scanner;

class Library {

    static String bookname, issuedate, date;
    static int bookid, total_issuebook;

    void add() {
        System.out.println("Enter the book name, Prize and Book_No");
        Scanner obj2 = new Scanner(System.in);
        String str = obj2.next();
        float price = Float.parseFloat(obj2.next());
        int bookno = Integer.parseInt(obj2.next());
        System.out.println("your details are Name: " + str + " Price: " + price + " Book_No: " + bookno);
    }

    void iss() {
        Scanner obj3 = new Scanner(System.in);
        System.out.println("Book Name");
        bookname = obj3.nextLine();
        System.out.println("Book_id");
        bookid = obj3.nextInt();
        obj3.nextLine();
        System.out.println("issue date");
        issuedate = obj3.nextLine();
        System.out.println("total no of book issued");
        total_issuebook = obj3.nextInt();
        obj3.nextLine();
        System.out.println("Return book date");
        String date = obj3.nextLine();
    }

    int getid() {
        return bookid;
    }

    void ret() {
        System.out.println("Enter the Student_Name and book_id");
        Scanner c = new Scanner(System.in);
        String name = c.nextLine();
        int bookId = c.nextInt();
        if (bookid == bookId) {
            System.out.println("Total Details");
            System.out.println("Book_name:" + Library.bookname);
            System.out.println("Book_id:" + Library.bookid);
            System.out.println("Issue date:" + Library.issuedate);
            System.out.println("Total number of book issued:" + Library.total_issuebook);
            System.out.println("Book return date" + Library.date);
        } else {
            System.out.println("You entered the wrong id , Please dd the correct id kindly.");
        }

    }

    void details() {
        System.out.println("Book_name:" + Library.bookname);
        System.out.println("Book_id:" + Library.bookid);
        System.out.println("Issue date:" + Library.issuedate);
        System.out.println("Total number of book issued:" + Library.total_issuebook);
        System.out.println("Book return date" + Library.date);

    }

    void exit() {

    }

}
