package demo.cors.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * @author Jitendra Singh.
 */
@RestController
@RequestMapping( "/" )
public class ApiController {

    @RequestMapping( method = RequestMethod.GET, value = "/" )
    public ResponseEntity< String > sayHello( @RequestParam( value = "name" ,required = false) String name ) {

        Arrays.stream( Thread.currentThread().getStackTrace() )
                .forEach( e -> System.out.println( e.getClassName()+"#"+e.getMethodName()) );
        return ResponseEntity.ok( "Hello " + name + "! Welcome in Spring with XML" );
    }
}
