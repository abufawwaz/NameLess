package com.sslyxhz.module.okhttp3demo.model2.bean;

/**
 * Created by xh.zeng on 2016/11/27.
 */

public class GankHistoryDataOfSomeDay {

    /**
     * _id : 5837affa421aa91caf16ffb5
     * content : ......
     * created_at : 2016-11-25T11:28:58.530Z
     * publishedAt : 2016-11-25T11:26:00.0Z
     * rand_id : 46f50ccb-4c65-4203-af60-70f0438be810
     * title : ......
     * updated_at : 2016-11-25T11:28:58.530Z
     */

    private String _id;
    private String content;
    private String created_at;
    private String publishedAt;
    private String rand_id;
    private String title;
    private String updated_at;

    @Override
    public String toString() {
        return "GankHistoryDataOfSomeDay{" +
                "_id=" + _id +
                ", content='" + content +
                ", created_at=" + created_at +
                ", publishedAt=" + publishedAt +
                ", rand_id=" + rand_id +
                ", title=" + title +
                ", updated_at=" + updated_at +
                "}\n";
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public String getRand_id() {
        return rand_id;
    }

    public void setRand_id(String rand_id) {
        this.rand_id = rand_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }
}
