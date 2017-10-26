package com.maltebucksch.kotlinfeaturesintro

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Created by Malte Bucksch on 26/10/2017.
 */

class WhenTests {
    @Test
    fun testReceivedCorrectAmountOfMoney() {
        assertEquals(giveDuplonesToPirate(0), "Wo ist dein Geld?")
        assertEquals(giveDuplonesToPirate(2), "Zu wenig, du Landratte!")
        assertEquals(giveDuplonesToPirate(4), "Deal")
        assertEquals(giveDuplonesToPirate(100), "Arr! Deal")
    }

    private fun giveDuplonesToPirate(duploneAmount: Int): String {
        return when (duploneAmount) {
            0 -> "Wo ist dein Geld?"
            1, 2 -> "Zu wenig, du Landratte!"
            in 3..5 -> "Deal"
            else -> "Arr! Deal"
        }
    }
}
