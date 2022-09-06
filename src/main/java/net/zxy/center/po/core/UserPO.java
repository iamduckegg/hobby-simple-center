package net.zxy.center.po.core;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import net.zxy.center.po.base.BasePO;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author zx
 * @since 2022-08-24
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ApiModel(value = "用户PO", description = "UserPO")
@TableName("cc_user")
public class UserPO extends BasePO {

    /**
     * 用户id
     */
    @ApiModelProperty(value = "用户id", required = true)
    private Integer userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 状态：0-无效，1-有效
     */
    private Integer status;

}
