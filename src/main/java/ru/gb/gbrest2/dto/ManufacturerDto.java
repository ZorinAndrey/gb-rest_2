package ru.gb.gbrest2.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ManufacturerDto {
    @JsonProperty(value = "manufacturerId")
    private Long id;
    private String name;
}
