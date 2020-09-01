package hw11;

public class graph4 {
final static int inf = 10000;
final static int num = 5;

public static void matrix(int tri [][]) {
	System.out.println("Shortest distance between pairs: ");
	
	for (int i=0; i < num; i++) {
		for (int z = 0; z<num; z++) {
			System.out.print(tri[i] [z] + " ");
		}
		System.out.println();
	}
}

public void FloydWarshall (int tri [][]) {
	int i,z,a;
	for (a = 0; a < num; a++) {
		for (i = 0; i < num; i++) {
			for (z = 0; z < num; z++) {
				tri [i][z] = Math.min(tri[i] [z], tri[i] [a] + tri[a] [z]);
			}
		}
	}
	matrix(tri);
}

public static void main(String [] args) {
	int tri[][] = {
			{0, 3, 8, inf, -4},
			{inf, 0, inf, 1, 7},
			{inf, 4, 0, inf, inf},
			{2, inf, -5, 0, inf},
			{inf, inf, inf, 6, 0}
	};
	graph4 i = new graph4();
	
	i.FloydWarshall(tri);
}
}
