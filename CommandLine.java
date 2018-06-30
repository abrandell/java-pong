package utils;

import java.util.Scanner;

public class CommandLine implements Runnable{ //Threads are contained in java.lang

	private Scanner gameCommandScanner;

	public CommandLine(){
		gameCommandScanner = new Scanner(System.in);
	}
	
	@Override
	public void run(){
		while (true){
			String current_line = gameCommandScanner.nextLine();
			System.out.println(current_line);
		}
	}

}
