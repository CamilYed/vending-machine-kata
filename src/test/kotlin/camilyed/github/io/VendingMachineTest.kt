package camilyed.github.io

import org.junit.jupiter.api.Assertions
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
        val price: Double = machine.selectShelf(1)

        // then
        Assertions.assertEquals(2.50, price)
    }
}