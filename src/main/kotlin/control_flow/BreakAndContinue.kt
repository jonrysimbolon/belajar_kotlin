package control_flow
fun main() {
    val listOfInt = listOf(1,2,3,null,5,null,7)

    for (i in listOfInt){
        if (i == null) continue
        print(i) // 12357
    }
    println()

    for (i in listOfInt){
        if (i == null) break
        print(i) // 123
    }
    println("\n")

    loop@for (i in 1.rangeTo(10)){
        println("Outside Loop")
        println("=-=-=--=-=-=")
        for(j in 1.rangeTo(10)){
            println("Inside Loop")
            if(j > 5) break@loop
        }
    }
}