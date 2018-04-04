package ch.keepcalm.kotlin

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.HttpStatus
import org.springframework.test.context.junit4.SpringRunner


@RunWith(SpringRunner::class)
@SpringBootTest(classes = arrayOf(KotlinSpringBootApplication::class),
		webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class KotlinSpringBootApplicationTests {

	@Autowired
	lateinit var testRestTemplate: TestRestTemplate

	@Test
	fun whenCalledShouldReturnHello() {
		val result = testRestTemplate
				// ...
				.getForEntity("/greeting", String::class.java)

		assertNotNull(result)
		assertEquals(result?.statusCode, HttpStatus.OK)
		val resultExpected = "{\"id\":1,\"content\":\"Hello, World\"}"
		assertEquals(result?.body, resultExpected)
	}


	@Test
	fun contextLoads() {
		var num1 = 45.0
		println("The value of num1 is $num1")
		num1++
		println("The new value of num1 is $num1")

		val num2:Double = 5.toDouble()
		println("The value of num2 is $num2")
	}

}
