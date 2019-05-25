package com.loodeer.executeflow.flow;

import java.util.Collections;
import java.util.List;

/**
 * @author loodeer
 * @date 2019-05-26 02:04
 */
public class DefaultExecuteFlowImpl<I, O, C> implements ExecuteFlow<I, O> {

    private List<Stage> stageList1 = Collections.emptyList();
    private List<Stage> stageList2 = Collections.emptyList();

    @Override public O execute(I i) {

        PipelineContent<I, O, C> content = new PipelineContent<>(i);

        for (Stage stage : stageList1) {
            stage.process(content);
        }

        for (Stage stage : stageList2) {
            stage.process(content);
        }

        return content.getResponse();
    }

    public void setStageList1(List<Stage> stageList1) {
        this.stageList1 = stageList1;
    }

    public void setStageList2(List<Stage> stageList2) {
        this.stageList2 = stageList2;
    }
}
