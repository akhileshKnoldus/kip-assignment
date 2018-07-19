package com.knoldus.akhilesh

import org.scalatest.FunSuite

class ListOperationSpec extends  FunSuite{
  val testObj=new ListOperation

  test("Testing For maximum in a list"){
    val actualResult=testObj.max(List(2,3,7,6,9,11))
    val expectedResult= 11
    assert(actualResult===expectedResult)
  }
  test("Testing For length a list"){
    val actualResult=testObj.length(List(2,3,7,6,9,11))
    val expectedResult= 6
    assert(actualResult===expectedResult)
  }
  test("Testing For Nth last element  in a list"){
    val actualResult=testObj.lastNth(4,List(2,3,7,6,9,11))
    val expectedResult= 7
    assert(actualResult===expectedResult)
  }
  test("Testing For minimum in a list"){
    val actualResult=testObj.min(List(2,3,7,6,9,11))
    val expectedResult= 2
    assert(actualResult===expectedResult)
  }


}
