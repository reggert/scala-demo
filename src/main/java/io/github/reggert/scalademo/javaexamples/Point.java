package io.github.reggert.scalademo.javaexamples;

import java.io.Serializable;


public final class Point implements Serializable {
    private final int x;
    private final int y;
    private final int z;


    public Point(final int x, final int y, final int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public Point(final int x, final int y) {
        this(x, y, 0);
    }


    public int getX() {return x;}


    public int getY() {return y;}


    public int getZ() {return z;}


    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Point that = (Point) o;
        return this.x == that.x && this.y == that.y && this.z == that.z;
    }


    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        result = 31 * result + z;
        return result;
    }


    @Override
    public String toString() {
        return String.format("Point(%d,%d,%d)", x, y, z);
    }


    public Point withX(final int newX) {
        return new Point(newX, y, z);
    }


    public Point withY(final int newY) {
        return new Point(x, newY, z);
    }


    public Point withZ(final int newZ) {
        return new Point(x, y, newZ);
    }
}
