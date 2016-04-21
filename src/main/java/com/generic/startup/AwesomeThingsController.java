package com.generic.startup;

import com.generic.startup.dto.AwesomeThing;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by joco on 4/20/16.
 */
@RestController
@RequestMapping("/api/awesome-things")
@CrossOrigin(origins = "*")
public class AwesomeThingsController {

    @RequestMapping("/list")
    public List<AwesomeThing> list() {
        List<AwesomeThing> rv = new ArrayList<AwesomeThing>();
        rv.add(new AwesomeThing("AngularJS", "https://angularjs.org/", "HTML enhanced for web apps!", "angular.png"));
        rv.add(new AwesomeThing("BrowserSync", "http://browsersync.io/", "Time-saving synchronised browser testing.", "browsersync.png"));
        rv.add(new AwesomeThing("GulpJS", "http://gulpjs.com/", "The streaming build system.", "gulp.png"));
        rv.add(new AwesomeThing("Bootstrap", "http://getbootstrap.com/", "Bootstrap is the most popular HTML, CSS, and JS framework for " +
                "developing responsive, mobile first projects on the web.", "bootstrap.png"));
        return rv;
    }
}
