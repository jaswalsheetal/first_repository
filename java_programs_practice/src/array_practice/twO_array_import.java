package array_practice;

import java.util.Scanner;
public class twO_array_import {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the memeory location");
		 i=obj.nextInt();
		System.out.println("enter the second emory");
		j=obj.nextInt();
int arr[][]=new int[i][j];
System.out.println("enter the elements in the array");
for(int a=0;a<i;i++)
{
	for(int b=0;b<j;b++)
	{
		arr[a][b]=obj.nextInt();
	}}
	for(int a=0;a<i;i++)
	{
		for(int b=0;b<j;b++)
		{
			System.out.println(arr[a][b]);
		}}}}
	


