/**
 * Magic Square
 *
 * @author Marc Oliveras <admin@oligalma.com> 
 * @link http://www.oligalma.com
 * @copyright 2019 Oligalma
 * @license GPL License v3
 */

import java.util.Scanner;

public class MagicSquare
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		int length = 0, row, column;

		do
		{
			System.out.print("Type the length of the square (odd number): ");
			try {
				length = Integer.parseInt(scanner.nextLine());
			} catch (Exception e) {}
		}
		while (length % 2 == 0 || length <= 1);

		scanner.close();
		
		System.out.println("");

		// Filling the matrix with the right numbers
		int matrix[][] = new int[length][length];
		row = length / 2 - 1;
		column = length / 2;
		matrix[row][column] = 1;

		for (int i = 2; i <= length * length; i++)
		{
			if (row == 0 && column == length - 1)
				row = length - 2;
			else if (row != 0 && column != length - 1 && matrix[row - 1][column + 1] == 0) {
				row = row - 1;
				column = column + 1;
			} 
			else if (row == 0 && column != length - 1) {
				row = length - 1;
				column = column + 1;
			} 
			else if (column == length - 1 && row != 0) {
				row = row - 1;
				column = 0;
			}
			else if (matrix[row - 1][column + 1] != 0 && row != 1 && column != length - 1)
				row = row - 2;
			else if (matrix[row - 1][column + 1] != 0 && row == 1 && column != length - 1)
				row = length - 1;

			matrix[row][column] = i;
		}

		// Painting the magic square
		System.out.print("*");
		repeat('*', length * digitCount(length * length) + 3 * (length - 1) + 2);
		System.out.print("*\n");
		
		for (row = 0; row < length; row++)
		{
			for (column = 0; column < length; column++)
			{
				if (column == 0)
					System.out.print("* ");
				
				System.out.print(matrix[row][column]);
				
				if (column != length - 1)
					repeat(' ', digitCount(length * length) - digitCount(matrix[row][column]) + 3);
				
				if (column == length - 1) {
					repeat(' ', digitCount(length * length) - digitCount(matrix[row][column]) + 1);
					System.out.print("*");
				}
			}
			System.out.println();
			
			if (row < length - 1) {
				System.out.print("*");
				repeat(' ', length * digitCount(length * length) + 3 * (length - 1) + 2);
				System.out.print("*\n");
			}
		}
		
		System.out.print("*");
		repeat('*', length * digitCount(length * length) + 3 * (length - 1) + 2);
		System.out.print("*\n");
		
		// Knowing the sum of rows, columns and diagonals
		int sum = 0;
		for(int i = 0; i < matrix.length; i++)
			sum += matrix[0][i];
			
		System.out.println("\nAll rows, columns and diagonals add " + sum);
	}

	public static int digitCount(int number)
	{
		int j = 0;

		for (;;) {
			number = number / 10;
			j++;
			if (number == 0)
				break;
		}
		return (j);
	}

	public static void repeat(char c, int i)
	{
		for (int x = 0; x < i; x++)
			System.out.print(c);
	}
}

