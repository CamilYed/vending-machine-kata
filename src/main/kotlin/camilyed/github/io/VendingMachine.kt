package camilyed.github.io

class VendingMachine {

    private val shelves = mutableMapOf<Int, Product>()

    fun addProductToShelf(shelfNumber: Int, product: Product) {
        this.shelves[shelfNumber] = product
    }

    fun selectShelf(shelfNumber: Int): ShelfSelectionResult {
        return shelves[shelfNumber]?.let { product ->
            ShelfSelectionResult.Success(product.price)
        } ?: ShelfSelectionResult.Failure(shelfNumber)
    }
}
