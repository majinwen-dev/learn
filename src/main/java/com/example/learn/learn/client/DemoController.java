package com.example.learn.learn.client;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

/**
 * @Author: 马金文
 * @Date: 2021/9/3 11:06
 * @Description:
 */
@RestController
@Api(value = "soket",tags = "socket")
public class DemoController {

    @GetMapping("index")
    public ResponseEntity<String> index(){
        return ResponseEntity.ok("请求成功");
    }

    @GetMapping("page")
    public ModelAndView page(){
        return new ModelAndView("websocket");
    }

    @PostMapping("/push/{toUserId}")
    @ApiOperation("测试")
    public ResponseEntity<String> pushToWeb(String message, @PathVariable String toUserId) throws IOException, IOException {
        WebSocketServer.sendInfo(message,toUserId);
        return ResponseEntity.ok("MSG SEND SUCCESS");
    }

}
