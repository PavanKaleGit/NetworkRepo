package com.net;

public class Packet {
	
	String type;
	int priority;
	String data;
	
	public Packet(String type,int priority,String data) {
		this.type =type;
		this.priority = priority;
		this.data = data;
		
	}
	@Override
    public String toString() {
        return "Packet{" +
                "type='" + type + '\'' +
                ", priority=" + priority +
                ", data='" + data + '\'' +
                '}';
        
        
        
        
        
	}

}
