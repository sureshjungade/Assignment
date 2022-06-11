package com.masai_01_Q;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PlayList {
	
	
	public List<Song> songs = new ArrayList<>();
	
	public void addSong(Song song) {
		int count = 0;
		
		//System.out.println(songs.size());
		
		if(songs.size()>1) {
			count=0;
			for(Song s: songs) {
				if(s.equals(song)) {
					
//					System.out.println(s.equals(song));
//					System.out.println(s);
//					System.out.println(song);
					//songs.remove(s);
					count++;
					System.out.println("Song is already added in the playlist");
				}
				//System.out.println(songs);
			}
		}
		
		if(count==0) {
			songs.add(song);
			System.out.println("Song added to the playlist successfully.");
		}
		
	}
	
	

}
