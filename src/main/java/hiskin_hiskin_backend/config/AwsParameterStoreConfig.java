package hiskin_hiskin_backend.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import software.amazon.awssdk.auth.credentials.AwsCredentialsProvider;
import software.amazon.awssdk.auth.credentials.DefaultCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.ssm.SsmClient;
import software.amazon.awssdk.services.ssm.model.GetParameterRequest;

/*
@Configuration
public class AwsParameterStoreConfig {
    @Value("${OpenAIKey}")
    private String apiKeyParameterName;

    @Bean
    public String openApiApiKey() {
        AwsCredentialsProvider credentialsProvider = DefaultCredentialsProvider.create();

        SsmClient ssmClient = SsmClient.builder()
                .region(Region.AP_NORTHEAST_2)  // AWS 리전 설정
                .credentialsProvider(credentialsProvider)
                .build();

        GetParameterRequest parameterRequest = GetParameterRequest.builder()
                .name(apiKeyParameterName)
                .withDecryption(true)  // 암호화된 값 복호화
                .build();

        return ssmClient.getParameter(parameterRequest).parameter().value();
    }
}

 */
