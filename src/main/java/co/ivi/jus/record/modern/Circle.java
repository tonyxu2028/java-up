/*
 * Copyright (c) 2021, Xuelei Fan. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * Circle档案类,表示不可修改的透明载体。
 * Circle(double radius)等同于Circle { Circle(double radius) }的构造方法。
 */
package co.ivi.jus.record.modern;

public record Circle(double radius) implements Shape {
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
