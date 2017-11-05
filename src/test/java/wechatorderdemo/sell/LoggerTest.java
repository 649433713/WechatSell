package wechatorderdemo.sell;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author yinywf
 * Created on 2017/10/11
 */

@Slf4j
public class LoggerTest extends SellApplicationTests{

    @Test
    public void test1(){
        log.debug("debug...");
        log.info("info...");
        log.error("error...");
    }
}
