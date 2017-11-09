package com.chatService.Client;

import java.util.Scanner;

import com.chatService.protoService.ChatMessage;

import io.grpc.ManagedChannel;
import io.grpc.stub.StreamObserver;

public class ChatService {

	
  public void startService(StreamObserver<ChatMessage> observer, ManagedChannel channel) {

		while(true)
		{

			Scanner reader = new Scanner(System.in);
			String clientMes = reader.nextLine();
			
			observer.onNext(ChatMessage.newBuilder().setMessage(clientMes).build());
			
			if (clientMes.equals("exit"))
				observer.onCompleted();
		}

  }
  
  public static void main(String[] args)
	{	
	  
	  String ss = "Computer Science 21";
	  String s1 = "Computer Science";
		int x = 307;
		String s2 = s1 + " " + x;
		String s3 = s2.substring(10,17);
		String s4 = "is fun";
		String s5 = s2 + s4;
		
		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);
		System.out.println("s3: " + s3);
		System.out.println("s4: " + s4);
		System.out.println("s5: " + s5);
	 
		
	}

}
