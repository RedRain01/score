package com.example.score.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.score.model.ScoreEvent;
import com.example.score.service.ScoreEventService;
import com.example.score.mapper.ScoreEventMapper;
import org.springframework.stereotype.Service;

/**
* @author wanghy
* @description 针对表【score_event】的数据库操作Service实现
* @createDate 2023-11-04 18:24:09
*/
@Service
public class ScoreEventServiceImpl extends ServiceImpl<ScoreEventMapper, ScoreEvent>
    implements ScoreEventService{

}




