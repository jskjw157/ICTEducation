
public class Song {
	
	public String title;
	public String artist;
	public int year;
	public String country;
	
	public Song() {
		this("����","����",2021,"����");
		
	}

	public Song(String title, String artist, int year, String country) {
		this.title = title;
		this.artist =  artist;
		this.year = year;
		this.country = country;
	}
	
	public void show() {
		System.out.println("�뷡 ���� : " + title);
		System.out.println("���� �̸� : " + artist);
		System.out.println("��ǥ ���� : " + year);
		System.out.println("���� : " + country);

	}
	
	public static void main(String[] args) {
		
		Song song = new Song("Dancing Queen", "ABBA", 1978, "������");
		song.show();
		
	
	
	
	}
	
}

