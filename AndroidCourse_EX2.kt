package study.e.androidcourse

fun main(){ //ALJAWHARA ALMADHI

//    Q1
    var counter=0;
    for(numbers in 0 ..100){
        if(counter==71)
            println("IT`S OVER 70!!")
        counter++
    }

//    Q2
    var temperature =35
    do{
        when(temperature){
            30 -> { println("it`s Hot")}
            20 -> { println("it`s Comfy")}
            15 -> { println("It`s COLD!!")}
            else->{ println("The temperature is $temperature ")}
        }// end when
        temperature--
    }while(temperature>=10)


}