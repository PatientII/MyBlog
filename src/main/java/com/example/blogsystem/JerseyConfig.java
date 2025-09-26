package com.example.blogsystem;

import org.glassfish.jersey.server.ResourceConfig;
import jakarta.ws.rs.ApplicationPath;

@ApplicationPath("/api") // 定义Jersey应用的基础路径，所有资源路径会拼接在/api之后
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        // 扫描包含资源类的包（即HelloResource所在的包）
        packages("com.example.blogsystem");
    }
}