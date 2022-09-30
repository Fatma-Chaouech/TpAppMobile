package com.example.tp0

import java.lang.Math.abs


class Rectangle {

    private lateinit var p : Point;
    private lateinit var q : Point;

    constructor(p: Point = Point(0,0), q: Point = Point(1,1)) {
        this.p = p
        this.q = q
    }

    override fun toString() : String {
        return "p=$p q=$q"
    }

    fun surface() : Int {
        return abs((p.x - q.x) *(p.y - q.y))
    }


}