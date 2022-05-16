fun main(){
    println(evenStrings(listOf("Julliet","Clare","Dora","Mercy","jj","md","ji","ss")))
    var them= heightOfPeople(listOf(7,5,7,3,10,4),"meters")
    val value=" meters"
    print(them.sum())
    println(value)
    print(them.average())
    println(value)

    var x=human("JUlliet",22,6.5,58)
    var y=human("clare",15,5.2,68)
    var z=human("Dora",30,7.5,69)
    var k=human("Mercy",21,5.1,44)
    var u=human("jj",22,9.8,70)
    var human= listOf(x,y,z,k,u)
    println(human)
    var sorted= human.sortedByDescending { human -> human.age }
    println(sorted)
    var x=humanobject("Julie",30,4.8,50)
    var y=humanobject("Cary",23,6.4,52)
    var z=humanobject("Maru",24,5.5,73)
    var humanobject= listOf(x,y,z)
    println(humanobject)

    var l=Personobject("Juliette",30,7.6,60)
    var o=Personobject("addy",44,6.4,78)
    var persons= listOf(l,o)
    println(persons.plus(humanobject))

    var f= Cars("UAD 333",100)
    var g=Cars("USE 674",60)
    var m=Cars("UAO 783",190)
    var s=Cars("UPE 290",40)
    var cars= listOf(f,g,m,s)
    println(mile(cars))


}

fun humanobject(s: String, i: Int, d: Double, i1: Int): Any {

}


fun evenStrings(names:List<String>):List<String>{

    names.forEachIndexed { index, name ->
        if (index % 2==0)
            println(name)
    }
    return names
}

fun heightOfPeople(height:List<Int>,value:String):List<Int>{
    return height

}
data class Person(var name:String,var age:Int,var height:Double,var weight:Int)

data class Personobject(var name:String,var age:Int,var height:Double,var weight:Int)

data class Cars(var registration:String,var mileage:Int)

fun mile(car: List<Cars>): Int {
    var add = 0
    car.forEach { miles ->
        miles.mileage
        add += miles.mileage
    }
    var averagesum = add / car.get()
    return averagesum
}