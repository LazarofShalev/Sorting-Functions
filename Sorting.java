import java.util.Scanner;

public class Sorting {
		//---------------------------------1st Function Question 5 Chapter 7----------------------------------------------//
		public static boolean isKaprekarXXX(int num, int[] parts){
				
			int KaprekarCkr = num*num;
			int factorial = 0;
			boolean flag = false;
			int i = 1;
			
			while(KaprekarCkr > 0){
				factorial = factorial+(KaprekarCkr%10)*i;
				KaprekarCkr/=10;
				if(KaprekarCkr+factorial==num && factorial!=0 && KaprekarCkr!=0){
					parts[0] = factorial;
					parts[1] = KaprekarCkr;
					return true;
				}
				else{
					i*=10;
				}
			}
		return flag;
		}
		
		//---------------------------------2nd Function Question 1 Chapter 8----------------------------------------------//
		public static void BubbleSortFromTheEnd(int numArray[]){
			
			int i,j,temp;
			
			for(i = 0 ; i < numArray.length - 1 ; i++){
				for(j = numArray.length - 1 ; j > i ; j--){
					if(numArray[j] < numArray[j-1]){
						temp = numArray[j];
						numArray[j] = numArray[j-1];
						numArray[j-1] = temp;
					}
				}		
			}
		}
		//---------------------------------3rd Function Question 2 Chapter 8----------------------------------------------//
		public static void sortTheMatrix(int matrix[][]){
			
			int temp;
			
			for(int i = 0 ; i < matrix.length-1 ; i++){
				for(int j = matrix.length-1 ; j > i ; j--){
					if(matrix[j][j] < matrix[j-1][j-1]){
						temp = matrix[j][j];
						matrix[j][j] = matrix[j-1][j-1];
						matrix[j-1][j-1] = temp;
					}
				}		
			}
		}
		//---------------------------------4th Function Question 3 Chapter 8----------------------------------------------//
		public static char[] SortingTheString (String stringToSort){

			char temp;
			//--------------Allocate A New Array in Order To Convert The String And implement It In This Array------------//
			char[] stringArray = new char[stringToSort.length()];
			//--------------------------------Convert The String To Array-------------------------------------------------//
			stringArray = stringToSort.toCharArray();
			
			for(int i = 0 ; i < stringArray.length ; i++){
				for(int j = stringArray.length-1 ; i < j ; j--){
					//---------------------Special Case - One Letters Is Small Or Big Or The Other Way Around------------------------//
					if(stringArray[j] >= 97 && stringArray[j-1] <= 90 || stringArray[j] <= 90 && stringArray[j-1] >= 97){
						if(stringArray[j] >= 97){
							if(stringArray[j]-32 < stringArray[j-1]){
								temp = stringArray[j];
								stringArray[j] = stringArray[j-1];
								stringArray[j-1] = temp;
							}
						}
						else if(stringArray[j] <= 90){
							if(stringArray[j]+32 < stringArray[j-1]){
								temp = stringArray[j];
								stringArray[j] = stringArray[j-1];
								stringArray[j-1] = temp;
							}
						}
					}
					//---------------------Regular Case - Both Letters Are Small Or Big------------------------//
					else if(stringArray[j] < stringArray[j-1]){
						temp = stringArray[j];
						stringArray[j] = stringArray[j-1];
						stringArray[j-1] = temp;
					}
				}
			}
			//------------Sort By Capital Letter To Lower Case Letter-----------------//
			for(int i = 0 ; i < stringArray.length ; i++){
				for(int j = stringArray.length-1 ; j > i ; j--){
					if(stringArray[j] < stringArray[j-1] && stringArray[j]+32 == stringArray[j-1]){
						temp = stringArray[j];
						stringArray[j] = stringArray[j-1];
						stringArray[j-1] = temp;
					}
				}	
			}
				return stringArray;
		}
		//---------------------------------5th Function Question 4 Chapter 8----------------------------------------------//
		public static void SearchTheNumber(int[][] matrix, int x) {
			boolean found = false;
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
					if (matrix[i][j] == x) {
						System.out.printf("The Number %d Found in Row %d And Col %d\n", x, i, j);
						found = true;
					}
				}
			}
			if (!found) {
				System.out.println("We dont found your number");
			}
		}
		//---------------------------------6th Function Question 5 Chapter 8----------------------------------------------//
		public static int[][] SortTheMatrixFromTheGroungUp(int matrix[][]){
			
			int flag = matrix.length*matrix.length-1;
			int temp;
			int numToSaveFor = 0;
			int i = 0;
			int j = 0;
			
			while(flag > 0){
				
				for(i = 0 ; i < matrix.length ; i++){
					for(j = 0 ; j < matrix.length-1 ; j++){
						if(matrix[i][j] > matrix[i][j+1]){
							temp = matrix[i][j];
							matrix[i][j] = matrix[i][j+1];
							matrix[i][j+1] = temp;	
							numToSaveFor = matrix[i][j+1];
						}
					}
						if(j == matrix.length-1 && i < matrix.length-1){
							if(numToSaveFor > matrix[i+1][0]){
								temp = matrix[i+1][0];
								matrix[i+1][0] = numToSaveFor;
								matrix[i][j] = temp;
							}
						}
				}
				flag--;
			}
			
			return matrix;
		}
		
		//--------------------------------------------------------------------------------------Main-------------------------------------------------------------------------------------------//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		boolean checker = true;

		do{
			System.out.println();
			System.out.println("Hi! And Welcome to Shalev Lazarof Sorting Program\n\n"
					+ "*-Question 5 Version 1 in Chapter 7:\n"
					+ "This Question Will Print All The Kaprekar Numbers Until 10000,\n"
					+ "Version 1 Will Check All Of Them By Doing Numbers Calculations,\n"
					+ "Version 2 Will Check All Of Them By Doing Strings Calculations,\n"
					+ "<<<<<< For This Question Press 57 >>>>>>\n\n"
					+ "*-Question 1 in Chapter 8:\n"
					+ "Will Recieve Numbers And Sort Them From The Little To The Biggest\n"
					+ "<<<<<< For This Question Press 18 >>>>>>\n\n"
					+ "*-Question 2 in Chapter 8:\n"
					+ "Will Recive Matrix Size, fill The Matrix With Random Numbers And Sort The Diagonal By Size\n"
					+ "<<<<<< For This Question Press 28>>>>>>\n\n"
					+ "*-Question 3 in Chapter 8:\n"
					+ "Will Recieve String And Sort It From The Smallest Letter To The Biggest\n"
					+ "<<<<<< For This Question Press 38>>>>>>\n\n"
					+ "*-Question 4 in Chapter 8:\n"
					+ "Will Sort A Matrix Columns From Lower To Upper And Then Search For A Number in The Sorted Matrix\n"
					+ "<<<<<< For This Question Press 48 >>>>>>\n\n"
					+ "*-Question 5 in Chapter 8:\n"
					+ "Will Create A Matrix And Fill here With Random Numbers, Than A Function Will Sort The\n"
					+ "Matrix From The Smallest Number To The Biggest\n"
					+ "<<<<<<For This Question Press 58>>>>>>\n\n");
		
		System.out.printf("Please Enter The Question Number: ");
		int qNum = s.nextInt();
		
		switch(qNum){
		
		//-------Chapter 5 Question 7---------//
		case 57:{
			int[] parts = new int[2];
			long time1;
			long time2;
			long time3;
			
			time1 = System.currentTimeMillis();
			
			//----------------------------------------------By Numbers----------------------------------------------//
			for(int i = 0; i<10000 ; i++){
				if(isKaprekarXXX(i,parts)){
					System.out.printf("*** %d  (%d^2 = %d)   %d -- %d \n",i,i,i*i,parts[1],parts[0]);
				}
			}
			
			time2 = System.currentTimeMillis();
			
			//----------------------------------------------By Strings----------------------------------------------//
			System.out.printf("\n\n");
			for(int i = 0 ; i< 10000 ; i++){
				if(isKaprekarXXX(i+"".length(),parts)){
					System.out.printf("*** %d  (%d^2 = %d)   %d -- %d \n",i+"".length(),i+"".length(),i+"".length()*i+"".length(),parts[1],parts[0]);
				}
			}
			
			time3 = System.currentTimeMillis();
			System.out.printf("\n\n");
	
			System.out.println("By Numbers Calculations: " +(time2-time1));
			System.out.println("By Strings Calculations: " +(time3-time1));
			
			break;
		}
		
		//-------Chapter 8 Question 1---------//
		case 18:{
			
			int howManyNumbers;
			
			//---------------Receive How Many Numbers The User Would Like To Insert---------------------//
			System.out.printf("Please enter how many numbers you would like to insert and we will sort this for you:");
			howManyNumbers = s.nextInt();
			
			int[] numbersArray = new int[howManyNumbers];
			//---------------------------Receiving The Numbers From The User---------------------------//
			System.out.printf("Please enter the Numbers:");
			for(int i=0 ; i < numbersArray.length ; i++){
				numbersArray[i] = s.nextInt();
			}
			
			//---------------Sending The Array To The Function in Order To Sort Him--------------------//
			BubbleSortFromTheEnd(numbersArray);
			System.out.printf("After Sorting:");
			for(int i = 0 ; i<numbersArray.length ; i++){
				System.out.printf("%d ", numbersArray[i]);
			}
			
		System.out.println();
		break;
		}
		
		//-------Chapter 8 Question 2---------//
		case 28:{
			
			int martixSize;
			
			System.out.printf("Please Enter The Size Of the Matrix");
			martixSize = s.nextInt();
			int[][] matrix = new int[martixSize][martixSize];
			
			//--------------------------Allocate Random Values From 10 to 1000--------------------------//
			for(int i = 0; i < martixSize ; i++){
				for(int j = 0 ; j < martixSize; j++){
					matrix[i][j] = (int)(Math.random()*(1000-10+1)+10);
				}
			}
			//---------------------------Print The Matrix before Sorting -------------------------------//
			System.out.printf("\nBefore Sorting:\n");
			for(int i = 0; i < martixSize ; i++){
				for(int j = 0 ; j < martixSize ; j++){
					System.out.printf("%4d ",matrix[i][j]);
				}
				System.out.println();
			}
			//---------------------------Sending The Matrix To The Function-----------------------------//
			sortTheMatrix(matrix);
			//---------------------------Print The Matrix After Sorting---------------------------------//
			System.out.printf("\nAfter Sorting:\n");
			for(int i = 0; i < martixSize ; i++){
				for(int j = 0 ; j < martixSize  ; j++){
					System.out.printf("%4d ",matrix[i][j]);
				}
				System.out.println();
			}
			break;
		}
		
		//-------Chapter 8 Question 3---------//
		case 38:{
			
			String stringToSort;
			
			//Receiving The String--------//
			System.out.printf("Please Enter A String: ");
			s.nextLine();
			stringToSort = s.nextLine();
			//--------------------------Create Array By The Size Of The String-------------//
			char[] StringArrayFromFunction = new char[stringToSort.length()];
			
			//-------------------------Print The String Before Sorting---------------------//
			System.out.println("Before Sorting The Letters: " + stringToSort);
			System.out.println();
			//---------------------Sending The String To The Function----------------------//
			StringArrayFromFunction = SortingTheString(stringToSort);
			//--------------------------Print The String After Sorting---------------------//
			System.out.print("After Sorting The Letters: ");
			for(int i = 0 ; i < StringArrayFromFunction.length ; i++){
				System.out.printf("%c",StringArrayFromFunction[i]);
			}
			System.out.println();
			break;
		}
		
		//-------Chapter 8 Question 4---------//
		case 48:{
			
			int sizeOfMatrix;
			int NumToSearch;
			int temp,i,j;
			int k = 0;
			
			//------------------Receive The Size Of The Matrix And The Number To Search----------------------//
			System.out.printf("Please Enter The Size Of The Matrix, The Softwere Will Generate Numbers: ");
			sizeOfMatrix = s.nextInt();
			System.out.printf("Please Enter The Number That You Would Like To Search In The Matrix: ");
			NumToSearch = s.nextInt();
			
			//--------------------------Allocate The Matrix------------------------------//
			int[][] matrix = new int[sizeOfMatrix][sizeOfMatrix];

			//--------------------Allocate Random Values From 1 to 10--------------------//
			for(i = 0; i < matrix.length ; i++){
				for(j = 0 ; j < matrix.length ; j++){
					matrix[i][j] = (int)(Math.random()*(10-1+1)+1);
				}
			}
		
			
			//------------------Print The Matrix Before Sorting The Columns--------------//
			for(i = 0; i < sizeOfMatrix ; i++){
				for(j = 0 ; j < sizeOfMatrix  ; j++){
					System.out.printf("%4d ",matrix[i][j]);
				}
				System.out.println();
				
			}
		
			
			//--------------------Sort The Columns of The Matrix-------------------------//
			while(k < matrix.length){
			for(i = 0 ; i < matrix.length-1 ; i++){
				for(j = matrix.length-1 ; j > i ; j--){
					if(matrix[j][k] < matrix[j-1][k]){
						temp = matrix[j][k];
						matrix[j][k] = matrix[j-1][k];
						matrix[j-1][k] = temp;
					}
				}
			}
			k++;
			}
			
			//----------------Print The Matrix After Sorting The Columns-----------------//
			System.out.println();
			for(i = 0; i < sizeOfMatrix ; i++){
				for(j = 0 ; j < sizeOfMatrix  ; j++){
					System.out.printf("%4d ",matrix[i][j]);
				}
				System.out.println();
			}
			System.out.println();
		//------------------------Sending The Matrix To The Function---------------------//
		SearchTheNumber(matrix,NumToSearch);
		break;
		}

		//---------Chapter 8 Question 5----------//
		case 58:{
			
			int sizeOfMatrix;
			int i,j;
			int t = 16;
			//----------------------------Receiving The Size Of The Matrix-----------------//
			System.out.printf("Please Enter The Size Of The Matrix: ");
			sizeOfMatrix = s.nextInt();
			
			//---------------------------Allocate The Matrix------------------------------//
			int[][] matrix = new int[sizeOfMatrix][sizeOfMatrix];
			
			//--------------------Allocate Random Values From 1 to 100---------------------//
			for(i = 0; i < matrix.length ; i++){
				for(j = 0 ; j < matrix.length ; j++){
					matrix[i][j] = (int)(Math.random()*(100-1+1)+1);
				}
			}
			
			//----------------------------Print Before Sorting----------------------------//
			for(i = 0; i < sizeOfMatrix ; i++){
				for(j = 0 ; j < sizeOfMatrix  ; j++){
					System.out.printf("%4d ",matrix[i][j]);
				}
				System.out.println();
			}

			//---------------------Send The Matrix To The Function------------------------//
			SortTheMatrixFromTheGroungUp(matrix);
			
			//----------------------------Print After Sorting-----------------------------//
			System.out.println();
			for(i = 0; i < sizeOfMatrix ; i++){
				for(j = 0 ; j < sizeOfMatrix  ; j++){
					System.out.printf("%4d ",matrix[i][j]);
				}
				System.out.println();
			}
			break;
		}
		
		case 0:{
			checker = false;
			break;
		}
		default:
			System.out.println("invalid number, try again please");
			break;
		}
		
		}while(checker);
	
	System.out.println("Thank You, Have a Great Day");
	}

	@SuppressWarnings("unused")
	private static int pow(int i, int letterCounter) {
		// TODO Auto-generated method stub
		return 0;
	}

}
