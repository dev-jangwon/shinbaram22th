package shinbaram.model.dto;

public class PersonalDTO {
	private String name;
	private String birth;
	private String ment;
	private String picURL;
	private String videoURL;
	
	public PersonalDTO(String name, String birth, String ment, String picURL, String videoURL) {
		super();
		this.name = name;
		this.birth = birth;
		this.ment = ment;
		this.picURL = picURL;
		this.videoURL = videoURL;
	}
	public PersonalDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getMent() {
		return ment;
	}
	public void setMent(String ment) {
		this.ment = ment;
	}
	public String getPicURL() {
		return picURL;
	}
	public void setPicURL(String picURL) {
		this.picURL = picURL;
	}
	public String getVideoURL() {
		return videoURL;
	}
	public void setVideoURL(String videoURL) {
		this.videoURL = videoURL;
	}
}
