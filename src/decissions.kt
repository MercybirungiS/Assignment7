fun main() {
oddNumber()
    println(namesArray("Christine","Birungi","Kyolaba","Ann","Francisca"))
    serveDrinks(3)
    serveDrinks(9)
    serveDrinks(40)
    checkNumbers()

}
fun oddNumber() {
    for (number in 1..100)
    if (number % 2 == 1) {
        println(number)
    }
    }
fun namesArray(name1:String,name2:String,name3:String,name4:String,name5:String):Int {
        var names = arrayOf(name1,name2,name3,name4,name5)
        var countName=0
        for (name in names) {
            if (name.length > 5) {
                countName++
            }
        }
    return countName
    }
fun serveDrinks(age:Int){

    if(age<6){
        println("A glass of milk")
    }
    else if(age>6&&age<15){
        println("A bottle of fanta orange")
    }
    else{
        println(" A bottle of coca cola")
    }
}
fun checkNumbers(){
    for(num in 1..100){
        if(num%3 !=0 && num%5 !=0){
            println(num)
        }
        if (num%3==0){
            println("FiZZ")
        }
        if(num%5==0){
            println("BuZZ")
        }
        if (num%3==0 && num%5==0){
            println("FiZZBuZZ")
        }
    }
}