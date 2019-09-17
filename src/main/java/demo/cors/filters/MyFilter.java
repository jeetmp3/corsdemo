package demo.cors.filters;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author Jitendra Singh.
 */
public class MyFilter implements Filter {

    @Override
    public void init( FilterConfig filterConfig ) throws ServletException {
        System.out.println("=============================================" );
        System.out.println( "=      ENV CONFIG = "+filterConfig.getInitParameter( "TEST" ) );
        System.out.println("=============================================" );
    }

    public MyFilter(String name) {
        System.out.println("=============================================" );
        System.out.println( "=      Construct CONFIG = "+name );
        System.out.println("=============================================" );
    }

    @Override
    public void doFilter( ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain ) throws IOException, ServletException {
        filterChain.doFilter( servletRequest, servletResponse );
    }

    @Override
    public void destroy( ) {

    }
}
