package net.zxy.center.po.core;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import net.zxy.center.po.base.BasePO;

/**
 * <p>
 * 字典管理
 * </p>
 *
 * @author zx
 * @since 2022-08-25
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("cc_dict")
public class DictPO extends BasePO {

    private static final long serialVersionUID = 1L;

    /**
     * 字典ID
     */
    @TableId(value = "dict_id", type = IdType.AUTO)
    private Long dictId;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 分类
     */
    private String type;

    /**
     * 类名
     */
    private String name;

    /**
     * 编码
     */
    private String code;

    /**
     * 标签
     */
    private String label;

    /**
     * 备注
     */
    private String remark;

    /**
     * 状态：0-无效，1-有效
     */
    private Integer status;


}
