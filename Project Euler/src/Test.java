
public class Test {

	public static void main(String[] args) {
		Problems p = new Problems();
		// //Problem 1
		// System.out.println(p.MultiplesOf3and5(1000));
		// //Problem 2
		// System.out.println(p.EvenFibonacciNumbers(4000000));
		// //Problem 3
		// System.out.println(p.LargestPrimeFactor(600851475143L));
		// System.out.println(p.NextPrimeFactor(2));
		// //Problem 4
		// System.out.println(p.LargestPalindromProduct(3));
		// //Problem 5
		// System.out.println(p.SmallestMultiple(20));
		// //Problem 6
		// System.out.println(p.SumSquareDifference(100));
		// //Problem 7
		// System.out.println(p.GetPrimeNumberAt(10001));
		// //Problem 8
		// System.out.println(p.LargestProductInASeries(13, 
		// 		"7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843"
		// 	  + "8586156078911294949545950173795833195285320880551112540698747158523863050715693290963295227443043557"
		// 	  + "6689664895044524452316173185640309871112172238311362229893423380308135336276614282806444486645238749"
		// 	  + "3035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776"
		// 	  + "6572733300105336788122023542180975125454059475224352584907711670556013604839586446706324415722155397"
		// 	  + "5369781797784617406495514929086256932197846862248283972241375657056057490261407972968652414535100474"
		// 	  + "8216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586"
		// 	  + "1786645835912456652947654568284891288314260769004224219022671055626321111109370544217506941658960408"
		// 	  + "0719840385096245544436298123098787992724428490918884580156166097919133875499200524063689912560717606"
		// 	  + "0588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450"));		
		// //Problem 9
		// System.out.println(p.SpecialPythagoreanTriplet(1000));
		// //Problem 10
		// System.out.println(p.SummationOfPrimes(2000000));
		// //Problem 11
		// System.out.println(p.LargestProductInAGrid(4));
		// //Problem 12
		// System.out.println(p.HighlyDivisibleTriangularNumber(500));
		// //Problem 13
		// System.out.println(p.LargeSum());
		// //Problem 14
		// System.out.println(p.LongestCollatzSequence(1000000));
		// //Problem 15
		// System.out.println(p.LatticePaths(20, 0, 0));
		// //Problem 16
		// System.out.println(p.PowerDigitSum(2, 1000));
		// //Problem 17
		// System.out.println(p.NumberLetterCounts(1000));
		//Problem 18
		int[][] mat =   {{75},
						{95, 64},
						{17, 47, 82},
						{18, 35, 87, 10},
						{20, 04, 82, 47, 65},
						{19, 01, 23, 75, 03, 34},
						{88, 02, 77, 73, 07, 63, 67},
						{99, 65, 04, 28, 06, 16, 70, 92},
						{41, 41, 26, 56, 83, 40, 80, 70, 33},
						{41, 48, 72, 33, 47, 32, 37, 16, 94, 29},
						{53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14},
						{70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57},
						{91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48},
						{63, 66, 04, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31},
						{04, 62, 98, 27, 23,  9, 70, 98, 73, 93, 38, 53, 60, 04, 23}};
		System.out.println(p.MaximumPathSumI(mat, 0, 0, 0));
						



	}

}
