import java.text.DecimalFormat

fun main() {
    // MAKES TWO FORMATS FOR MONEY AND PERCENTAGES
    val moneyFormat = DecimalFormat("#,###.00")
    val taxFormat = DecimalFormat("##.00%")

    var itemNum = 1
    var cost = 0.1
    var totalItemCost = 0.0

    println("Enter the cost of the items you are purchasing(enter 0 when finished)\n")

    // ALLOWS USER TO KEEP ADDING ITEMS UNTIL THEY EXIT BY TYPING 0
    while (cost != 0.0) {
        println("Price of item $itemNum: ")
        cost = readLine()!!.toDouble()
        totalItemCost += cost
        itemNum++
    }

    // MATH VARIABLES TO FIND THE CORRECT VALUES
    val tax = totalItemCost * .025
    val tipCost = totalItemCost * .175
    val tip = .175
    val overallCost = totalItemCost + tax
    
    // FINAL VARIABLES TO PUT CORRECT VALUES IN THE PROPER FORMAT
    val finalItemCost = moneyFormat.format(totalItemCost)
    val finalTax = moneyFormat.format(tax)
    val finalOverallCost = moneyFormat.format(overallCost)
    val finalTip = taxFormat.format(tip)
    val finalTipCost = moneyFormat.format(overallCost + tipCost)

    println("Item Cost: $$finalItemCost")
    println("Tax: $$finalTax (2.5%)")
    println("Overall Cost: $$finalOverallCost")
    println("Recommended tip: $finalTip")
    println("New cost with tip: $${finalTipCost}")
}