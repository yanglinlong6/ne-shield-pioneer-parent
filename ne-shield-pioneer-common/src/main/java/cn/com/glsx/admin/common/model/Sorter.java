package cn.com.glsx.admin.common.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 排序
 *
 * @author xiangyanlin
 * @date 2022/6/30
 */
@Data
public class Sorter implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 字段名
     */
    private String filed;

    /**
     * 排序方式 AEC or DESC
     */
    private String order;
}
