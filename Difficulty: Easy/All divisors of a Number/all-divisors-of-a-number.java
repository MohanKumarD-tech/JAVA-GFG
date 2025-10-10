class Solution {
    static void print_divisors(int n) {
        Set<Integer> divs = new TreeSet<>();
        for (int i = 1; i * i <= n; i++)
            if (n % i == 0) {
                divs.add(i);
                divs.add(n / i);
            }
        divs.forEach(d -> System.out.print(d + " "));
    }

    public static void main(String[] args) {
        print_divisors(20);     // 1 2 4 5 10 20
        System.out.println();
        print_divisors(21191);  // 1 21191
    }
}
