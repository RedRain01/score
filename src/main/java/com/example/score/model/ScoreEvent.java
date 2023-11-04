package com.example.score.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName score_event
 */
@TableName(value ="score_event")
@Data
public class ScoreEvent implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 属性
     */
    private Integer property;

    /**
     * 类型
     */
    private Integer type;

    /**
     * 名称
     */
    private String eventName;

    /**
     * proportion
     */
    private Integer proportion;

    /**
     * score
     */
    private Integer score;

    /**
     * parent_id
     */
    private Long parentId;

    /**
     * level
     */
    private Integer levels;

    /**
     * goal_value
     */
    private Integer goalValue;

    /**
     * unit
     */
    private String unit;

    /**
     * state
     */
    private Integer state;

    /**
     * valid_time
     */
    private Date validTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}