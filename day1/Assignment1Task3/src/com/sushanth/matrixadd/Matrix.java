package com.sushanth.matrixadd;

public class Matrix {
	private int[][] matrix;
	private int rows,cols;
	Matrix(int rows,int cols){
		matrix=new int[rows][cols];
	}
	Matrix(){
		
	}
	
	public void display() {
		System.out.println("-------------------------------------------");
		System.out.println("Pritning the matrix given: ");
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("-------------------------------------------");
	}
	 public Matrix addMatrices(Matrix m1) {
		 int[][] result=new int[m1.matrix.length][m1.matrix[0].length];
		 Matrix m3=new Matrix();
		 for(int i=0;i<this.matrix.length;i++) {
			 for(int j=0;j<this.matrix[0].length;j++) {
				 result[i][j]=this.matrix[i][j]+m1.matrix[i][j];
			 }
		 }
		 m3.setMatrix(result);
		 m3.setRows(result.length);
		 m3.setCols(result[0].length);
		 return m3;
	 }
	 public void setMatrix(int[][] matrix) {
			this.matrix = matrix;
		}
	
	public void setRows(int rows) {
		this.rows = rows;
	}
	public void setCols(int cols) {
		this.cols = cols;
	}
	
	public int getRows() {
		return rows;
	}
	public int getCols() {
		return cols;
	}
	
}