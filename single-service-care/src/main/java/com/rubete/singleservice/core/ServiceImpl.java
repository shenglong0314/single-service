package com.rubete.singleservice.core;

import com.rubete.singleservice.core.Parameter.Parameter;
import com.rubete.singleservice.core.execute.ExecuteManage;
import com.rubete.singleservice.core.service.AbsService;
import com.rubete.singleservice.core.service.Service;
import com.rubete.singleservice.core.service.ServiceManage;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Predicate;

public class ServiceImpl implements Service {



    private ExecuteManage executeManage = new ExecuteManage();
    ExecutorService executorService = Executors.newCachedThreadPool();
    @Override
    public Object select(String id, Object obj) throws Exception {
       Callable<ResponseEntity<Object>> run =  new Callable<ResponseEntity<Object>>() {
            @Override
            public ResponseEntity call() throws Exception {
                AbsService service = ServiceManage.getInstance().getService(AbsService.getType(id));
                Parameter parameter = new Parameter().setId(id).setObj(obj).setService(service);
                executeManage.execute(parameter);
                return ResponseEntity.ok(parameter.getData());
            }
        };
        Package aPackage = this.getClass().getPackage();

                /*AbsService service = ServiceManage.getInstance().getService(AbsService.getType(id));
                Parameter parameter = new Parameter().setId(id).setObj(obj).setService(service);
                executeManage.execute(parameter);*/
        return  run;
    }

    @Override
    public <R> List<R> selectList(String id, Object obj, Predicate<R> fun) {
        return null;
    }

    @Override
    public Integer insert(String id, Object obj) {
        return null;
    }

    @Override
    public Integer update(String id, Object obj) {
        return null;
    }

    @Override
    public Integer delete(String id, Object obj) {
        return null;
    }
}
