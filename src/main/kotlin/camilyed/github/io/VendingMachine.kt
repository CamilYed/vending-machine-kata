package camilyed.github.io

class VendingMachine {

    private val shelves = mutableMapOf<Int, Product>()
    
    fun addProductToShelf(shelfNumber: Int, product: Product) {
        this.shelves[shelfNumber] = product
    }

    fun selectShelf(i: Int): Double {
        return shelves[i]?.price ?: 0.0
    }
}
