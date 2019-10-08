package ua.in.szolotukhin.rs.ws.client;

import lombok.extern.slf4j.Slf4j;
import org.apache.cxf.jaxrs.client.WebClient;
import org.apache.cxf.jaxrs.client.spring.EnableJaxRsProxyClient;
import org.apache.cxf.jaxrs.client.spring.EnableJaxRsWebClient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;
import ua.in.szolotukhin.rs.ws.api.HelloService;

@Slf4j
@SpringBootApplication
@EnableJaxRsWebClient
@EnableJaxRsProxyClient
public class ClientApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ClientApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);
    }

    @Bean
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    CommandLineRunner initWebClientRunner(final WebClient webClient) {
        return args -> log.info(webClient.path("sayHello/serhij.zolotukhin").get(String.class));
    }

    @Bean
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    CommandLineRunner initProxyClientRunner(final HelloService client) {
        return args -> log.info(client.sayHello("serhij.zolotukhin"));
    }
}
