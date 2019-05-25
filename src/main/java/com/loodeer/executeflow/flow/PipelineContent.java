package com.loodeer.executeflow.flow;

/**
 * @author loodeer
 * @date 2019-05-26 02:06
 */
public class PipelineContent<I, O, C> {
    /**
     * 保存入参
     */
    private I request;
    /**
     * 保存结果
     */
    private O response;
    /**
     * 保存中间上下文信息
     */
    private C content;

    public PipelineContent(I request) {
        this.request = request;
    }

    public I getRequest() {
        return request;
    }

    public void setRequest(I request) {
        this.request = request;
    }

    public O getResponse() {
        return response;
    }

    public void setResponse(O response) {
        this.response = response;
    }

    public C getContent() {
        return content;
    }

    public void setContent(C content) {
        this.content = content;
    }
}
