# dubbo_test
用于搭建dubbo的测试环境

## facade 
1.存放项目对外内容，主要为暴露网络接口与实体
## service
1.存放项目接口的实现，是dubbo的接口提供者
## web
1.对外网站，是dubbo的接口消费者
## queue
1.提供队列功能的支持
2.目前主要提供可靠消息，确保dubbo接口之间的最终一致性
## redis
1.提供对redis缓存的支持
2.目前主要功能为分布式锁