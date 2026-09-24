package com.study.CP.Builder.New;

import java.time.LocalDateTime;

public class SQL {
    private String name;
    private String order;
    private String status;
    private LocalDateTime time;

    private SQL(SQLBuilder builder) {
        this.name = builder.name;
        this.order = builder.order;
        this.time = builder.time;
        this.status = builder.status;
    }

    private static class SQLBuilder{
        private String name;
        private String order;
        private String status;
        private LocalDateTime time;

        public SQLBuilder(LocalDateTime time) {
            this.name = null;
            this.status = null;
            this.order = null;
            this.time = time;
        }

        public SQLBuilder setName(String name){
            this.name = name;
            return this;
        }

        public SQLBuilder setStatus(String status){
            this.status = status;
            return this;
        }
        public SQLBuilder setTime(LocalDateTime time){
            this.time = time;
            return this;
        }
        public SQLBuilder setOrder(String order){
            this.order = order;
            return this;
        }

        public SQL build(){
            if (time == null){
                throw new IllegalArgumentException("Time required");
            }
            return new SQL(this);
        }
    }

    public static SQLBuilder builder(){
        return new SQLBuilder(LocalDateTime.now());
    }
}
