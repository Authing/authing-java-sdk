package cn.genauth.sdk.java.dto;

import java.util.List;

/**
 * 数据资源扩展字段配置
 */
public class DnefConfig {

    /**
     * 单选扩展字段配置选项
     */
    private List<Option> options;

    public static class Option {
        /**
         * 选项值
         */
        private String value;

        public Option() {
        }

        public Option(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    public DnefConfig() {
    }

    public DnefConfig(List<Option> options) {
        this.options = options;
    }

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }
}
