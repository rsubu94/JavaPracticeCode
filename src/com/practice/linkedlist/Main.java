package com.practice.linkedlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

import javax.management.loading.PrivateClassLoader;

import org.w3c.dom.css.ElementCSSInlineStyle;

import com.practice.composition.Case;

import sun.java2d.cmm.ProfileActivator;

public class Main {

	private static ArrayList<Album> albums = new ArrayList<>();

	public static void main(String[] args) {
		
//		ConcurrentHashMap<Integer,Integer> concurrentHashMap = new ConcurrentHashMap<>();
//		concurrentHashMap.put(1, 1);
//		concurrentHashMap.put(null,null );
		
		Album album = new Album("Sarvam thala mayam", "ARR");
		album.addSong("Title track -1", 5.50);
		album.addSong("Title track -2", 4.50);
		album.addSong("Title track -3", 3.40);
		album.addSong("Title track -4", 6.00);
		album.addSong("Title track -5 ", 3.45);
		album.addSong("Title track -6", 6.34);
		album.addSong("Title track -7", 4.56);
		albums.add(album);

		album = new Album("Sarkar", "ARR");
		album.addSong("Title track -11", 4.50);
		album.addSong("Title track -12", 6.50);
		album.addSong("Title track -13", 2.40);
		album.addSong("Title track -14", 6.50);
		album.addSong("Title track -15 ", 1.45);
		album.addSong("Title track -16", 2.34);
		album.addSong("Title track -17", 3.56);
		albums.add(album);

		System.out.println("Albums Size :: " + albums.size());
		LinkedList<Song> playList = new LinkedList<>();
		albums.get(0).addToPlaylist("Title track -1", playList);
		albums.get(0).addToPlaylist("Title track -4", playList);
		albums.get(0).addToPlaylist("Title track -7", playList);
		// albums.get(0).addToPlaylist("You cant do it", playList);
		albums.get(0).addToPlaylist(2, playList);
		albums.get(0).addToPlaylist(3, playList);
		// albums.get(0).addToPlaylist(9, playList);

		albums.get(1).addToPlaylist("Title track -12", playList);
		albums.get(1).addToPlaylist("Title track -15", playList);
		albums.get(1).addToPlaylist("Title track -13", playList);
		albums.get(1).addToPlaylist(1, playList);
		albums.get(1).addToPlaylist(4, playList);
		albums.get(1).addToPlaylist(6, playList);
		// albums.get(1).addToPlaylist(9, playList);

		play(playList);
		
		

	}

	public static void play(LinkedList<Song> playlist) {

		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		boolean forward = true;

		ListIterator<Song> listIterator = playlist.listIterator();
		if (playlist.size() == 0) {
			System.err.println("No Songs available in the playlist");
		} else {
			System.out.println("Now Playing the song :: " + listIterator.next());
		}
		printMenu();
		while (!quit) {

			System.out.println("Enter the action do you want to do ");
			int action = scanner.nextInt();
			switch (action) {
			case 0:
				System.out.println("Playlist is Completed");
				quit = true;
				break;
			case 1:
				if (!forward) {
					if (listIterator.hasNext())
						listIterator.next();
					forward = true;
				}
				if (listIterator.hasNext())
					System.out.println("Now Playing the song " + listIterator.next());
				else {
					System.out.println("Playlist reached to end");
					forward = false;
				}

				break;
			case 2:
				if (forward) {
					if (listIterator.hasPrevious())
						listIterator.previous();
					forward = false;
				}
				if (listIterator.hasPrevious())
					System.out.println("Now Playing the song " + listIterator.previous());
				else {
					System.out.println("Playlist reached to end");
					forward = true;
				}
				break;
			case 3:
				if (forward) {
					if (listIterator.hasPrevious()) {
						System.out.println("Now replaying " + listIterator.previous());
						forward = false;
					}

					else {
						System.out.println("We are at start of the list");
					}
				} else {
					if (listIterator.hasNext()) {
						System.out.println("Now replaying + " + listIterator.next());
						forward = true;
					} else
						System.out.println("Now we are end of the list");
				}

				break;
			case 4:
				printPlaylist(playlist);
				break;
			case 5:
				printMenu();
				break;
			case 6:
				if (playlist.size() > 0) {
					System.out.println("Removed data");
					listIterator.remove();
					if (listIterator.hasNext())
						System.out.println("Now playing " + listIterator.next());
					else if (listIterator.hasPrevious())
						System.out.println("Now Playing " + listIterator.previous());
				}

				else if (playlist.size() == 0) {
					System.out.println("No Album present in list");
				}
				break;
			default:
				break;
			}
		}
	}

	public static void printMenu() {
		System.out.println("Available actions \n Press");
		System.out.println("0 - To Quit \n " + "1 - To Play next Song\n" + "2 - To Play previous Song\n"
				+ "3 - To Replay the current song\n" + "4 - To print the playlist\n" + "5 - To print the menu\n"
				+ "6 - To remove the playlist");
	}

	public static void printPlaylist(LinkedList<Song> playlist) {
		Iterator<Song> iterator = playlist.iterator();
		System.err.println("==========================");
		while (iterator.hasNext()) {
			System.out.println("Playlist Name " + iterator.next());
		}
		System.err.println("==========================");
	}

}
