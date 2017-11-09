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

}
