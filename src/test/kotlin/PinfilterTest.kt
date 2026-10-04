package brull

import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.server.testing.*
import kotlin.test.Test
import kotlin.test.assertEquals

class PinfilterTest {
    @Test
    fun `root route returns welcome message`() = testApplication {
        application { module() }

        val response = client.get("/")

        assertEquals("Welkom bij de Brull applicatie!", response.bodyAsText())
    }
}
