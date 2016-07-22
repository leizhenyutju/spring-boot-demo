package base_example;

import java.sql.Connection;
import java.util.Properties;

import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.session.RowBounds;

import com.alibaba.druid.support.logging.Log;
import com.alibaba.druid.support.logging.LogFactory;

@Intercepts({ @Signature(method = "prepare", type = StatementHandler.class, args = { Connection.class }) })  
public class PageInterceptor implements Interceptor {
     
     private final static Log log = LogFactory.getLog(PageInterceptor.class);
        protected static final String SQL_END_DELIMITER = ";";  
        
 
        @Override
 
        public Object intercept(Invocation invocation) throws Throwable {
 
           StatementHandler statementHandler = (StatementHandler)invocation.getTarget();
 
           BoundSql boundSql = statementHandler.getBoundSql();
 
           MetaObject metaStatementHandler = MetaObject.forObject(statementHandler, null, null, null);
 
           RowBounds rowBounds = (RowBounds)metaStatementHandler.getValue("delegate.rowBounds");
 
           if(rowBounds ==null|| rowBounds == RowBounds.DEFAULT){
 
               return invocation.proceed();
 
           }
 
           String originalSql = (String)metaStatementHandler.getValue("delegate.boundSql.sql");
 
           metaStatementHandler.setValue("delegate.boundSql.sql",getLimitString(originalSql, rowBounds.getOffset(), rowBounds.getLimit()) );
 
           metaStatementHandler.setValue("delegate.rowBounds.offset", RowBounds.NO_ROW_OFFSET);
 
           metaStatementHandler.setValue("delegate.rowBounds.limit", RowBounds.NO_ROW_LIMIT);
 
           if(log.isDebugEnabled()){
 
               log.debug("生成分页SQL : "+ boundSql.getSql());
 
           }
 
           return invocation.proceed();
 
        }
 
      
 
        @Override
 
        public Object plugin(Object target) {
 
           return Plugin.wrap(target, this);
 
        }
 
      
 
        @Override
 
        public void setProperties(Properties properties) {
 
        }
         
        public String getLimitString(String sql, int offset, int limit) {  
            sql = trim(sql);  
            StringBuffer sb = new StringBuffer(sql.length() + 20);  
            sb.append(sql);  
            if (offset > 0) {  
                sb.append(" limit ").append(offset).append(',').append(limit)  
                        .append(SQL_END_DELIMITER);  
            } else {  
                sb.append(" limit ").append(limit).append(SQL_END_DELIMITER);  
            }  
            return sb.toString();  
        }  
 
        private String trim(String sql) {  
            sql = sql.trim();  
            if (sql.endsWith(SQL_END_DELIMITER)) {  
                sql = sql.substring(0, sql.length() - 1 
                        - SQL_END_DELIMITER.length());  
            }  
            return sql;  
        }  
       
 
      
}