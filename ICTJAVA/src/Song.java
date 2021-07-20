
public class Song {
	
	public String title;
	public String artist;
	public int year;
	public String country;
	
	public Song() {
		this("제목","가수",2021,"국가");
		
	}

	public Song(String title, String artist, int year, String country) {
		this.title = title;
		this.artist =  artist;
		this.year = year;
		this.country = country;
	}
	
	public void show() {
		System.out.println("노래 제목 : " + title);
		System.out.println("가수 이름 : " + artist);
		System.out.println("발표 연도 : " + year);
		System.out.println("국적 : " + country);

	}
	
	public static void main(String[] args) {
		
		Song song = new Song("Dancing Queen", "ABBA", 1978, "스웨덴");
		song.show();
		
	
	
	
	}
	
}

