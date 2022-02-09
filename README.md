# Azure spring data cosmos V4 Example
---

## Configuration
- Replace the cosmos properties in the _src/main/resources/application.yml_ file.
- Create database _patient_ in your cosmos instance
- Create container _addresses_ in _patient_ database with partition key _/nation_


## Run
- Launch [CosmosAzureRunner](src/main/java/com/azure/cosmos/example/CosmosAzureRunner.java)

Following stacktrace will be logged:
```text
java.lang.NullPointerException: null
at com.azure.spring.data.cosmos.core.CosmosTemplate.applyVersioning(CosmosTemplate.java:983) ~[azure-spring-data-cosmos-3.16.0.jar:3.16.0]
at com.azure.spring.data.cosmos.core.CosmosTemplate.upsertAndReturnEntity(CosmosTemplate.java:354) ~[azure-spring-data-cosmos-3.16.0.jar:3.16.0]
at com.azure.spring.data.cosmos.repository.support.SimpleCosmosRepository.save(SimpleCosmosRepository.java:96) ~[azure-spring-data-cosmos-3.16.0.jar:3.16.0]
at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:na]
at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) ~[na:na]
at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:na]
at java.base/java.lang.reflect.Method.invoke(Method.java:566) ~[na:na]
at org.springframework.data.repository.core.support.ImplementationInvocationMetadata.invoke(ImplementationInvocationMetadata.java:72) ~[spring-data-commons-2.3.5.RELEASE.jar:2.3.5.RELEASE]
at org.springframework.data.repository.core.support.RepositoryComposition$RepositoryFragments.invoke(RepositoryComposition.java:382) ~[spring-data-commons-2.3.5.RELEASE.jar:2.3.5.RELEASE]
at org.springframework.data.repository.core.support.RepositoryComposition.invoke(RepositoryComposition.java:205) ~[spring-data-commons-2.3.5.RELEASE.jar:2.3.5.RELEASE]
at org.springframework.data.repository.core.support.RepositoryFactorySupport$ImplementationMethodExecutionInterceptor.invoke(RepositoryFactorySupport.java:550) ~[spring-data-commons-2.3.5.RELEASE.jar:2.3.5.RELEASE]
at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186) ~[spring-aop-5.2.11.RELEASE.jar:5.2.11.RELEASE]
at org.springframework.data.repository.core.support.QueryExecutorMethodInterceptor.doInvoke(QueryExecutorMethodInterceptor.java:155) ~[spring-data-commons-2.3.5.RELEASE.jar:2.3.5.RELEASE]
at org.springframework.data.repository.core.support.QueryExecutorMethodInterceptor.invoke(QueryExecutorMethodInterceptor.java:130) ~[spring-data-commons-2.3.5.RELEASE.jar:2.3.5.RELEASE]
at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186) ~[spring-aop-5.2.11.RELEASE.jar:5.2.11.RELEASE]
at org.springframework.aop.interceptor.ExposeInvocationInterceptor.invoke(ExposeInvocationInterceptor.java:95) ~[spring-aop-5.2.11.RELEASE.jar:5.2.11.RELEASE]
at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186) ~[spring-aop-5.2.11.RELEASE.jar:5.2.11.RELEASE]
at org.springframework.aop.framework.JdkDynamicAopProxy.invoke(JdkDynamicAopProxy.java:212) ~[spring-aop-5.2.11.RELEASE.jar:5.2.11.RELEASE]
at com.sun.proxy.$Proxy47.save(Unknown Source) ~[na:na]
at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:na]
at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) ~[na:na]
at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:na]
at java.base/java.lang.reflect.Method.invoke(Method.java:566) ~[na:na]
at org.springframework.aop.support.AopUtils.invokeJoinpointUsingReflection(AopUtils.java:344) ~[spring-aop-5.2.11.RELEASE.jar:5.2.11.RELEASE]
at org.springframework.aop.framework.ReflectiveMethodInvocation.invokeJoinpoint(ReflectiveMethodInvocation.java:198) ~[spring-aop-5.2.11.RELEASE.jar:5.2.11.RELEASE]
at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:163) ~[spring-aop-5.2.11.RELEASE.jar:5.2.11.RELEASE]
at org.springframework.dao.support.PersistenceExceptionTranslationInterceptor.invoke(PersistenceExceptionTranslationInterceptor.java:139) ~[spring-tx-5.2.11.RELEASE.jar:5.2.11.RELEASE]
at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186) ~[spring-aop-5.2.11.RELEASE.jar:5.2.11.RELEASE]
at org.springframework.aop.framework.JdkDynamicAopProxy.invoke(JdkDynamicAopProxy.java:212) ~[spring-aop-5.2.11.RELEASE.jar:5.2.11.RELEASE]
at com.sun.proxy.$Proxy47.save(Unknown Source) ~[na:na]
at com.azure.cosmos.example.CosmosAzureRunner.lambda$demo$1(CosmosAzureRunner.java:36) ~[classes/:na]
at org.springframework.boot.SpringApplication.callRunner(SpringApplication.java:795) ~[spring-boot-2.3.6.RELEASE.jar:2.3.6.RELEASE]
at org.springframework.boot.SpringApplication.callRunners(SpringApplication.java:779) ~[spring-boot-2.3.6.RELEASE.jar:2.3.6.RELEASE]
at org.springframework.boot.SpringApplication.run(SpringApplication.java:322) ~[spring-boot-2.3.6.RELEASE.jar:2.3.6.RELEASE]
at org.springframework.boot.SpringApplication.run(SpringApplication.java:1237) ~[spring-boot-2.3.6.RELEASE.jar:2.3.6.RELEASE]
at org.springframework.boot.SpringApplication.run(SpringApplication.java:1226) ~[spring-boot-2.3.6.RELEASE.jar:2.3.6.RELEASE]
at com.azure.cosmos.example.CosmosAzureRunner.main(CosmosAzureRunner.java:20) ~[classes/:na]
```
