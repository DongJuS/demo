package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/api")
public class ArticleController {


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

        public void put(int id, Info info) {
            // 사용자 정보를 저장하는 HashMap을 만들어줍니다.
            Map<Integer, Info> userInfoMap = new HashMap<>();

            // 주어진 ID를 키로 사용하여 사용자 정보를 저장합니다.
            userInfoMap.put(id, info);
        }
    }

    @PutMapping("/article/{id}")
    public ResponseEntity<Info> updateUser(@PathVariable int id, @RequestBody Info info) {
        if(info.getId(id)==id){
            info.setId(id);
            info.put(id, info);
            return ResponseEntity.ok(info);
        }
        return ResponseEntity.notFound().build();
    }
        //해결
    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Long id){

    }
    @GetMapping("/Get/{id}")
    public Info getUser(@PathVariable int id, @RequestBody Info info){
        info = new Info();

//        int _id = info.getId(id);

//        if(_id == id){
//            info.setName(info.name);
//            info.setAge(info.age);
//            return info;
//        }
        info.setId(id);
        info.setAge(info.age);
        info.setName(info.name);
        return info;
    }


//    @GetMapping("Get/{id}")
//    public ResponseEntity<Info> getInf(@PathVariable int id){
//        Info info = ;
//        return new
//    };


    // GET 요청에 대한 핸들러 메서드
    @GetMapping("/article/{id}")
    public Info getArticle(@PathVariable int id) {
        // 여기에 ID를 사용하여 특정 article을 조회하는 로직을 구현합니다.
        // 예를 들어, 서비스 레이어의 getArticle 메서드를 호출하고 결과를 반환할 수 있습니다.
        return null; // 실제로는 조회된 article 객체를 반환해야 합니다.
    }

    // POST 요청에 대한 핸들러 메서드
    @PostMapping("/article")
    public void createArticle(@RequestBody Info articleInfo) {


    }
//    @GetMapping("/Get/{id}")
//    public String getUser2(@RequestParam(name = "name",Info info="info" ,required = false) String name,Info info, Model model) {
//        model.addAttribute("name", name);
//        return "introduce";
//    }


//    @PostMapping(value = "/json")
//    public Info search(@RequestBody Info info) {
//        return info;
//    }



//    @PutMapping("/article/{id}")
//    public void updateArticle(@PathVariable int id, @RequestBody Info articleInfo) {
//        // 여기에 ID를 사용하여 기존의 article을 업데이트하는 로직을 구현합니다.
//        // 예를 들어, 서비스 레이어의 updateArticle 메서드를 호출할 수 있습니다.
//        Info existingArticle = articleInfo.getId(id);
//        if (existingArticle == null) {
//            // 기존 article이 존재하지 않으면 예외 처리 또는 적절한 응답을 반환할 수 있습니다.
//            // 여기서는 간단히 404 상태 코드를 반환합니다.
//            throw new ResourceNotFoundException("Article not found with id: " + id);
//        }
//
//        // 기존 article 업데이트
//        existingArticle.setName(articleInfo.getName());
//        existingArticle.setAge(articleInfo.getAge());
//
//        // 업데이트된 article을 저장
//        articleService.updateArticle(existingArticle);
//
//    }



//    @PutMapping("/{id}")
//    public Info updateUser(@PathVariable int id, @RequestBody Info info){
//    info = new Info();
//    String age = info.age;
//    int _id = info.getId(id);
//
//    if(_id == id){
//        info.setName(info.name);
//        info.setAge(info.age);
//        return info;
//    }
//    return info;
//    info.save(info);
//
//    }
}
