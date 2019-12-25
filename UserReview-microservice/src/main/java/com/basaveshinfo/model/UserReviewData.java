package com.basaveshinfo.model;

public class UserReviewData {

	String userid;
	String userName;
	String movieId;
	String review;
	
	public UserReviewData() {	
	}
	
	public UserReviewData(String userid, String userName, String movieId, String review) {
		super();
		this.userid = userid;
		this.userName = userName;
		this.movieId = movieId;
		this.review = review;
	}
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}	
}
