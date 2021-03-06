package ru.romanow.protocols.soap;

import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.romanow.protocols.soap.web.WebServiceClient;

@AllArgsConstructor
@SpringBootApplication
public class SoapClientApplication
        implements CommandLineRunner {
    private final WebServiceClient documentEncodedWebServiceClient;
    private final WebServiceClient documentLiteralWebServiceClient;
    private final WebServiceClient rpcLiteralWebServiceClient;

    public static void main(String[] args) {
        SpringApplication.run(SoapClientApplication.class, args);
    }

    @Override
    public void run(String... args) {
        documentEncodedWebServiceClient.makeRequest();
        documentLiteralWebServiceClient.makeRequest();
        rpcLiteralWebServiceClient.makeRequest();
    }
}
