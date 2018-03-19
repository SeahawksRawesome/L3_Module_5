package data_structures;

import java.util.ArrayList;

/**
 * Copyright The League of Amazing Programmers 2013-2018 Level 3 Two ArrayList
 * Cleaning Exercises Duration=.00 Platform=Eclipse Type=Recipe Objectives=WOT?
 */

public class RemovingStuffFromArrayLists {

	public static void main(String[] args) {

		class Stuff {
		}
		class Worm extends Stuff {
		}
		class Dirt extends Stuff {
		}
		ArrayList<Stuff> stuffIFoundInTheYard = new ArrayList<Stuff>();
		stuffIFoundInTheYard.add(new Worm());
		stuffIFoundInTheYard.add(new Dirt());
		stuffIFoundInTheYard.add(new Dirt());
		stuffIFoundInTheYard.add(new Dirt());
		stuffIFoundInTheYard.add(new Worm());
		stuffIFoundInTheYard.add(new Dirt());

		System.out.println(stuffIFoundInTheYard.size());
		for(int i = 0; i < stuffIFoundInTheYard.size();) {
			Stuff SHOME = stuffIFoundInTheYard.get(i);
			if(SHOME instanceof Dirt) {
				stuffIFoundInTheYard.remove(SHOME);
			}
			else {
				i++;
			}
		}
		/* TODO 1: Clean out the dirt but keep the delicious worms. */

		System.out.println(stuffIFoundInTheYard.size()); // should be 2

		ArrayList<Character> truth = new ArrayList<Character>();
		truth.add('#');
		truth.add('s');
		truth.add('u');
		truth.add('#');
		truth.add('n');
		truth.add('s');
		truth.add(' ');
		truth.add('#');
		truth.add('o');
		truth.add('u');
		truth.add('#');
		truth.add('t');
		truth.add('#');
		truth.add(' ');
		truth.add('g');
		truth.add('#');
		truth.add('n');
		truth.add('s');
		truth.add('#');
		truth.add(' ');
		truth.add('o');
		truth.add('#');
		truth.add('u');
		truth.add('t');
		
		/* TODO 2: Remove the hash symbols and print out the truth. */
		System.out.println(truth.size());
		for(int i = 0; i < truth.size();) {
			Character SHOME = truth.get(i);
			if(SHOME.equals('#')) {
				truth.remove(SHOME);
			}
			else {
				i++;
			}
		}
		
		System.out.println(truth.size());
		for(int i = 0; i < truth.size();) {
			Character SHOME = truth.get(i);
			if(SHOME.equals('#')) {
				truth.remove(SHOME);
			}
			else {
				i++;
			}
			
		}
		String ooooffff = ""
				+ "";
		for(int i = 0; i < truth.size(); i++) {
		ooooffff +=	truth.get(i);
			ooooffff = ooooffff ;
		}
		System.out.println(ooooffff);
		//System.out.println(truth);
	}
}
