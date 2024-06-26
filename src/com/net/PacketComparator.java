package com.net;

import java.util.Comparator;

public class PacketComparator implements Comparator<Packet> {
	
	public int compare(Packet p1, Packet p2)
	{
		return Integer.compare(p2.priority, p1.priority);
		
	}

}
