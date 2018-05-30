package com.ByteShortInt;

public class Main {

	public static void main(String[] args) {
		// by default value on right is converted to int datatype
		// to change it we need to cast it by defining the datatype before the value
		//on the right
		// int has a width of 32
		int myMinValue = -2_147_483_648;
		int myMaxValue = 2147483647;
		int myTotal = (myMinValue / 2);
		System.out.println("My Total" + myTotal);
		
		int myTestInt = 50;
		
		// int has a width of 8
		byte myMinByteValue = -128;
		byte myMaxByteValue = 127;
		byte mybyteTotal =(byte) (myMinByteValue / 2);
		System.out.println("My Byte Total" + mybyteTotal);
		
		byte myTestByte = 10;
		
		// int has a width of 16
		short myShortMinValue = -32768;
		short myShortMaxValue = 32767;
		short myShortTotal =(short) (myShortMinValue / 2);
		System.out.println("My Short Total" + myShortTotal);
		
		short myTestShort = 20;
		
		//long has witdth of 64
		long myLongValue = -9_223_372_036_854_775_807L;
		long myTestLong = 50000 + (10 * (myTestShort + myTestByte + myTestInt));
		
		System.out.println("myTestLong " + myTestLong);
		
		

	}

}
