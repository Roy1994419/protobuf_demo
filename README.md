# protobuf_demo
protobuf伪代码



```
1.protobuf 接入流程
   最外层 gradle    classpath'com.google.protobuf:protobuf-gradle-plugin:0.8.13'

   模块 gradle  
       apply plugin: 'com.google.protobuf'
      
 protobuf {
    protoc {
        artifact = 'com.google.protobuf:protoc:3.11.0'
    }
    generateProtoTasks {
        all().each { task ->
            task.builtins {
                java {
                    option "lite"
                }
            }
        }
    }
}


android{
  sourceSets {
        main {
            // 定义proto文件目录
            proto {
                srcDir 'src/main/proto'
                include '**/*.proto'
            }
        }
    }
}
```








    implementation 'com.google.protobuf:protobuf-javalite:3.11.0' 


​    
​    在 settings 设置选项中 的plugins 搜索 protocol buffer editor  这个工具 用来 显示编写 protobuf语法高亮 错误问题

#####     Protobuf数据结构

| **Proto**  | **C++** | **Java**   | **Python** |
| ---------- | ------- | ---------- | ---------- |
| **double** | double  | double     | Float      |
| **float**  | float   | float      | Float      |
| **int32**  | int32   | int        | int        |
| **int64**  | int64   | long       | int/long   |
| **uint32** | uint32  | int        | int/long   |
| **uint64** | uint64  | long       | int/long   |
| **bool**   | bool    | boolean    | bool       |
| **string** | string  | String     |            |
| **bytes**  | string  | ByteString | str        |