package ch.keepcalm.kotlin

import org.junit.Test

//@RunWith(SpringRunner::class)
//@SpringBootTest
class KotlinSpringBootApplicationTests {

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
