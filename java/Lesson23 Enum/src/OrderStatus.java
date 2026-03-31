public enum OrderStatus {
    NEW,
    PROCESSING,
    SHIPPED,
    DELIVERED,
    CANCELLED;

    public boolean isCompleted() {
        boolean res;
        return res = (this == DELIVERED || this == CANCELLED);
    }
}
