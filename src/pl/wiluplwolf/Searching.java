package pl.wiluplwolf;

class Searching {
    private boolean answear;
    private int[] numbers;
    private int x;

    public Searching(final int[] numbers, final int x) {
        this.numbers = numbers;
        this.x = x;
    }

    public boolean isAnswear() {
        answear = search(numbers, x);
        return answear;
    }

    private boolean search(int[] numbers, int x) {
        var left = 0;
        var right = numbers.length - 1;

        while(left <= right) {
            int middle = left + (right - left) / 2;
            if (numbers[middle] == x) {
                return true;
            }

            if(x < numbers[middle]) {
                left = middle + 1;
            } else if (x > numbers[middle]) {
                right = middle - 1;
            }
        }
        return false;
    }
}
