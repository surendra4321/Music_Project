package music.com.music.system.Entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Table(name="music")
@Entity
public class MusicEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String albumName;
	private Date releseDate;
	private int playcount;
	
	public MusicEntity(Long id, String title, String albumName, Date releseDate, int playcount) {
		super();
		this.id = id;
		this.title = title;
		this.albumName = albumName;
		this.releseDate = releseDate;
		this.playcount = playcount;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	public Date getReleseDate() {
		return releseDate;
	}

	public void setReleseDate(Date releseDate) {
		this.releseDate = releseDate;
	}

	public int getPlaycount() {
		return playcount;
	}

	public void setPlaycount(int playcount) {
		this.playcount = playcount;
	}

	@Override
	public String toString() {
		return "MusicEntity [id=" + id + ", title=" + title + ", albumName=" + albumName + ", releseDate=" + releseDate
				+ ", playcount=" + playcount + "]";
	}
	
	
	
	

}
