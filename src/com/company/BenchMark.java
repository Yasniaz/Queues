package com.company;
import java.util.Random;

class Benchmark {

    public static BinaryTree tree(int n){
        BinaryTree tree = new BinaryTree();
        Random rd = new Random();
        for (int i = 0; i < n; i++) {
            tree.addData(rd.nextInt(n*10000),i*4 );
        }
        return tree;
    }

    public static void benchmark(int iteration) {

        int[] nValues =
                {1000, 250, 500, 1_000, 2_000, 4_000, 8_000, 16_000, 32_000, 64_000, 128_000, 256_000};

        Random rd = new Random();

        for (int i = 0; i < nValues.length; i++) {
            long t = 0, t0, t1;
            int value = Math.abs(rd.nextInt(nValues[i]-1));
            for (int j = 0; j < iteration; j++) {

                BinaryTree tree = tree(nValues[i]);
                t0 = System.nanoTime();

                tree.addData(value, value); //lookup logn add should be n
                //tree.lookup(value);

                t1 = System.nanoTime();
                t += t1 - t0;

            }
            System.out.println(nValues[i] + "\t" + t / iteration);
        }

    }
}
