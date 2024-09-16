package camilyed.github.io

sealed class ShelfSelectionResult {
    data class Success(val price: Double) : ShelfSelectionResult()
    data class Failure(val shelfNumber: Int) : ShelfSelectionResult() {
        val message: String
            get() = "Shelf $shelfNumber does not exist."
    }
}
