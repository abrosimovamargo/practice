package ru.ssau.tk.abrosimovamargo.practice.zadachi;

public class IntGeneratorImpl implements IntGenerator {
    private int count = 0;

    @Override
    public int nextInt() {
        return count++;
    }
}
