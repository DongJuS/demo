package com.example.demo;

import java.util.List;

public interface ServiceMapper {

    public static class Info {
        private int id;
        private String age;
        private String name;

        public int id() {
            return id;
        }
        public int getId(int id){
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
        public String getAge(String age) {
            return this.age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getName(String name) {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    Info getArticleById(int id);

    void updateArticle(Info article);

}
