package com.code;

import com.code.bean.Table;
import com.code.handler.MvcHandler;
import com.code.handler.TableHandler;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dm
 */
public class Genterator {

    public static void main(String args[]) throws Exception {
        TableHandler tableHandler = new TableHandler();
        MvcHandler mvcHandler = new MvcHandler();
        List<Table> tableList = tableHandler.getTables();
        for (Table table : tableList) {
       //   mvcHandler.executeModule(table);//0k
      //    mvcHandler.executeMapper(table);//ok
      //      mvcHandler.executeClazzMapper(table);//ok

             //            user模块对应的client接口
       //    mvcHandler.executeClient_dm_user(table);//ok
       //    mvcHandler.executeClientFallBack_dm(table);//ok

            //             xxx模块对应的provider实现
          mvcHandler.executeService_dm_user(table);//ok

        }
    }
}