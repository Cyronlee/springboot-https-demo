package top.d3rc.https.controller;

import org.springframework.web.bind.annotation.*;
import top.d3rc.https.vo.ResponseVO;

@RestController
@RequestMapping
public class ApiController {

    @GetMapping("/get")
    public ResponseVO testGet() {
        String msg = "GetMapping";
        return ResponseVO.ok(msg, null);
    }

    @PostMapping("/post")
    public ResponseVO testPost() {
        String msg = "PostMapping";
        return ResponseVO.ok(msg, null);
    }

    @PutMapping("/put")
    public ResponseVO testPut() {
        String msg = "PutMapping";
        return ResponseVO.ok(msg, null);
    }

    @DeleteMapping("/delete")
    public ResponseVO testDelete() {
        String msg = "DeleteMapping";
        return ResponseVO.ok(msg, null);
    }
}
