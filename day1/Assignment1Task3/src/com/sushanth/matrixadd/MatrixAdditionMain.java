package com.sushanth.matrixadd;

public class MatrixAdditionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix1= {{1,2,3},{4,5,6},{7,8,9}};
		Matrix matA=new Matrix();
		matA.setMatrix(matrix1);
		matA.setRows(matrix1.length);
		matA.setCols(matrix1[0].length);
		matA.display();
		int[][] matrix2= {{1,2,3},{4,5,6},{7,8,9}};
		Matrix matB=new Matrix();
		matB.setMatrix(matrix2);
		matB.setRows(matrix2.length);
		matB.setCols(matrix2[0].length);
		matB.display();
		Matrix m3=matA.addMatrices(matB);
		m3.display();
	}

}
