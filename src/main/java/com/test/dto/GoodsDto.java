package com.test.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description:
 * User: 剑指屎山
 * Date: 2023-06-25-1:14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GoodsDto {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getChoosesize() {
        return choosesize;
    }

    public void setChoosesize(String choosesize) {
        this.choosesize = choosesize;
    }

    private String choosesize;
}
