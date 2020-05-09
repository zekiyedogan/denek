import java.awt.List;
import java.util.ArrayList;

public class Test {

public static void main(String[] args) {
/////////////////////////////////Q1
//Alliterative("Fred’s friends fried Fritos for Friday’s food");
/////////////////////////////////Q2
//Result(5,5);
////////////////////////////////Q3
//Intersection();
/////////////////////////////////Q4
//Union();
////////////////////////////////Q5
//IntersectionList();
////////////////////////////////Q6
//UnionList();
//////////////////////////////////Q7
// DNA("a a t g c");// write with spaces
////////////////////////////////////////////Q8
	/*int number = 6; int i =number/2;
	int n =Perfect(number,i);
	if(number==n) {
		System.out.println("perfect");
	}
	else
		System.out.println("not perfect");*/
}
//////////////////////////////////////////////Q1
public static boolean Alliterative(String str){
boolean flag=true;
//String str =  "Fred’s friends fried Fritos for Friday’s food";
str = str.toLowerCase();
String[] all = str.split(" ");
char check = (char)all[0].charAt(0);
for (int i = 0; i < all.length; i++) {
if((char)all[i].charAt(0)!=check){
flag=false;;
}
}
System.out.println(flag);
return flag;
}
/////////////////////////////////////////////////////////////////Q2
public static int Result(int n, int k){
if(n>=k){
int n_ind = Factorial(n);
int k_ind = Factorial(k);
int nk_ind = Factorial(n-k);
int result = (n_ind)/(k_ind*nk_ind);
System.out.println("Result : "+result);
return result;
}
else
return -1;

}

public static int Factorial(int fact){
int multi = 1;
for (int i = 1; i <= fact; i++) {
multi=multi*i;
}
//System.out.println(multi);
return multi;
}
////////////////////////////////////////////////////////////////////////Q3
public static void Intersection(){
int[] arr1 = { 1, 2, 3, 4, 6, 12,0 };
int[] arr2 = { 2, 1, 8, 4, 16,0 };
int[] arr = new int[Math.min(arr1.length, arr2.length)];
int index = 0;
for (int i = 0; i < arr1.length; i++) {
for (int j = 0; j < arr2.length; j++) {
if(arr1[i]==arr2[j]){
arr[index]=arr1[i];
index++;
}
}
}
for (int i = 0; i < arr.length; i++) {//////////////index kadar
System.out.println(arr[i]);
}
}
//////////////////////////////////////////////////////////////////////////Q4
public static void Union(){
int[] arr1 = { 1, 2, 3, 4, 6, 12 };
int[] arr2 = { 2, 1, 8, 4, 16 };
int[] arr = new int [arr1.length+arr2.length];

int index= arr1.length;
boolean flag=false;// not equal
for (int i = 0; i < arr1.length; i++) {
arr[i] = arr1[i];
}
for (int i = 0; i < arr2.length; i++) {
for (int j = 0; j < arr1.length; j++) {
if(arr2[i]==arr1[j]){
flag=true;
break;
}
}
if(!flag){
arr[index]=arr2[i];
index++;
}
flag=false;
}
for (int i = 0; i < arr.length; i++) {
System.out.println(arr[i]);
}
}
/////////////////////////////////////////////////////////Q5
public static void IntersectionList(){
ArrayList<Integer> lst1 = new ArrayList<Integer>();
ArrayList<Integer> lst2 = new ArrayList<Integer>();
ArrayList<Integer> lst = new ArrayList<Integer>();
lst1.add(1); lst1.add(2); lst1.add(3); lst1.add(4); lst1.add(6); lst1.add(12);
lst2.add(2); lst2.add(1); lst2.add(8); lst2.add(4); lst2.add(16);

for (int a: lst1) {
for(int b : lst2){
if(a==b)
lst.add(a);
}
}
for(int c: lst)
System.out.println(c);
}
//////////////////////////////////////////////////////////////////////Q6
public static void UnionList(){
ArrayList<Integer> lst1 = new ArrayList<Integer>();
ArrayList<Integer> lst2 = new ArrayList<Integer>();
ArrayList<Integer> lst = new ArrayList<Integer>();
lst1.add(1); lst1.add(2); lst1.add(3); lst1.add(4); lst1.add(6); lst1.add(12);
lst2.add(2); lst2.add(1); lst2.add(8); lst2.add(4); lst2.add(16);
boolean flag = false;
for(int a: lst1)
lst.add(a);

for (int a: lst2) {
for(int b : lst1){
if(a==b){
flag=true;
break;
}
}
if(!flag)
lst.add(a);
flag=false;
}
for(int c: lst)
System.out.println(c);
}
/////////////////////////////////////////////////////////////////////////Q7
		public static void DNA(String dna) {
			String [] str = dna.split(" ");
			int index=0;
			String fin = complement(str,index);
			System.out.println(fin);
			
		}
		public static String complement(String[]str, int index) {
			if(index!=str.length) {
				if(str[index].equals("a")) {
					str[index]="t";
				}
				else if(str[index].equals("t")) {
					str[index]="a";
				}
				else if(str[index].equals("g")) {
					str[index]="c";
				}
				else if(str[index].equals("c")) {
					str[index]="g";
				}
				index++;
				return complement(str,index);
			}
			else
			{
				String fin ="";
				for (int i = 0; i < str.length; i++) {
					fin=fin+str[i];
				}
				return fin;
			}
		}
////////////////////////////////////////////////////////////////////////////Q8
public static int Perfect(int num, int i) {
	if(i==1)
		return 1;
		if(num%i==0) {
				return i+Perfect(num,i-1);
			}
			else {
				 return  Perfect(num,i-1);
			}
		}


}
