package com.example.pickle_pb.preset.entity;

import com.example.real_common.global.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class PresetCategoryComposition extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_composition_id")
    private int id;
    @Column(length = 30, nullable = false)
    private String categoryName;
    private double categoryRatio;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "preset_id")
    private Preset preset;

    @OneToMany(mappedBy = "categoryComposition", cascade = CascadeType.REMOVE, orphanRemoval = true)
    private List<PresetProductComposition> presetProductCompositions;

    public void updateCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void updateCategoryRatio(double categoryRatio) {
        this.categoryRatio = categoryRatio;
    }
}
