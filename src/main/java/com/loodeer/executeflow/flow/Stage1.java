package com.loodeer.executeflow.flow;

import com.alibaba.fastjson.JSON;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author loodeer
 * @date 2019-05-26 02:20
 */
public class Stage1 implements Stage<RequestTO, ResponseTO, ContextTO> {
    @Override public void process(PipelineContent<RequestTO, ResponseTO, ContextTO> content) {

        content.setResponse(new ResponseTO());
        content.setContent(new ContextTO());

        ItemTO item1 = new ItemTO();
        item1.setIid(1L);
        item1.setTag("stage1 init tag");
        ItemTO item2 = new ItemTO();
        item2.setIid(2L);
        item2.setTag("stage1 init tag");

        Map<Long, ItemTO> itemMap = new HashMap<>();
        itemMap.put(item1.getIid(), item1);
        itemMap.put(item2.getIid(), item2);
        content.getContent().setItemMap(itemMap);

        List<ItemTO> itemss = new ArrayList<>(1);
        itemss.add(item1);
        content.getContent().setItems(itemss);

        List<ItemTO> items = new ArrayList<>();
        for (Map.Entry<Long, ItemTO> entry : itemMap.entrySet()) {
            items.add(entry.getValue());
        }
        content.getResponse().setItems(items);

        System.out.println(JSON.toJSONString(content));
    }
}
