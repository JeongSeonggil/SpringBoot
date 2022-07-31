package com.example.restfulservice.tdd;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class MembershipException extends RuntimeException {


    private final MembershipErrorResult errorResult;
}
