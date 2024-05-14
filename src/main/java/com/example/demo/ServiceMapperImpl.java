//package com.example.demo;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class ServiceMapperImpl implements ServiceMapper{
//
//    @Override
//    public Info getArticleById(int id) {
//        // 실제로는 데이터베이스에서 해당 ID의 article을 조회하는 로직을 구현해야 합니다.
//        // 여기서는 단순히 repository를 호출하는 예시를 들었습니다.
//        return articleRepository.findById(id).orElse(null);
//    }
//
//    @Override
//    public void updateArticle(Info article) {
//        // 실제로는 데이터베이스에 업데이트된 article을 저장하는 로직을 구현해야 합니다.
//        // 여기서는 단순히 repository를 호출하여 저장하는 예시를 들었습니다.
//        articleRepository.save(article);
//    }
//
//}
