package camilyed.github.io

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class VendingMachineTest {

    @Test
    fun `should display the correct price when a shelf is selected`() {
        // given
        val machine = VendingMachine()

        // and
        machine.addProductToShelf(
            shelfNumber = 1,
            product = Product(
                name = "Cola",
                price = 2.50
            )
        )

        // when
        val result = machine.selectShelf(1)

        // then
        assertEquals(ShelfSelectionResult.Success(2.50), result)
    }

    @Test
    fun `should return failure result when selecting non-existing shelf`() {
        // given
        val machine = VendingMachine()

        // when
        val result = machine.selectShelf(99)

        // then
        assertEquals(ShelfSelectionResult.Failure("Shelf does not exist"), result)
    }
}
