package com.net;

import java.util.PriorityQueue;

public class NetworkRouting {
	
	public static void main(String[] args) {
		
		 PriorityQueue<Packet> Q= new PriorityQueue<>(new PacketComparator());

		 
		 Q.add(new Packet("Video", 20, "Video Data"));
		 Q.add(new Packet("voice", 10, "Voice Data"));
		 Q.add(new Packet("Email", 30, "Email Data"));
		 Q.add(new Packet("File Transfer", 1, "File  Data"));
		 
		 
		 while(!Q.isEmpty())
		 {
			 Packet packet =Q.poll();
			 System.out.println("Processing packet: " + packet);
		 }
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
