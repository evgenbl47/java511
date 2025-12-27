public enum Operation {
    ADD,
    SUBTRACT,
    MULTIPLY,
    DIVIDE;

    public double apply(double a, double b) {
        switch (this) {
            case ADD -> {
                return a + b;
            }
            case SUBTRACT -> {
                return a - b;
            }
            case MULTIPLY -> {
                return a * b;
            }
            case DIVIDE -> {
                if (b == 0) {
                    return -1;
                }
                return a / b;
            }
            default -> {
                return -1;
            }
        }
    }
}
