
public class Book {

	
		String title;
		String author;
		public void show() {
			System.out.println(title + " " + author);
		}
		
		public Book() {
			this("","");
		}
		
		public Book(String title) {
			this(title, "���ڹ̻�");
		}
		
		public Book(String title,String author) {
			this.title = title;
			this.author = author;
		}

		public static void main(String[] args) {
			
			Book littlePrince = new Book("�����", "�������丮");
			Book loveStory = new Book("������");
			Book emptyBook = new Book();
			littlePrince.show();
			loveStory.show();
			emptyBook.show();
			
		}

}
