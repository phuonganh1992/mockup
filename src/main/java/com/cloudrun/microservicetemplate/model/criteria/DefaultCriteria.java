package com.cloudrun.microservicetemplate.model.criteria;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DefaultCriteria {
    @Schema(description = "Số lượng hiển thị bản ghi tối đa trên 1 trang")
    @NotNull
    private Integer size;

    @Schema(description = "Số trang")
    private Integer page;

    @Schema(description = "Sắp xếp, ex: sort=fullName:desc")
    private String sort;
}
