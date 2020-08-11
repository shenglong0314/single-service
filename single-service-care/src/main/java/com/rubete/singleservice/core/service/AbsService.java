package com.rubete.singleservice.core.service;

import com.rubete.singleservice.core.Parameter.Parameter;
import com.rubete.singleservice.core.execute.IHandle;
import org.apache.ibatis.mapping.MappedStatement;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.concurrent.*;

public abstract class AbsService {

    private static SqlSessionTemplate sqlSessionTemplate = null;

    public static SqlSessionTemplate getSqlSessionTemplate() {
        return sqlSessionTemplate;
    }

    public static void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        AbsService.sqlSessionTemplate = sqlSessionTemplate;
    }


    public static   String getType(String id){
        MappedStatement mappedStatement = getSqlSessionTemplate().getConfiguration().getMappedStatement(id);
        return mappedStatement.getSqlCommandType().toString();
    }


    public  Object insert(String id,Object param){
        return this.sqlSessionTemplate.insert(id,param);
    }
    public  Object update(String id,Object param){
        return this.sqlSessionTemplate.update(id,param);
    }
    public  Object selectList(String id,Object param){
        return this.sqlSessionTemplate.selectList(id,param);
    }
    public  Object selectOne(String id,Object param){
        return this.sqlSessionTemplate.selectOne(id,param);
    }
    public  Object delete(String id,Object param){
        return this.sqlSessionTemplate.delete(id,param);
    }

    /**
     * 异步执行方法。
     * @param asyncHandle
     * @return
     */
    public Object AsynAction(IAsynHandle asyncHandle) throws ExecutionException, InterruptedException {
        Callable<Object> callable = new Callable<Object>() {
            @Override
            public Object call() throws Exception {
                return asyncHandle.exce();
            }
        };
        return new FutureTask<Object>(callable).get();
    }



    public abstract Object action(String id,Object parameter);
}
