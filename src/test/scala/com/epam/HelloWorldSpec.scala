package com.epam

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class HelloWorldSpec extends AnyWordSpec with Matchers {

  "Simplest test" should {
    val emptyList: List[Int] = Nil
    val nonEmptyList: List[Int] = List(1)

    "fail to get head of empty list" in {
      a[NoSuchElementException] should be thrownBy emptyList.head
    }

    "get head of non-empty list" in {
      nonEmptyList.head shouldBe 1
    }
  }

}
