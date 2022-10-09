package pl.wiluplwolf;

class Main {
    public static void main(String[] args) {
        int[] numbers = {5, 4, 3, 1};
        int x = 2;
        Searching searching = new Searching(numbers, x);
        System.out.println(searching.isAnswear());
    }
}