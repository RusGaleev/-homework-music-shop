fun main (){
    val regularCustomer = false
    val purchaseAmount = 101000_00 // Amount in cents
    println("покупка - ${purchaseAmount/100} рублей →")
    println("после применения скидок ${calcDiscount(regularCustomer, purchaseAmount)/100} рублей")
}
fun calcDiscount(regularCustomer:Boolean, purchaseAmount:Int): Int {
    if (purchaseAmount < 0) return 0
    var purchaseDiscount:Int = when(purchaseAmount){
        in 0 until 1001_00 -> {
            purchaseAmount
        }
        in 1001_00 until 10_001_00 -> {
            purchaseAmount - 100_00
        }
        else -> {
            (purchaseAmount*0.95).toInt()
        }
    }
    return if(regularCustomer){
        purchaseDiscount*1.01.toInt()
    } else {
        purchaseDiscount.toInt()
    }
}