package com.loodeer.executeflow.flow;

/**
 * @author loodeer
 * @date 2019-05-26 02:06
 */
public interface Stage<I, O, C> {
    void process(PipelineContent<I, O, C> content);
}
