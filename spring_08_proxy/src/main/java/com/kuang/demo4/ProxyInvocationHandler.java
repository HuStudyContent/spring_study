package com.kuang.demo4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//等会我们会用这个类， 自动生成代理类！
public class ProxyInvocationHandler implements InvocationHandler {

  //被代理的接口
  private Object target;

  public void setTarget(Object target) {
    this.target = target;
  }

  //生成得到代理(固定的代理，只有你要代理的接口是变化的， 这里是target)
  public Object getProxy(){
    return Proxy.newProxyInstance(this.getClass().getClassLoader(),
            target.getClass().getInterfaces(), this);
  }

  //处理代理实例，并返回结果
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
    //动态代理的本质，就是使用反射机制实现
    log(method.getName());
    Object result = method.invoke(target, args);
    return result;
  }

  public void log(String msg){
    System.out.println("执行了"+msg+"方法");
  }

}
