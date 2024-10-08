package com.example.pickle_pb.pb.dto;

import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class pbProfileResponseDto {
    private String pbNumber;
    private String username;
    private String phoneNumber;
    private String branchOffice;

    private String img;

    private String email;
    private String introduction;
    private int consultingCount;
    private int transactionCount;
    private Long minConsultingAmount;

    private List<String> mainFields;

    private List<String> tags;

}
