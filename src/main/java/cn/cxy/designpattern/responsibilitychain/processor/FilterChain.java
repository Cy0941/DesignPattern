package cn.cxy.designpattern.responsibilitychain.processor;

import cn.cxy.designpattern.responsibilitychain.filter.Filter;
import cn.cxy.designpattern.responsibilitychain.web.Request;
import cn.cxy.designpattern.responsibilitychain.web.Response;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

/**
 * Function: 自定义 FilterChain 同时 implements Filter 即可实现 FilterChain 之间的组合
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/9/16 14:21 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */

@Setter
@Getter
public class FilterChain implements Filter {

    int index = 0;
    private ArrayList<Filter> filters = new ArrayList<Filter>();

    /**
     * 返回当前调用对象即可实现链式编程
     *
     * @param filter
     * @return
     */
    public FilterChain addFilter(Filter filter) {
        //fixme 如果 filter 为 FilterChain 可能会导致忽略某些 Filter
        if (filter instanceof FilterChain) {
            FilterChain chain = (FilterChain) filter;
            for (Filter f : chain.getFilters()) {
                this.filters.add(f);
            }
        } else {
            this.filters.add(filter);
        }
        return this;
    }

    /**
     * 调用包含Filter的doFilter方法
     *
     * @param msg
     * @return
     */
    public String doFilter(String msg) {
        String result = msg;
        for (Filter filter : filters) {
            result = filter.doFilter(result);
        }
        return result;
    }

    public void doFilter(Request request, Response response, FilterChain chain) {
        if (index == filters.size()) return;

        Filter filter = filters.get(index);

        index++;

        filter.doFilter(request, response, chain);


        //for (Filter filter : filters) {
        //    filter.doFilter(request,response,chain);
        //}
    }

}
