import java.util.Random;

import javax.swing.JOptionPane;

public class GameOperator {
	Jamie j = new Jamie();

	@SuppressWarnings("static-access")
	void playGames() {
		j.joptionpane = "Ok! What game would you like to play?";
		j.speak(j.joptionpane);
		String game = JOptionPane.showInputDialog(j.joptionpane);
		if (game.equalsIgnoreCase("number game") || game.equalsIgnoreCase("number guessing game")) {
			boolean hasGotNumber = false;
			j.joptionpane = "Try to guess my number from 1-100!";
			j.speak("Try to guess my number from 1 to 100");
			JOptionPane.showMessageDialog(null, j.joptionpane);
			int randomNumber = new Random().nextInt(100) + 1;
			for (int i = 0; i < 5; i++) {
				String number = JOptionPane.showInputDialog("Guess:");
				int numberToInt = Integer.parseInt(number);
				if (numberToInt > randomNumber) {
					j.joptionpane = "Lower!";
					j.speak(j.joptionpane);
					JOptionPane.showMessageDialog(null, j.joptionpane);
				}
				if (numberToInt < randomNumber) {
					j.joptionpane = "Higher!";
					j.speak(j.joptionpane);
					JOptionPane.showMessageDialog(null, j.joptionpane);
				}
				if (numberToInt == randomNumber) {
					j.joptionpane = "You got it in " + i + " tries!";
					j.speak(j.joptionpane);
					JOptionPane.showMessageDialog(null, j.joptionpane);
					i = 1000;
					hasGotNumber = true;
				}
			}
			if (!hasGotNumber) {
				j.joptionpane = "Sorry! Your five tries is up! The correct number was " + randomNumber;
				j.speak(j.joptionpane);
				JOptionPane.showMessageDialog(null, j.joptionpane);
			}
		}
		if (game.equalsIgnoreCase("rock paper scissors") || game.equalsIgnoreCase("rock, paper, scissors")) {
			int Jamie = 0;
			int user = 0;
			for (int i = 0; i < 3; i++) {
				int newnewnewnewnewrandom = new Random().nextInt(3);
				if (newnewnewnewnewrandom == 0) {
					j.speak("3");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					j.speak("2");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					j.speak("1");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					String winorlose = JOptionPane.showInputDialog("Enter rock, paper, or scissors!");
					if (winorlose.equalsIgnoreCase("scissors")) {
						Jamie++;
						user++;
					}
					if (winorlose.equalsIgnoreCase("rock")) {
						user++;
					}
					if (winorlose.equalsIgnoreCase("paper")) {
						Jamie++;
					}
					j.speak("scissors");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
				}
				if (newnewnewnewnewrandom == 1) {
					j.speak("3");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					j.speak("2");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					j.speak("1");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					String winorlose = JOptionPane.showInputDialog("Enter rock, paper, or scissors!");
					if (winorlose.equalsIgnoreCase("scissors")) {
						Jamie++;
					}
					if (winorlose.equalsIgnoreCase("rock")) {
						user++;
						Jamie++;
					}
					if (winorlose.equalsIgnoreCase("paper")) {
						user++;
					}
					j.speak("rock");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
				}
				if (newnewnewnewnewrandom == 2) {
					j.speak("3");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					j.speak("2");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					j.speak("1");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					String winorlose = JOptionPane.showInputDialog("Enter rock, paper, or scissors!");
					if (winorlose.equalsIgnoreCase("scissors")) {
						user++;
					}
					if (winorlose.equalsIgnoreCase("rock")) {
						Jamie++;
					}
					if (winorlose.equalsIgnoreCase("paper")) {
						user++;
						Jamie++;
					}
					j.speak("paper");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
				}
			}
			if (user == Jamie) {
				j.joptionpane = "Tie! I wish we could have a rematch.";
				j.speak(j.joptionpane);
				JOptionPane.showMessageDialog(null, j.joptionpane);
			}
			if (user > Jamie) {
				j.joptionpane = "You won! ANGRY! ANGRY! ANGRY!";
				j.speak(j.joptionpane);
				JOptionPane.showMessageDialog(null, j.joptionpane);
			}
			if (user < Jamie) {
				j.joptionpane = "I WON!!! YAY!";
				j.speak(j.joptionpane);
				JOptionPane.showMessageDialog(null, j.joptionpane);
			}
		}
	}
}