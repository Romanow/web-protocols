package ru.romanow.protocols.soap.web;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.romanow.protocols.soap.generated.rpc.model.TestObjectRequest;
import ru.romanow.protocols.soap.generated.rpc.model.TestObjectResponse;
import ru.romanow.protocols.soap.generated.rpc.model.WebServiceRpcLiteral;

import static com.google.common.base.MoreObjects.toStringHelper;

public class RpcLiteralWebServiceClient
        implements WebServiceClient {
    private static final Logger logger = LoggerFactory.getLogger(WebServiceClient.class);

    private final WebServiceRpcLiteral webService;

    public RpcLiteralWebServiceClient(WebServiceRpcLiteral webService) {
        this.webService = webService;
    }

    @Override
    @SuppressWarnings("Duplicates")
    public void makeRequest() {
        TestObjectRequest request = new TestObjectRequest();
        request.setId(RandomUtils.nextInt(0, 1000));
        request.setSearchString(RandomStringUtils.randomAlphabetic(10));

        logger.info("Request [{}]", toStringHelper(request)
                .add("id", request.getId())
                .add("searchString", request.getSearchString())
                .toString());

        TestObjectResponse response = webService.processRequest(request);
        logger.info("Response [{}]", toStringHelper(response)
                .add("code", response.getCode())
                .add("data", response.getData())
                .toString());
    }
}
