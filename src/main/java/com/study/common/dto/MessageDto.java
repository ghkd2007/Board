package com.study.common.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Getter
@AllArgsConstructor
public class MessageDto {
    private String message; //사용자에게 전달할 메시지
    private String redirectUrl; //리다이렉트 url
    private RequestMethod method; //
    private Map<String,Object> data;
}
