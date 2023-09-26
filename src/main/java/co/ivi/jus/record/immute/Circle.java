/*
 * Copyright (c) 2021, Xuelei Fan. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */

/**
 * 这是一种只读设计，通过这种设计可以有效地避免对象的状态被修改。
 * 从而导致多线性环境下的数据竞争安全。
 */
package co.ivi.jus.record.immute;

public final class Circle implements Shape {

    // 通过 final 修饰符来保证对象的状态不会被修改。
    public final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
