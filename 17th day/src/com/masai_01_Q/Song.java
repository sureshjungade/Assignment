package com.masai_01_Q;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Song {

	
	private String movieName;
	private String songName;
	
	
	
	public Song(String songName,String movieName) {
		super();
		this.movieName = movieName;
		this.songName = songName;
	}


	@Override
	public int hashCode() {
		return Objects.hash(movieName, songName);
	}


	public String getMovieName() {
		return movieName;
	}


	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}


	public String getSongName() {
		return songName;
	}


	public void setSongName(String songName) {
		this.songName = songName;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Song other = (Song) obj;
		return Objects.equals(movieName, other.movieName) && Objects.equals(songName, other.songName);
	}


	public void play(){
		
		System.out.println(this.songName+" of "+this.movieName+" is playing...!");
	}
	
	
	
}
