package wechatorderdemo.sell.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author yinywf
 * Created on 2017/10/18
 */
@RestController
@RequestMapping("/weixin")
@Slf4j
public class WeixinController {

    @GetMapping("/auth")
    public void auth(@RequestParam("code") String code){
        log.info("进入auth方法");
        log.info("code={}",code);

        String url = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=wxc15deece0c4698ac&secret=d4624c36b6795d1d99dcf0547af5443d&code=" + code + "&grant_type=authorization_code";

        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(url, String.class);
        log.info("response={}",response);
    }
}
