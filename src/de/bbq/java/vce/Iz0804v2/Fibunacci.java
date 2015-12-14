package de.bbq.java.vce.Iz0804v2;

import java.util.concurrent.RecursiveTask;

@SuppressWarnings("serial")
class Fibonacci extends RecursiveTask<Integer> {

	final int n;

	Fibonacci(int n) {
		this.n = n;
	}

	public Integer compute() {

		if (n <= 1)

			return n;

		Fibonacci f1 = new Fibonacci(n - 1);

		f1.fork();

		Fibonacci f2 = new Fibonacci(n - 2);

		return f2.compute() + f1.join(); // Line X
//		return f1.join()+f2.compute() ; // Line X replace
	}
	public Integer compute2() {

		if (n <= 1)

			return n;

		Fibonacci f1 = new Fibonacci(n - 1);

		f1.fork();

		Fibonacci f2 = new Fibonacci(n - 2);

//		return f2.compute() + f1.join(); // Line X
		return f1.join()+f2.compute() ; // Line X replace
	}

}