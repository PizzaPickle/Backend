package com.example.pickle_pb.preset.entity;

import com.example.pickle_pb.presetGroup.entity.PresetGroup;
import com.example.real_common.global.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class Preset extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "preset_id")
    private int id;
    @Column(length = 255, nullable = false)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "preset_group_id")
    private PresetGroup presetGroup;

    @OneToMany(mappedBy = "preset", cascade = CascadeType.REMOVE, orphanRemoval = true)
    private List<PresetCategoryComposition> presetCategoryCompositions;

    public void updateName(String name) {
        this.name = name;
    }
}
