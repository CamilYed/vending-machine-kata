package camilyed.github.io

sealed class ShelfSelectionResult {
    data class Success(val price: Double) : ShelfSelectionResult()
    data class Failure(val message: String) : ShelfSelectionResult()
}