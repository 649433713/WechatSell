package wechatorderdemo.sell.form;

import lombok.Data;

/**
 * @author yinywf
 * Created on 2017/10/16
 */
@Data
public class CategoryForm {

    private Integer categoryId;

    /** 类目名字. */
    private String categoryName;

    /** 类目编号. */
    private Integer categoryType;
}
