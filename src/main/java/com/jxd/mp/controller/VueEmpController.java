package com.jxd.mp.controller;

import com.jxd.mp.model.Dept;
import com.jxd.mp.model.Emp;
import com.jxd.mp.model.Users;
import com.jxd.mp.service.IDeptService;
import com.jxd.mp.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @Author: Lk
 * @DateTime: 2020/12/24 11:08
 * @Description:
 */

@RestController
public class VueEmpController {

    @Autowired
    private IEmpService empService;

    @Autowired
    private IDeptService deptService;

    @PostMapping("/login")
    public String login(@RequestBody Users users){
        if ("admin".equals(users.getName()) && "123".equals(users.getPassword())){
            return "success";
        }else {
            return "fail";
        }
    }

   /* @GetMapping("/getEmps/{limit}/{page}")
    public Map<String,Object> getEmps(@PathVariable int limit , @PathVariable int page){
        return empService.selectEmpsWithDept(limit,page);
    }*/

   @PostMapping("/getEmps")
    public Map<String,Object> getEmps(@RequestBody Map<String,String> queryMap){
       //获取到每个查询参数
       int limit = Integer.parseInt(queryMap.get("limit"));
       int page = Integer.parseInt(queryMap.get("page"));
       String ename = queryMap.get("filter");
       return empService.selectEmpsWithDept(limit,page,ename);
   }

   @GetMapping("/getDepts")
    public List<Dept> getdepts (){
       return deptService.list();
   }

   @PostMapping("/addEmp")
    public String addemp(@RequestBody Emp emp){
       if (empService.saveOrUpdate(emp)){
           return "success";
       }else {
           return "fail";
       }
   }

   @GetMapping("/getEmpById/{empno}")
    public Emp getEmpById(@PathVariable int empno){
       Emp emp = empService.getById(empno);
       return emp;
   }

    @PostMapping("/delbatchEmp")
    public String delbatchEmp(@RequestBody List<Integer> empList){
        if (empService.removeByIds(empList)){
            return "success";
        }else {
            return "fail";
        }
    }
}
