package com.lizy.web.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.lizy.share.entity.Permission;
import com.lizy.share.entity.Role;
import com.lizy.share.entity.User;
import com.lizy.share.enums.IsDelEnum;
import com.lizy.share.mapper.RoleMapper;
import com.lizy.share.mapper.UserMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMyBatis {
   @Autowired
   private UserMapper userMapper;
   @Autowired
   private RoleMapper roleMapper;
   /**
    * 新增用户
    * @throws Exception
    */
    @Test   
    public void test() throws Exception {
       User user=new User();
       user.setCreateTime((long)1);
       user.setIsDel((byte)0);
       user.setLoginName("hhsad");
       user.setLoginTime((long)1);
       user.setMobile("1886243255");
       user.setName("name is lizy");
       user.setPassword("hdasjdas");
       user.setRemark("备注001");
       user.setUpdateTime((long)1);
       userMapper.insertSelective(user);
    }
    /**
     * 读取用户及对应角色
     * @throws Exception
     */
    @Test   
    public void test2() throws Exception {
      User user=new User();
      user.setIsDel(IsDelEnum.Normal.getIsDel());
      user.setMobile("21");
      user.setPassword("21");
     // User users=userMapper.getUserAndRolesByMobileAndPassword(user);
      System.out.println("=");
    }
    /**
     * 获取角色对应的权限
     * @throws Exception
     */
    @Test   
    public void test3() throws Exception {
      User user=new User();
      user.setIsDel(IsDelEnum.Normal.getIsDel());
      user.setMobile("21");
      user.setPassword("21");
      //User users=userMapper.getUserAndRolesByMobileAndPassword(user);
      /*for (Role roleItem : users.getRoles()) {
    	  
    	  List<Permission> permissions=roleMapper.getPermissionByRole(roleItem);
    	  int i=0;
		
	  }*/
      System.out.println("===");
    }
    
    
   


}