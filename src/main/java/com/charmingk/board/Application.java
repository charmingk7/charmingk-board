package com.charmingk.board;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing  //JPA Auditing 활성화
//스프링 부트의 자동 설정, 스프링 Bean 읽기와 생성을 모두 자동으로 설정
//이 클래스는 항상 프로젝트의 최상단에 위치해야 한다.
//main 메소드에서 내장 WAS 실행
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
