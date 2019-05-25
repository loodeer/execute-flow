package com.loodeer.executeflow.flow;

import com.alibaba.fastjson.JSON;

/**
 * @author loodeer
 * @date 2019-05-26 02:47
 */
public class Stage2 implements Stage<RequestTO, ResponseTO, ContextTO> {
    @Override public void process(PipelineContent<RequestTO, ResponseTO, ContextTO> content) {
        content.getResponse().getItems().get(0).setTag("stage2 changed tag");

        System.out.println(JSON.toJSONString(content));
    }
}
