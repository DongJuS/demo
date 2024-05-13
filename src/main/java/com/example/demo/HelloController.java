package com.example.demo;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;



@Controller
public class HelloController {

    @ResponseBody
    @GetMapping("/hello")
    public String hello() {
        return "hello World";
    }

    @GetMapping("/hello2")
    public String hello2() {
        return "hello";
    }

    @GetMapping("/introduceCtVer")
    public String intro() {
        return "introduceCtV";
    }


//    @GetMapping("/introduce")
//    public String intro_N(@RequestParam String name) {
//
//        return name;
//    }

    @GetMapping("/introduce")
    public String intro2(@RequestParam(name = "name", required = false) String name, Model model) {
        model.addAttribute("name", name);
        return "introduce";
    }
//    @ResponseBody
//    @PostMapping(value = "/json")
//    public Info postMethod(@RequestParam("age")String age, @RequestParam("name") String name ) {
//        Info info = new Info();
//        info.setAge(age);
//        info.setName(name);
//        return info;
//    }

    //    @ResponseBody
//    @PostMapping(value = "/json")
//    public String postMethod(@RequestBody Info info ) {
//        System.out.println("id = " + info.age);
//        System.out.println("name = " + info.name);
//        return info.toString();
//    }


    @GetMapping("/check")
    public Map<String, Object> getAllUsers(@RequestBody Info info){
        Map<String, Object> mp = new HashMap<>();
        mp.put("aaa",info.getName());
        return mp;
    }
    @PostMapping("/insert/{name}")
    public Map<String, String> insertInfo(@PathVariable("name") String name, String age , Info info){
        Map<String, String> mp = new HashMap<>();
        Info inf = new Info();
        inf.setName(name);
        mp.put(age,name);

        return mp;
    }

//    @GetMapping("/{name}")
//    public Map<String, String> getUser(@PathVariable("name") Info name){
//        return
//    }
    @PutMapping("/{name}")
    public void updateUser(@PathVariable String name, @RequestBody Info info){

        Map<String, String> mp = new HashMap<>();
        mp.put("apple", "kiwi");
        mp.put("banana", "kiwi");
        mp.put("kiwi", "kiwi");
        mp.forEach((key, value) -> System.out.println(key+value));

        updateUser(name,info);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Long id){

    }

    @PostMapping(value = "/json")
    public Info search(@RequestBody Info info) {
        return info;
    }

    public static class Info {
        private String age;
        private String name;

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    @PostMapping(value = "/postMethod")
    public SearchParam postMethod(@RequestBody SearchParam searchParam){
//RequestBody로 지정해줘야 함.
        return searchParam;
    }

    public static class SearchParam {

        private String account;
        private String email;
        private int page;



        public String getAccount() {
            return account;
        }

        public void setAccount(String account) {
            this.account = account;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public int getPage() {
            return page;
        }

        public void setPage(int page) {
            this.page = page;
        }
    }
}

    @GetMapping("/article/{id}")
    public void find(@PathVariable String id){

    }


// /introduce로 요청했을때 자기소개가 작성되어있는 HTML을 반환하기
// 등등.