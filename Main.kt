package machine

var water = 400
var milk = 540
var beans = 120
var cups = 9
var money = 550

fun main() {
    action()
}

fun action() {
    while (true) {
        println("Write action (buy, fill, take, remaining, exit): ")
        when (readln()) {
            "buy" -> buy()
            "fill" -> fill()
            "take" -> take()
            "remaining" -> showCondition()
            "exit" -> return
        }
        println()
    }
}

fun showCondition() {
    println("\nThe coffee machine has:")
    println("$water ml of water")
    println("$milk ml of milk")
    println("$beans g of coffee beans")
    println("$cups disposable cups")
    println("$$money of money")
}

fun buy() {
    println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:")
    when (readln()) {
        "1" -> makeEspresso()
        "2" -> makeLatte()
        "3" -> makeCappuccino()
        "back" -> return
    }
}

fun makeEspresso() {
    if (water < 250 || beans < 16 || cups < 1) {
        println("Sorry, not enough water!")
    } else {
        println("I have enough resources, making you a coffee!")
        water -= 250
        beans -= 16
        cups--
        money += 4
    }
}

fun makeLatte() {
    if (water < 350 || milk < 75 || beans < 20 || cups < 1) {
        println("Sorry, not enough water!")
    } else {
        println("I have enough resources, making you a coffee!")
        water -= 350
        milk -= 75
        beans -= 20
        cups--
        money += 7
    }
}

fun makeCappuccino() {
    if (water < 200 || milk < 100 || beans < 12 || cups < 1) {
        println("Sorry, not enough water!")
    } else {
        println("I have enough resources, making you a coffee!")
        water -= 200
        milk -= 100
        beans -= 12
        cups--
        money += 6
    }
}

fun fill() {
    println("\nWrite how many ml of water you want to add:")
    water += readln().toInt()
    println("Write how many ml of milk you want to add:")
    milk += readln().toInt()
    println("Write how many grams of coffee beans you want to add:")
    beans += readln().toInt()
    println("Write how many disposable cups you want to add:")
    cups += readln().toInt()
}

fun take() {
    println("\nI gave you $$money")
    money = 0
}