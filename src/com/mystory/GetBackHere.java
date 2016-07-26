package com.mystory;

import java.util.Scanner;

public class GetBackHere {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		GetBackHere g = new GetBackHere();

		g.topOfStory();
		// TODO Auto-generated method stub
	}

	public void topOfStory() {
		boolean quitTheGame = false;
		while (!quitTheGame) {
			// System.out.println("You and several friends are traveling through
			// Mexico. Today you were at a state fair in the far suburbs of
			// Mexico City. \n It is well into the evening and you are all
			// tired. You take a bus to Ixtpalapa Metro Station, ride for a bit,
			// and wait at a transfer point for the next train.");
			//
			//
			// System.out.println("A couple of your buddies feel a bit
			// fidgety.\n Tobin sits directly on the platform with his feet
			// hanging over the edge. Jerry does the same. You glance at them
			// and know that this is never a good idea from the transit
			// authorities' point of view. It's a stupid idea.");
			System.out.println("We are at the top level method.  Choose A, B, C or X");

			String choice = sc.nextLine();

			switch (choice.toLowerCase()) {
			case "a":
				doA();
				break;

			// case "b":
			// doB();
			// break;

			case "x":
				quitTheGame = true;

			}
		}

	}

	private void doA() {
		System.out.println("We are at Do A.  Choose A,  or X");

		String choice = sc.nextLine();

		switch (choice.toLowerCase()) {
		case "a":
			doA2();
			break;

		case "x":
			return;

		}

	}

	private void doA2() {
		System.out.println("We are at Do A2.  Choose A,  or X");

		//

	}
	// //speakNoSpeak();
	// }
	//
	// } // main - do not put methods inside of methods
	//
	// while(stillPlaying)=false;{ // while loop for 2nd story level
	// return stillPlaying;}*/
	//
	// public static void speakNoSpeak() {
	// System.out.println("Screw it, this is stupid, you think:" //first
	// decision
	//
	// +"\n\t: You say, The 3rd rail is not a myth!" + "\n\tN: you say nothing
	// \n" );
	////
	// String speakNoSpeak = sc.nextLine();
	// speakNoSpeak(speakNoSpeak);
	//
	// case "s":
	// speak();
	// // "don't be idiot"
	// returnStillPlaying = true
	// break;
	// case "n":
	// noSpeak();
	// // "Ehhh screw it" (en serio?)
	// break;
	//

	// returnStillPlaying; // use on each ending instance of game
	//
	// } // can copy and paste this block
	//
	// private static Scanner newScanner(InputStream in) {
	// // TODO Auto-generated method stub
	// return stillPlaying;
	// }
	//
	// public static void runAfterRaiseHell(String runAfterRaiseHell) { //
	// second
	// // choice-
	// // response?
	//
	// switch (runAfterRaiseHell.toLowerCase()) {
	//
	// case "r":
	// runAfter();
	// // "After them!"
	// break;
	// case "h":
	// raiseHell();
	// // "You've no call to detain them!" (en serio?)
	// break;
	//
	// default:
	//
	// System.out.println("I'm sorry, you've made an error, please restart the
	// game");
	//
	// }
	//
	// }
	//
	// public static void runAfter() {
	// System.out.println("Run hell-for-leather."); //second choice consequences
	// System.out.println("The cops detain your friends.");
	//
	// +"\n\tY:Attempt to talk your way out" //victory
	// +"\n\tN: Call your professor"; //another die scenario
	// }
	//
	// public static void raiseHell() {
	// System.out.println("You catch up and start arguing with the cops");
	// System.out.println("The cops detain your friends. And you."); //die
	// scenario
	//
	// stillPlaying = false;
	//
	// }
	//
	// public static void boardTheTrain() { //secondary choices: answer their
	// question
	// System.out.println("You've boarded the train and traveled further.");
	// System.out.println("The train breaks and you have to find alternate
	// transport. "
	// + "\nAll your friends are out of money");
	// +"\nGet taxi or walk?"
	// +"\n\tY: Take the taxi- settle up with your friend later"
	// +"\n\tN: Screw that! It's only a couple miles.";
	//
	// switch (boardTheTrain.toLowerCase()) {
	//
	// case "y":
	// boardTheTrain();
	// "Take the taxi- settle up with your friend later"
	// break;
	// case "n":
	// walk();
	// Screw that! It's only a couple miles." (en serio?)
	// break;
	//
} // class
