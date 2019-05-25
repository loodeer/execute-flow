package com.loodeer.executeflow.flow;

import com.alibaba.fastjson.JSON;

/**
 * @author loodeer
 * @date 2019-05-26 02:47
 */
public class Stage3 implements Stage<RequestTO, ResponseTO, ContextTO> {
    @Override public void process(PipelineContent<RequestTO, ResponseTO, ContextTO> content) {
        content.getResponse().getItems().get(1).setTag("stage3 changed tag");

        System.out.println(JSON.toJSONString(content));
    }
}
