package com.loodeer.executeflow.flow;

import java.util.List;
import java.util.Map;

/**
 * @author loodeer
 * @date 2019-05-26 02:31
 */
public class ContextTO {
    Map<Long, ItemTO> itemMap;
    List<ItemTO> items;

    public Map<Long, ItemTO> getItemMap() {
        return itemMap;
    }

    public void setItemMap(Map<Long, ItemTO> itemMap) {
        this.itemMap = itemMap;
    }

    public List<ItemTO> getItems() {
        return items;
    }

    public void setItems(List<ItemTO> items) {
        this.items = items;
    }
}
