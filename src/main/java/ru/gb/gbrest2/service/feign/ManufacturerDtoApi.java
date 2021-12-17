package ru.gb.gbrest2.service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import ru.gb.gbrest2.dto.ManufacturerDto;

@FeignClient(url = "localhost:8456/manufacturer", value = "ManufacturerDtoApi")
public interface ManufacturerDtoApi {
    @PostMapping(produces = "application/json;charset=UTF-8", consumes = "application/json;charset=UTF-8")
    ManufacturerDto create(@RequestBody ManufacturerDto manufacturerDto);
}