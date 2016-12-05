object Main {
    def main(args: Array[String]) {
        if (args.size == 0) {
            return
        }
        var end = args(0)
        try {
            var fizzBuzzList = (1 to end.toInt).toList
            fizzBuzzList.foreach(echo)
        } catch {
            case e: Exception =>
        }
    }

    def echo(value: Int) {
        if (value % 15 == 0) {
            println("Fizz Buzz")
        } else if (value % 3 == 0) {
            println("Fizz")
        } else if (value % 5 == 0) {
            println("Buzz")
        } else {
            println(value.toString)
        }
    }
}
