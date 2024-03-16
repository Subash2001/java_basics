package com.subash.maths;

public class Seive {
    public static void main(String[] args) {
        // time complexity : (n * log (log n))
        int n = 40;
        boolean [] prime = new boolean[n+1]; // eg : 40 : 39 - so (n + 1) 39+1
        sieve(n, prime);

    }
    // false in array means number is prime
    static void sieve(int n, boolean [] prime){
        for (int i = 2; i*i <= n ; i++) {
            if (!prime[i]){
                for (int j = i*2; j <=n ; j+=i) {
                    prime[j] = true;
                }
            }
        }
        for (int i = 2; i <=n ; i++) {
            if (!prime[i]){
                System.out.print(STR."\{i} ");
            }
        }
    }
}
