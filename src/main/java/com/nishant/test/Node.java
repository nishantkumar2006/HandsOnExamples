package com.nishant.test;

public class Node {
 int data;
 Node left,right,prev,next;
 int key,value;
 
public Node(int item) {
	data = item; 
    left = right = null;
}
public Node(int key,int value) {
	this.key = key;
	this.value = value;
}
 
 
}
