var mag:  MutableList<item> = mutableListOf()
fun main() {
    println("show -> 1")
    println("add -> 2")
    println("remove -> 3")
    println("edit -> 4")
    println("sort -> 5")
    println("search -> 6")
    var x: Int = readLine()!!.toInt()
    when (x){
        1 -> show()
        2 -> add()
        3 -> remove()
        4 -> edit()
        5 -> sort()
        6 -> search()
        else -> println("error")
    }
}

fun show(){
    for (item in mag){
        println("${mag.indexOf(item)+1}. Name: ${item.name}, category: ${item.category}, price: ${item.price}, description: ${item.describe}")
    }
    Thread.sleep(5_000)
    main()
}
fun add(){
    println("enter product name")
    var name: String = readLine().toString()

    println("enter product category")
    var category: String = readLine().toString()

    println("enter product price")
    var price: String = readLine().toString()

    println("enter product description")
    var describe: String= readLine().toString()

  try {
      val new: item = item(name, category, price.toInt(), describe)
      mag.add(new)
      println("Item ${new.name}, has been added")
  } catch (e: NumberFormatException){
      println("add error") }
    Thread.sleep(5_000)
    main()
}
fun remove(){
    println("to delete item enter its index")
    var x = readLine()!!.toInt()
    mag.removeAt(x)
    println("success")
    main()

}
fun edit(){
    println("product index")
    var x = readLine()!!.toInt()

    println("enter product name")
    var name: String = readLine().toString()

    println("enter product category")
    var category: String = readLine().toString()

    println("enter product price")
    var price: String = readLine().toString()

    println("enter product description")
    var describe: String= readLine().toString()
    try {
        mag.elementAt(x).name = name
        mag.elementAt(x).category = category
        mag.elementAt(x).price = price.toInt()
        mag.elementAt(x).describe = describe
        println("Item ${mag.elementAt(x).name}, has been edited")
    } catch (e: NumberFormatException){
        println("edit error") }
    println("success")
    main()
}
fun sort(){
    println("if you want to sort products \n by name ->1 \n by category ->2 ")
    var x = readLine()!!.toInt()
    when (x){
        1 -> mag.sortBy { it.name }
        2 -> mag.sortBy { it.category }
    }
    println("success")
    main()
}
fun search(){
    println("what are you looking")
    var x = readLine().toString()
    val filtered = mag.filter { it.name.contains(x) }
    filtered.forEach {
        println("Name: ${it.name}, category: ${it.category}, price: ${it.price}, description: ${it.describe}")
    }
    Thread.sleep(5_000)
    main()
}

