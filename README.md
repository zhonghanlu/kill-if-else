# kill-if-else

### 使用
#### 函数式方法减少if-else
#### 设计模式方式减少if-else  //下次上传
#### ....减少if-else
## API
### 返回报错信息
```java
Boolean flag = false;
KIfUtill.isTure(flag).throwMessage("我是个可爱的报错信息");
```
### 处理分支
```java
Boolean flag = false;
KIfUtill.isTureOrFalse(flag).trueOrFalseHandle(() -> {
            System.out.println("我是正确信息输出~~~~~");
        }, () -> {
            System.out.println("我是错误信息输出=====");
        });
```
### 返回报错信息
```java
String str = "滴滴";
KIfUtill.isBlankOrNoBlank(str).presentOrElseHandle(System.out::println,
        () -> {
            System.out.println("我是空字符串");
        });
```

