package com.woo.springwebservice.web;

import com.woo.springwebservice.domain.PostRepository;
import com.woo.springwebservice.domain.PostsSaveRequestDto;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class WebRestController {

    private PostRepository postRepository;

    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }

    @PostMapping("/posts")
    public void savePosts(@RequestBody PostsSaveRequestDto dto){
        postRepository.save(dto.toEntity());
    }

}
