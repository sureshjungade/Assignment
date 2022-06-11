package com.masai_01_Q;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		PlayList pL = new PlayList();
		
		for(int i=0; i<4; i++) {
			System.out.println("Enter Song name");
			
			String SongName = sc.next();
			
			System.out.println("Enter Movie name");
			
			String MovieName = sc.next();
			
			Song S1 = new Song(SongName,MovieName);
			
			
			pL.addSong(S1);
		}

		for(Song list: pL.songs) {
			list.play();
		}
	}

}
