package annotated
import decoupled.HelloWorldMessageProvider
import decoupled.MessageProvider
import decoupled.MessageRenderer
import decoupled.StandardOutMessageRenderer
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
open class HelloWorldConfiguration {
    @Bean // equivalent to <bean id="provider" class=".."/>
    open fun provider(): MessageProvider {
        return HelloWorldMessageProvider()
    }

    @Bean // equivalent to <bean id="renderer" class=".."/>
    open fun renderer(): MessageRenderer {
        val renderer: MessageRenderer = StandardOutMessageRenderer()
        renderer.messageProvider = provider()
        return renderer
    }
}