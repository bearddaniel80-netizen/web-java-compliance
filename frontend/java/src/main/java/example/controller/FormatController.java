package example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/format") // Base URL path for all endpoints in this c
public class FormatController {

  private final String FOLDER = "format";

  @GetMapping("/github`")
  public String github() {
      return "forward:/" + FOLDER + "/github.html";
  }
  
  @GetMapping("/html")
  public String html() {
      return "forward:/" + FOLDER + "/html.html";
  }
  
  @GetMapping("/json")
  public String json() {
      return "forward:/" + FOLDER + "/json.html";
  }
  
  @GetMapping("/markdown")
  public String markdown() {
      return "forward:/" + FOLDER + "/markdown.html";
  }

  @GetMapping("/pdf")
  public String pdf() {
      return "forward:/" + FOLDER + "/pdf.html";
  }
}