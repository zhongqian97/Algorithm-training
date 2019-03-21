import java.util.Scanner;

public class Main {
	public static int run(int t) {
		if(t == 0) return 0;
		return 1 + run(t / 2);
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		System.out.println(run(t));
	}

}
