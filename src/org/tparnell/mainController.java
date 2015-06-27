/**
 * Created by Tommy on 6/27/2015.
 */

package org.tparnell;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
public class mainController  {

    @RequestMapping("/welcome")
    public ModelAndView helloStreams(){
        ArrayList<String> lst = new ArrayList<String>();
        lst.add("awesome");
        lst.add("awesome4");

        lst.stream()
                .filter(t-> t.contains("awesome"))
                .sorted();

        return new ModelAndView("welcome", "message", "message");
    }
}
