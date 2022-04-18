package com.kocirfan.postsqlexample.controller;

import com.kocirfan.postsqlexample.dto.KisiDto;
import com.kocirfan.postsqlexample.service.KisiService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kisi")
@RequiredArgsConstructor
public class KisiController {

    private final KisiService kisiService;

    @PostMapping
    public ResponseEntity<KisiDto> kaydet(@RequestBody KisiDto kisiDto){
        return  ResponseEntity.ok(kisiService.save(kisiDto));
    }

    @GetMapping
    public ResponseEntity<List<KisiDto>> tumunuListele(){
        return ResponseEntity.ok(kisiService.getAll());
    }

}
