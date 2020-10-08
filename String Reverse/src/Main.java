
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String r = reverse("dog"); // creating a new string named r, assigning it the value of the method reverse with parameter "dog"
		System.out.println(r); // print the new value of r after the method has reversed the value
	}
	
	public static String reverse(String s)	{ 
		char[] letters = new char[s.length()]; //Constructing a new array of 'chars' char is a keyword. This array is named letters. With a length of s.length 
		
		int letterIndex = 0; // an int which becomes our index to pass cycle through the values of the array letters.
		for(int i = s.length()-1; i >= 0; i--)	{ //Decrease backward from the length -1 because arrays start at zero and if not you get an index out of bounds exception because in this instance dog is [0][1][2]
			letters[letterIndex] = s.charAt(i); // takes the last char and puts it in the first position of the new array
			letterIndex++; // move the index up so the next letter can be swapped.
		
		}
		// the new string is created but still exists as an array
		
		String reverse = ""; //this code loops through the array and puts it into a string
		for(int i =0; i < s.length(); i++)	{
			reverse = reverse + letters[i];
			
		}
		
		return reverse;
		
	}

}
