package hiskin_hiskin_backend.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // 모든 엔드포인트에 대해 CORS를 활성화
                .allowedOrigins("*") // 모든 도메인에서 접근 허용 (보안 상 문제가 있을 수 있으므로 실제 환경에서는 수정 필요)
                .allowedMethods("GET", "POST", "PUT", "DELETE") // 허용할 HTTP 메소드 지정
                .allowedHeaders("*"); // 모든 헤더 허용 (실제 환경에서는 필요한 헤더만 허용하는 것이 좋음)
    }
}
