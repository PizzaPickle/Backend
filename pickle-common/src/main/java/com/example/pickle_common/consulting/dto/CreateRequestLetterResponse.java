package com.example.pickle_common.consulting.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class CreateRequestLetterResponse {
    private int requestLetterId;
}
