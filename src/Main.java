public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new ProgramingBook("C01", "Java1", 10,"TG1", "Java", "None");
        books[1] = new ProgramingBook("C02", "Java3", 15,"TG2", "PHP", "Laravel");
        books[2] = new FictionBook("C03", "Nhung ke xuat chung", 20, "Tg3", "edu");
        books[3] = new FictionBook("C04", "Cau chuyen tu trai tim", 25, "Tg4", "fun");

        int sum = getTotalPrice(books);
        System.out.println("Tong tien");
        System.out.println(sum);


//      Duyệt mảng
//      nếu là sách lập trình ProgramingBook, kiểm tra xem language == "java" không
//        System.out.println(books[3] instanceof Book);
        System.out.println("So luong sach lap trinh ngon ngu Java");
        System.out.println(countBookByLanguage(books, "Java"));
    }

    public static int getTotalPrice(Book[] books){
        int sum = 0;
        for (int i = 0; i < books.length; i++) {
            sum+=books[i].getPrice();
        }
        return sum;
    }

    public static int countBookByLanguage(Book[] books, String language){
        int count = 0;
        for (int i = 0; i < books.length; i++) {

            if (books[i] instanceof ProgramingBook){
                if (((ProgramingBook)books[i]).getLanguage().equals(language))
                    count++;
            }
        }
        return count;
    }
}
