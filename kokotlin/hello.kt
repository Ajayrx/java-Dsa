fun main() {
    println("hello world ")
    println("I'm")
    println("learning")
    println("Kotlin!")

    println("no needed check \nthis"); println(" check this out")
    println("Ajay\tBala")


    println(42)

    println()
    println()

    print("Enter your name: ")
    // val name = readln()
    // print("entered name ")
    // println(name)

    var x: Int= 5
    x+=2
    println(x)
    println(sum(3,5))
    println("sum of 20 and 30 is ${sum(20,30)}")
    printsum(2,2)
    val n: String="Ajay kumar"
    println("hello $n $x "+n)
    // println("no needed check this") println(" check this out")

    val unread=20
    val read=50

    println("total msg in inbox ${unread+read}")

    println("------------------------")
    // 100 photos
    // 10 photos deleted
    // 90 photos left

    val deleated=10
    val left =90
    println("${deleated+left} Photos")
    println("$left Photos deleted")
    println("$deleated Photos left")

    println("------------------------")

    val totalphotos=100
    val deletedphotos=10
    println("$totalphotos photos \n$deletedphotos Photos deleted \n${totalphotos-deletedphotos} photos left")

    println("------------------------")
    var count=0
    count=30
    println("Count is "+count)
    println("Different print style || count is $count ")
    

    println("------------------------")
    println("ajay \"bala\"")
    
    val trip1 = 3.206
    val trip2 = 4.10
    val trip3 = 1.72
    val totalTripLength = trip1 + trip2 + trip3
    println("$totalTripLength miles left to destination")

    val notificationEnabled: Boolean=true
    println("----------NotificationEnabled $notificationEnabled")

    val notificationTurnedOff=false
    print("----------NotificationTurnedOff ")
    print("$notificationTurnedOff")

}

fun sum(a: Int,b: Int): Int {
    return a+b
}

// fun printsum(a: Int,b: Int): Unit{
fun printsum(a: Int,b: Int){         // by default Unit
    println("son of $a and $b is ${a+b}")
}