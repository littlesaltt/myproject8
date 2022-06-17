package com.sharon.score

class Student (var name:String,var englsh:Int,var math:Int){
    //var name=""
    //var english=0
    //var math=0
    init{
        println("Testing")
    }
    fun print(){  //fun=function
        //println(name+"\t"+englsh+"\t"+math+"\t")=
        println("$name\t$englsh\t$math\t${getAverage()}")//${}呼叫方法(fun)
    }
    fun getAverage():Int{
        return(englsh+math)/2
    }
}
fun main( ){
    val jack=Student("Jack",25,79)
    jack.print()
    //println(jack.math)


}