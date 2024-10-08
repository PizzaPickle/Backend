package com.example.pickle_pb.preset.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

public class PresetRequestDto {
    @Getter
    @AllArgsConstructor
    @Builder
    @NoArgsConstructor
    public static class CreatePresetRequestDto {
        private int presetGroupId;
        private String name;
        private List<CategoryDto> presetList;

        @Getter
        @AllArgsConstructor
        @Builder
        @NoArgsConstructor
        public static class CategoryDto {
            private String categoryName;
            private double categoryRatio;
            private List<ProductDto> productList;
        }

        @Getter
        @AllArgsConstructor
        @Builder
        @NoArgsConstructor
        public static class ProductDto {
            private String code;
            private String name;
            private String themeName;
            private double ratio;
        }
    }

    @Getter
    @AllArgsConstructor
    @Builder
    @NoArgsConstructor
    public static class UpdatePresetRequestDto {
        private int presetGroupId;
        private String name;
        private List<CategoryDto> presetList;

        @Getter
        @AllArgsConstructor
        @Builder
        @NoArgsConstructor
        public static class CategoryDto {
            private int categoryCompositionId;
            private String categoryName;
            private double categoryRatio;
            private List<ProductDto> productList;
        }

        @Getter
        @AllArgsConstructor
        @Builder
        @NoArgsConstructor
        public static class ProductDto {
            private int productCompositionId;
            private String code;
            private String name;
            private String themeName;
            private double ratio;
        }
    }
}
