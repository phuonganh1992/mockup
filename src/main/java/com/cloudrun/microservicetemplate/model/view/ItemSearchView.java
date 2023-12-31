package com.cloudrun.microservicetemplate.model.view;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ItemSearchView<T> {
    private List<T> list;

    @Schema(description = "Tổng số lượng bản ghi tìm kiếm")
    private Long total;
}
