package com.tintachina.experimental.compliment.domain;

import java.math.BigInteger;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.Value;

@Value
@AllArgsConstructor
public class Point {

    @NonNull
    private final BigInteger amount;


    public boolean isPositiveOrZero() {
		return this.amount.compareTo(BigInteger.ZERO) >= 0;
	}

	public boolean isNegative() {
		return this.amount.compareTo(BigInteger.ZERO) < 0;
	}

	public boolean isPositive() {
		return this.amount.compareTo(BigInteger.ZERO) > 0;
	}

	public boolean isGreaterThanOrEqualTo(Point point) {
		return this.amount.compareTo(point.amount) >= 0;
	}

	public boolean isGreaterThan(Point point) {
		return this.amount.compareTo(point.amount) >= 1;
	}

    public static Point of(long value) {
		return new Point(BigInteger.valueOf(value));
	}

	public static Point add(Point a, Point b) {
		return new Point(a.amount.add(b.amount));
	}

	public Point minus(Point point){
		return new Point(this.amount.subtract(point.amount));
	}

	public Point plus(Point point){
		return new Point(this.amount.add(point.amount));
	}

	public static Point subtract(Point a, Point b) {
		return new Point(a.amount.subtract(b.amount));
	}

	public Point negate(){
		return new Point(this.amount.negate());
	}
}
