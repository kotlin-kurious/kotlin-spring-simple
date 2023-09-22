package decoupled

import org.springframework.context.ApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext

object HelloWorldSpringDI {
    @JvmStatic
    fun main(args: Array<String>) {
        val ctx: ApplicationContext =
            ClassPathXmlApplicationContext("spring/app-context.xml")
        val mr = ctx.getBean("renderer", MessageRenderer::class.java)
        mr.render()
    }
}