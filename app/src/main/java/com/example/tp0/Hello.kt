package com.example.tp0

import java.lang.Math.abs

fun main(argv : Array<String> ){
    print("Hello")

    var a = arrayOf(Rectangle(),Rectangle(p = Point(1,2)),Rectangle(q = Point(2,2)),
                    Rectangle(q = Point(4,2), p = Point(8,2)))

    for (i in a){
        print("\n"+ i.surface().toString())

    }
}

fun distance( p : Point, q: Point ) : Int {
    return Math.abs(p.x - q.x) + Math.abs(p.y - q.y)
}