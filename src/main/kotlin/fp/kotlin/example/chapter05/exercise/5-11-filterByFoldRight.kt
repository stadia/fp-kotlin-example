package fp.kotlin.example.chapter05.exercise

import fp.kotlin.example.chapter05.FunList
import fp.kotlin.example.chapter05.funListOf

/**
 *
 * 연습문제 5-11
 *
 * filter 함수를 foldRight 함수를 사용해서 재작성 해보자.
 */

fun main(args: Array<String>) {
    val list = funListOf(1, 2, 3, 4, 5)
    require(list.filterByFoldRight { it % 2 == 0 } == funListOf(2, 4))
}

fun <T> FunList<T>.filterByFoldRight(f: (T) -> Boolean): FunList<T> = TODO()
