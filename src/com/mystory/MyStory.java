//package com.mystory;
//
//import java.io.InputStream;
//import java.util.Scanner;
//
//public class MyStory {
//	public static Scanner sc = newScanner(System.in);
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String lightSaber = null;
//		boolean quitTheGame = false;
//
//		System.out.println("Hello and welcome to...");
//
//		talkToChoice();
//
//	} // main - do not put methods inside of methods
//
//	/**
//	 * 
//	 */
//	public static void talkToChoice() {
//		System.out.println("In the Cantina you find 3 strangers"  //beginning of branch
//
//				+ "would you like to talk to the \n" + "tJ: Jedi\n" + "tD: Droid\n" + "tS: Sith");
//
//		String whoToTalkTo = sc.nextLine();
//		whoAmITalkingTo(whoToTalkTo);
//	}   //can copy and paste this block 
//
//	private static Scanner newScanner(InputStream in) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public static void whoAmITalkingTo(String whoToTalkTo) { //action on first branch
//
//		switch (thePersonITalkTo.toLowerCase()) {
//
//		case "j":
//			whatDoesTheJediSay();				//first choices speak to whom?
//			// here's where jedi talks to user
//			break;
//		case "d":
//			whatDoesTheDroidSay();
//
//			break;
//		case "s":
//			whatDoesTheSithSay();
//
//			break;
//			break;
//
//		default:
//
//			System.out.println("I'm sorry, you've made an error, please restart the game");
//
//		}
//
//	}
//
//public static void whatDoesTheJediSay() {  //secondary choices: answer their question
//	System.out.println("You've decided to speak to the Jedi.");
//	System.out.println("The force is strong with you.");
//			+"\nYou should Join the Jedi Academy"
//			+"\n\tY: Sure I'll join the Jedi Academy"
//			+"\n\tN: Screw that!";
//}
////third layer: ouch or yay?
//	public static void whatDoesTheDroidSay() {
//		System.out.println("The droid looks about nervously. What does he have to say?");
//
//	}
//
//	public static void whatDoesTheSithSay() {
//		System.out.println("You sit down next to the Sith.");
//
//	}
//} // class
