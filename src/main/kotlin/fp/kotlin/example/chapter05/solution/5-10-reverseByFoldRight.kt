package fp.kotlin.example.chapter05.solution

import fp.kotlin.example.chapter05.FunList
import fp.kotlin.example.chapter05.foldRight
import fp.kotlin.example.chapter05.funListOf

/**
 *
 * 연습문제 5-10
 *
 * reverse 함수를 foldLeft 함수를 사용해서 재작성 해보자.
 */

fun main(args: Array<String>) {
    val list = funListOf(1, 2, 3, 4, 5)
    require(list.reverseByFoldRight() == funListOf(5, 4, 3, 2, 1))
}

fun <T> FunList<T>.reverseByFoldRight(): FunList<T> = this.foldRight(FunList.Nil as FunList<T>) { value, acc ->
    acc.appendTail(value)
}
