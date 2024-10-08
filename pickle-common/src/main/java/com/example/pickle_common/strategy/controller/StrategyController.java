package com.example.pickle_common.strategy.controller;

import com.example.pickle_common.strategy.dto.CreateStrategyRequestDto;
import com.example.pickle_common.strategy.dto.CreateStrategyResponseDto;
import com.example.pickle_common.strategy.dto.ReadDetailStrategyResponseDto;
import com.example.pickle_common.strategy.dto.ReadStrategyResponseDto;
import com.example.pickle_common.strategy.service.StrategyService;
import com.example.real_common.global.common.CommonResDto;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/pickle-common/strategy")
@Validated
//@Slf4j
public class StrategyController {
    private final StrategyService strategyService;

    @PostMapping
    public ResponseEntity<CommonResDto<?>> createStrategy(@RequestHeader("Authorization") String authorizationHeader, @RequestBody @Valid CreateStrategyRequestDto createStrategyRequestDto) {
        CreateStrategyResponseDto responseDto = strategyService.postStrategy(createStrategyRequestDto, authorizationHeader);
        return ResponseEntity.status(HttpStatus.CREATED).body(new CommonResDto<>(1, "전략 생성 성공", responseDto));
    }

    @GetMapping("/{customerId}")
    public ResponseEntity<CommonResDto<?>> readStrategy(@RequestHeader("Authorization") String authorizationHeader, @PathVariable int customerId) {
        ReadStrategyResponseDto result = strategyService.readStrategy(authorizationHeader, customerId);
        return ResponseEntity.status(HttpStatus.OK).body(new CommonResDto<>(1, "전략 조회 성공", result));
    }

    @GetMapping("/pb/{strategyId}")
    public ResponseEntity<CommonResDto<?>> pbReadDetailStrategy(@PathVariable("strategyId") Integer strategyId, @RequestHeader("Authorization") String authorizationHeader) {
        ReadDetailStrategyResponseDto result = strategyService.pbReadDetailStrategy(strategyId, authorizationHeader);
        return ResponseEntity.status(HttpStatus.OK).body(new CommonResDto<>(1, "전략 상세조회 성공", result));
    }

    @GetMapping("/customer/{strategyId}")
    public ResponseEntity<CommonResDto<?>> cusReadDetailStrategy(@PathVariable("strategyId") Integer strategyId, @RequestHeader("Authorization") String authorizationHeader) {
        ReadDetailStrategyResponseDto result = strategyService.cusReadDetailStrategy(strategyId, authorizationHeader);
        return ResponseEntity.status(HttpStatus.OK).body(new CommonResDto<>(1, "전략 상세조회 성공", result));
    }
}
