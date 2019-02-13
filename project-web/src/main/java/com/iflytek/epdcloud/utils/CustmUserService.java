package com.iflytek.epdcloud.utils;

import com.iflytek.epdcloud.dto.SysRole;
import com.iflytek.epdcloud.dto.SysUser;
import com.iflytek.epdcloud.mapper.SysUserMapper;
import com.iflytek.epdcloud.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CustmUserService implements UserDetailsService {

    @Autowired
    SysUserMapper userMapper;

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //重写loadUserByUsername 方法获得 userdetails 类型用户
        SysUser realUser = userMapper.findByUserName(username);
        if (realUser == null) {
            throw new UsernameNotFoundException("用户名不存在");
        }
        List<SimpleGrantedAuthority> authorities = new ArrayList<SimpleGrantedAuthority>();
        //用于添加用户的权限。把用户权限添加到authorities
        for (SysRole role :
                realUser.getRoles()) {
            authorities.add(new SimpleGrantedAuthority(role.getName()));
            System.out.println(role.getName());
        }
        return new org.springframework.security.core.userdetails.User(realUser.getUsername(),
                realUser.getPassword(), authorities);
    }
}
